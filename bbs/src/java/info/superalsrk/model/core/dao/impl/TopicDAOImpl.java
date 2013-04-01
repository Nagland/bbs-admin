package info.superalsrk.model.core.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateCallback;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Topic> queryByPage(final int pageNum, final int pageSize,
			final int subForumId) {
		final StringBuffer sql = new StringBuffer();
		sql.append("from Topic where subforum_id = ? order by postTime desc");

		List<Topic> resTopic = hibernateTemplate
				.executeFind(new HibernateCallback<List<Topic>>() {
					@Override
					public List<Topic> doInHibernate(Session session)
							throws HibernateException, SQLException {
						return session.createQuery(sql.toString())
								.setInteger(0, subForumId)
								.setFirstResult(pageNum)
								.setMaxResults(pageSize).list();
					}
				});
		return resTopic;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
