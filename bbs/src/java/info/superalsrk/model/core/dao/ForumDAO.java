package info.superalsrk.model.core.dao;

import java.util.List;
import org.springframework.stereotype.Component;

import info.superalsrk.model.core.entity.Forum;

@Component
public interface ForumDAO {
	public void save(Forum forum);
	
	public void update(Forum forum);
	
	public void delete(Forum delete);
	
	public Forum queryById(int id);
	
	public List<Forum> loadAll();
	
}
