package info.superalsrk.model.core.dao.impl;

import info.superalsrk.model.core.dao.ForumDAO;
import info.superalsrk.model.core.entity.Forum;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component(value="forumDAO")
public class ForumDAOImpl implements ForumDAO {

	@Autowired@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	public void save(Forum forum) {
		hibernateTemplate.save(forum);
	}

	public void update(Forum forum) {
		hibernateTemplate.update(forum);
	}

	public void delete(Forum forum) {
		hibernateTemplate.delete(forum);
	}

	public Forum queryById(Integer id) {
		return hibernateTemplate.get(Forum.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Forum> loadAll() {
		String hql = "from Forum order by orderSequence";
		List <Forum> res = hibernateTemplate.find(hql);
		if(null != res && res.size() > 0) {
			return res;
		} else {
			return null;
		}
	}
	
	public int totalCount() {
		String hql = "select count(*) from Forum ";
		Long res = (Long) hibernateTemplate.find(hql).get(0);
		return res.intValue();
	}
	
	public int maxId() {
		String hql = "select max(id) from Forum";
		Object obj = hibernateTemplate.find(hql).get(0);
		
		if(null == obj) {
			return 1;
		} else {
			return (Integer) obj;
		}
	}

}
