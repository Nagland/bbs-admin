package info.superalsrk.model.core.dao.impl;

import info.superalsrk.model.core.dao.SubforumDAO;
import info.superalsrk.model.core.entity.Subforum;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component(value="subforumDAO")
public class SubforumDAOImpl implements SubforumDAO {

	@Autowired@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	public void save(Subforum subforum) {
		hibernateTemplate.save(subforum);
	}

	public void update(Subforum subforum) {
		hibernateTemplate.update(subforum);
	}

	public void delete(Subforum subforum) {
		hibernateTemplate.delete(subforum);
	}

	public Subforum queryById(Integer id) {
		return hibernateTemplate.get(Subforum.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Subforum> loadAll() {
		String hql = "from Subforum order by orderSequence";
		List <Subforum> res = hibernateTemplate.find(hql);
		if(null != res && res.size() > 0) {
			return res;
		} else {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List <Subforum> loadByForum(Integer id) {
		String hql = "from Subforum where forumId = ? order by orderSequence";
		List <Subforum> res = hibernateTemplate.find(hql, new Object[]{id});
		if(null != res && res.size() > 0) {
			return res;
		} else {
			return null;
		}
	}

	public int maxId() {
		String hql = "select max(id) from Subforum";
		Object obj = hibernateTemplate.find(hql).get(0);
		if(null == obj) {
			return 1;
		} else {
			return (Integer) obj;
		}
	}

}
