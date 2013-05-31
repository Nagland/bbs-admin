package info.superalsrk.model.core.service;

import java.util.List;

import info.superalsrk.model.core.dao.SubforumDAO;
import info.superalsrk.model.core.entity.Forum;
import info.superalsrk.model.core.entity.Subforum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component(value="subforumService")
public class SubforumService {
	
	@Autowired@Qualifier("subforumDAO")
	SubforumDAO subforumDAO;
	
	@Transactional
	public void save(Subforum subforum) {
		subforumDAO.save(subforum);
	}
	
	@Transactional
	public void update(Subforum subforum) {
		subforumDAO.update(subforum);
	}
	
	@Transactional
	public void delete(Subforum subforum) {
		subforumDAO.delete(subforum);
	}
	
	@Transactional
	public Subforum queryById(Integer id) {
		return subforumDAO.queryById(id);
	}
	
	@Transactional
	public List<Subforum> loadAll() {
		return subforumDAO.loadAll();
	}
	
	@Transactional
	public List <Subforum> loadByForum(Integer id) {
		return subforumDAO.loadByForum(id);
	}
	
	@Transactional
	public int maxId() {
		return subforumDAO.maxId();
	}

}
