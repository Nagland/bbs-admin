package info.superalsrk.control.struts.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import info.superalsrk.model.core.dao.TopicDAO;
import info.superalsrk.model.core.dao.UserDAO;
import info.superalsrk.model.core.entity.Topic;
import info.superalsrk.model.core.entity.User;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String username;
	
	private String password;
	
	private User user;


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		/*
		Topic topic = new Topic();
		topic.setLastreplyTime(new java.util.Date());
		topic.setPostTime(new java.util.Date());
		topic.setTopicContent("fuck you");
		
		//User user = userDAO.queryById("4028803a3dc87720013dc8774e610001");
		//topic.setUser(user);
		*/
		//topicDAO.save(topic);
		
		
		
		
		return Action.SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
