package info.superalsrk.control.struts.customer;

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
