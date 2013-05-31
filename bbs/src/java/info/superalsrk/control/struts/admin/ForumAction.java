package info.superalsrk.control.struts.admin;

import info.superalsrk.model.core.entity.Forum;
import info.superalsrk.model.core.service.ForumService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.opensymphony.xwork2.ActionSupport;

public class ForumAction extends ActionSupport {

	private static final long serialVersionUID = 5786402042145235690L;
	
	private Integer id;
	
	private String name;
	
	private String description;
	
	private String errorCode = "";
	
	private List <Forum> forumList;
	
	private Forum singleForum;
	
	@Autowired@Qualifier("forumService")
	ForumService forumService;
	
	public String load() {
		this.forumList = forumService.loadAll();
		return "list";
	}
	
	public String add() {
		Forum forum = new Forum();
		forum.setName(name);
		forum.setDescription(description);
		forum.setOrderSequence(forumService.maxId()+1);
		forumService.save(forum);
		return "added";
	}
	
	public String edit() {
		this.singleForum = forumService.queryById(id);
		return "edit";
	}
	
	public String update() {
		Forum forum = forumService.queryById(id);
		forum.setName(name);
		forum.setDescription(description);
		forumService.update(forum);
		return "updated";
	}
	
	public String delete() {
		Forum forum = forumService.queryById(id);
		forumService.delete(forum);
		return "updated";
	}

	public String changeOrder() {
		this.forumList = forumService.loadAll();
		return "co";
	}
	
	public String forumList() {
		this.forumList = forumService.loadAll();
		return "forumList";
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}


	public List<Forum> getForumList() {
		return forumList;
	}


	public void setForumList(List<Forum> forumList) {
		this.forumList = forumList;
	}

	public Forum getSingleForum() {
		return singleForum;
	}

	public void setSingleForum(Forum singleForum) {
		this.singleForum = singleForum;
	}

	public ForumService getForumService() {
		return forumService;
	}

	public void setForumService(ForumService forumService) {
		this.forumService = forumService;
	}
	
	
	
}
