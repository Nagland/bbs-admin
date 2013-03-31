package info.superalsrk.model.core.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import info.superalsrk.model.core.dao.ReplyDAO;
import info.superalsrk.model.core.entity.Reply;

@Component(value="replyDAO")
public class ReplyDAOImpl implements ReplyDAO {

	
	@Autowired
	@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void save(Reply reply) {
		hibernateTemplate.save(reply);

	}

	@Override
	public void update(Reply reply) {
		hibernateTemplate.update(reply);

	}

	@Override
	public void delete(Reply reply) {
		hibernateTemplate.delete(reply);

	}

	@Override
	public Reply queryById(String id) {
		return hibernateTemplate.get(Reply.class, id);
		
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


}
