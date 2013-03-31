package info.superalsrk.model.core.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import info.superalsrk.model.core.dao.ForumDAO;
import info.superalsrk.model.core.entity.Forum;

@Component(value="forumDAO")
public class ForumDAOImpl implements ForumDAO {

	@Autowired
	@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void save(Forum forum) {
		hibernateTemplate.save(forum);

	}

	@Override
	public void update(Forum forum) {
		hibernateTemplate.update(forum);

	}

	@Override
	public void delete(Forum forum) {
		hibernateTemplate.delete(forum);

	}

	@Override
	public Forum queryById(int id) {
		return hibernateTemplate.get(Forum.class, id);
		
	}

	@Override
	public List<Forum> loadAll() {
		return hibernateTemplate.loadAll(Forum.class);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
