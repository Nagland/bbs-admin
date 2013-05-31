package info.superalsrk.model.core.dao.impl;

import info.superalsrk.model.core.dao.UserDAO;
import info.superalsrk.model.core.entity.User;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;



@Component(value="userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	public void save(User user) {
		hibernateTemplate.save(user);
	}

	public void update(User user) {
		hibernateTemplate.update(user);

	}

	public void delete(User user) {
		hibernateTemplate.delete(user);
	}

	public User queryById(Integer id) {
		return hibernateTemplate.get(User.class, id);
	}

	public int totalCount(String userName) {
		StringBuffer hql = new StringBuffer();
		hql.append("select count(*) from User where ");
		if(null != userName && !userName.trim().equals("")) {
			hql.append(" userName like '%").append(userName).append("%' and ");
		}
		hql.append("1 = 1");
		
		Long res = (Long) hibernateTemplate.find(hql.toString()).get(0);
		return res.intValue();
	}

	@SuppressWarnings("unchecked")
	public List<User> queryMore(final Integer pageNum, final Integer pageSize,
			String userName) {
		final StringBuffer hql = new StringBuffer();
		hql.append("from User where ");
		if(null != userName && !userName.trim().equals("")) {
			hql.append(" userName like '%").append(userName).append("%' and ");
		}
		hql.append("1 = 1 order by id desc");
		
		List <User> res = hibernateTemplate.executeFind(new HibernateCallback <List <User> >() {
			public List <User> doInHibernate(Session session) throws HibernateException, SQLException {
				return session.createQuery(hql.toString()).setFirstResult(pageNum).setMaxResults(pageSize).list();
			}
		});
		return res;
	}
	
	@SuppressWarnings("unchecked")
	public User queryByName(String userName) {
		String hql = "from User where userName = ?";
		List <User> res = hibernateTemplate.find(hql, new Object[]{userName});
		
		if(null != res && res.size() > 0) {
			return res.get(0);
		} else {
			return null;
		}
	}

}
