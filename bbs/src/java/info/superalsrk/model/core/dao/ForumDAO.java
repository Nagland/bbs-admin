package info.superalsrk.model.core.dao;

import info.superalsrk.model.core.entity.Forum;

import java.util.List;
import org.springframework.stereotype.Component;



@Component
public interface ForumDAO {
	public void save(Forum forum);
	
	public void update(Forum forum);
	
	public void delete(Forum forum);
	
	public Forum queryById(int id);
	
	public List<Forum> loadAll();
	
}
