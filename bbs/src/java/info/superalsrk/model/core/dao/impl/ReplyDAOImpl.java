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

import info.superalsrk.model.core.dao.ReplyDAO;
import info.superalsrk.model.core.entity.Reply;
import info.superalsrk.model.core.entity.Topic;

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
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Reply> queryByPage(final int pageNum, final int pageSize, final String topicId) {
		// TODO Auto-generated method stub
		
		
			final StringBuffer sql = new StringBuffer();
			sql.append("from Reply where topic_id = ? order by replyTime desc");

			List<Reply> resReply = hibernateTemplate
					.executeFind(new HibernateCallback<List<Reply>>() {
						@Override
						public List<Reply> doInHibernate(Session session)
								throws HibernateException, SQLException {
							return session.createQuery(sql.toString())
									.setString(0, topicId)
									.setFirstResult(pageNum)
									.setMaxResults(pageSize).list();
						}
					});
			return resReply;
	}

	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	

}
