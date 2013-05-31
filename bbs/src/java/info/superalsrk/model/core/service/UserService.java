package info.superalsrk.model.core.service;

import info.superalsrk.model.core.dao.UserDAO;
import info.superalsrk.model.core.entity.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component(value="userService")
public class UserService {
	@Autowired@Qualifier("userDAO")
	private UserDAO userDAO;
	
	@Transactional
	public void save(User user) {
		userDAO.save(user);
	}
	
	@Transactional
	public void update(User user) {
		userDAO.update(user);
	}
	
	@Transactional
	public void delete(User user) {
		userDAO.delete(user);
	}
	
	@Transactional
	public User queryById(Integer id) {
		return userDAO.queryById(id);
	}
	
	@Transactional
	public int totalCount(String userName) {
		return userDAO.totalCount(userName);
	}
	
	@Transactional
	public List <User> queryMore(Integer pageNum, Integer pageSize,String userName) {
		return userDAO.queryMore(pageNum, pageSize, userName);
	}
	
	@Transactional
	public User queryByName(String userName) {
		return userDAO.queryByName(userName);
	}
}
