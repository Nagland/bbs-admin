package info.superalsrk.model.core.dao;

import info.superalsrk.model.core.entity.Subforum;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface SubforumDAO {
	public void save(Subforum subforum);
	
	public void update(Subforum subforum);
	
	public void delete(Subforum subforum);
	
	public Subforum queryById(Integer id);
	
	public List <Subforum> loadAll();
	
	public List <Subforum> loadByForum(Integer id);
	
	public int maxId();
}
