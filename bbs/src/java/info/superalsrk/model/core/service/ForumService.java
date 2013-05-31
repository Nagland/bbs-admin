package info.superalsrk.model.core.service;

import info.superalsrk.model.core.dao.ForumDAO;
import info.superalsrk.model.core.entity.Forum;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component(value="forumService")
public class ForumService {
	
	@Autowired@Qualifier("forumDAO")
	ForumDAO forumDAO;
	
	@Transactional
	public void save(Forum forum) {
		forumDAO.save(forum);
	}
	
	@Transactional
	public void update(Forum forum) {
		forumDAO.update(forum);
	}
	
	@Transactional
	public void delete(Forum forum) {
		forumDAO.delete(forum);
	}
	
	@Transactional
	public Forum queryById(Integer id) {
		return forumDAO.queryById(id);
	}
	
	@Transactional
	public List <Forum> loadAll() {
		return forumDAO.loadAll();
	}
	
	@Transactional
	public int totalCount() {
		return forumDAO.totalCount();
	}
	
	@Transactional
	public int maxId() {
		return forumDAO.maxId();
	}
}
