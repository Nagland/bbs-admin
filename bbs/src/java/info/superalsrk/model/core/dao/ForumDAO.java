package info.superalsrk.model.core.dao;

import java.util.List;

import info.superalsrk.model.core.entity.Forum;

import org.springframework.stereotype.Component;

@Component
public interface ForumDAO {
	
	public void save(Forum forum);
	
	public void update(Forum forum);
	
	public void delete(Forum forum);
	
	public Forum queryById(Integer id);
	
	public List <Forum> loadAll();
	
	public int totalCount();
	
	public int maxId();
}
