package info.superalsrk.model.core.dao;

import info.superalsrk.model.core.entity.User;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface UserDAO {
	public void save(User user);
	
	public void update(User user);
	
	public void delete(User user);
	
	public User queryById(Integer id);
	
	public int totalCount(String userName);
	
	public List <User> queryMore(Integer pageNum, Integer pageSize, String userName);
	
	public User queryByName(String userName);
}
