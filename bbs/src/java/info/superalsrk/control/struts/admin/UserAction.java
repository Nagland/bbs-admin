package info.superalsrk.control.struts.admin;

import java.util.List;

import info.superalsrk.model.core.entity.User;
import info.superalsrk.model.core.service.UserService;
import info.superalsrk.model.util.LevelUtil;
import info.superalsrk.model.util.MDEncode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 5946366925390714478L;

	private Integer id;
	
	private String userName;
	
	private String password;
	
	private String email;
	
	private String score;
	
	private String errorCode="";
	
	private Integer pageNum;
	
	private Integer pageCount;
	
	private Integer pageSize = 2;
	
	private List <User> userList;
	
	private User singleUser;
	
	@Autowired@Qualifier("userService")
	private UserService userService;
	
public String search() {
		
		int totalCount = userService.totalCount(userName);
		if(null == pageNum) {
			pageNum = 1;
		}
		pageCount = (totalCount + pageSize -1) / pageSize;
		
		this.userList = userService.queryMore((pageNum-1) * pageSize, pageSize, userName);
		
		return "list";
	}
	
	public String add() {
		
		User user = new User();
		user.setUserName(userName);
		user.setPassword(MDEncode.encode(password));
		user.setEmail(email);
		user.setScore(Integer.parseInt(score));
		user.setCurrentLevel(LevelUtil.getLevel(user.getScore()));
		user.setRegisterTime(new java.util.Date());
		userService.save(user);
		return "added";
	}
	public String edit() {
		this.singleUser = userService.queryById(id);
		return "edit";
	}
	public String update() {
		User user = userService.queryById(id);
		user.setUserName(userName);
		user.setEmail(email);
		user.setScore(Integer.parseInt(score));
		user.setCurrentLevel(LevelUtil.getLevel(user.getScore()));
		userService.update(user);
		return "updated";
	}
	
	public String psedit() {
		this.singleUser = userService.queryById(id);
		return "psedit";
	}
	
	public String changeps() {
		User user = userService.queryById(id);
		user.setPassword(MDEncode.encode(password));
		return "pschanged";
	}
	
	public String detail() {
		
		return "detail";
	}
	
	public String delete() {
		
		return "list";
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public User getSingleUser() {
		return singleUser;
	}

	public void setSingleUser(User singleUser) {
		this.singleUser = singleUser;
	}
	
}
