package info.superalsrk.model.core.dao;

import java.util.List;
import org.springframework.stereotype.Component;

import info.superalsrk.model.core.entity.Subforum;

@Component
public interface SubforumDAO {
	
	public void save(Subforum subforum);
	
	public void update(Subforum subforum);
	
	public void delete(Subforum subforum);
	
	public Subforum queryById(int id);
	
	public List<Subforum> queryByForum(int forumid);
	

}
