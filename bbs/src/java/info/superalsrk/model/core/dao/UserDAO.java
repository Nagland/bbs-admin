package info.superalsrk.model.core.dao;

import org.springframework.stereotype.Component;

import info.superalsrk.model.core.entity.User;

@Component
public interface UserDAO {
	
	public void save(User user);
	
	public void update(User user);
	
	public void delete(User user);
	
	public User queryById(String id);
}
