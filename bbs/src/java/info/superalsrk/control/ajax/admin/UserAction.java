package info.superalsrk.control.ajax.admin;


import org.apache.struts2.json.annotations.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import info.superalsrk.model.core.entity.User;


import com.opensymphony.xwork2.ActionSupport;

@Component
@Scope("prototype")
public class UserAction extends ActionSupport {

	private String errorCode;
	
	private String id;
	
	private String username;
	
	
	

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
