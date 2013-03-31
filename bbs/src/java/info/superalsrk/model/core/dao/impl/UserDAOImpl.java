package info.superalsrk.model.core.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import info.superalsrk.model.core.dao.UserDAO;
import info.superalsrk.model.core.entity.User;

@Component(value="userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void save(User user) {
		hibernateTemplate.save(user);

	}

	@Override
	public void update(User user) {
		hibernateTemplate.update(user);

	}

	@Override
	public void delete(User user) {
		hibernateTemplate.delete(user);

	}

	@Override
	public User queryById(String id) {
		return hibernateTemplate.get(User.class, id);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


}
