package info.superalsrk.model.core.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import info.superalsrk.model.core.dao.SubforumDAO;
import info.superalsrk.model.core.entity.Subforum;


@Component(value="subforumDAO")
public class SubforumDAOImpl implements SubforumDAO {

	@Autowired
	@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void save(Subforum subforum) {
		hibernateTemplate.save(subforum);

	}

	@Override
	public void update(Subforum subforum) {
		hibernateTemplate.update(subforum);

	}

	@Override
	public void delete(Subforum subforum) {
		hibernateTemplate.delete(subforum);

	}

	@Override
	public Subforum queryById(int id) {
		return hibernateTemplate.get(Subforum.class, id);
	}

	@Override
	public List<Subforum> queryByForum(int forumid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
