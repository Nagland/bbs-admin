package info.superalsrk.control.struts.admin;

import info.superalsrk.model.core.entity.Admin;
import info.superalsrk.model.core.service.AdminService;
import info.superalsrk.model.core.service.UserService;
import info.superalsrk.model.util.MDEncode;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private static final long serialVersionUID = 933084595193612094L;
	
	private String adminName;
	
	private String password;
	
	private Admin admin;
	
	private String errorCode="";
	
	@Autowired@Qualifier("adminService")
	private AdminService adminService;
	
	public String signin() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		admin = adminService.getExistedAdmin(adminName, MDEncode.encode(password));
		if(null == admin) {
			this.errorCode = "用户名或密码不正确！";
			return "login";
		} else {
			session.setAttribute("admin", admin);
			return "signin";
		}
	}
	
	public String logout() {
		 HttpServletRequest request = ServletActionContext.getRequest();        	
	     request.getSession().removeAttribute("admin");
	     this.errorCode= "注销成功，请重新登录。";
	     return "logout";
	}
	

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
}
