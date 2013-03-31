package info.superalsrk.model.core.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import info.superalsrk.model.core.dao.TopicDAO;
import info.superalsrk.model.core.entity.Topic;

@Component(value = "topicDAO")
public class TopicDAOImpl implements TopicDAO {

	@Autowired
	@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;

	@Override
	public void save(Topic topic) {
		hibernateTemplate.save(topic);

	}

	@Override
	public void update(Topic topic) {
		hibernateTemplate.update(topic);

	}

	@Override
	public void delete(Topic topic) {
		hibernateTemplate.delete(topic);

	}

	@Override
	public Topic queryById(String id) {
		return hibernateTemplate.get(Topic.class, id);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
