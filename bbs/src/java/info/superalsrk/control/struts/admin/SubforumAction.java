package info.superalsrk.control.struts.admin;

import info.superalsrk.model.core.entity.Forum;
import info.superalsrk.model.core.entity.Subforum;
import info.superalsrk.model.core.entity.User;
import info.superalsrk.model.core.service.ForumService;
import info.superalsrk.model.core.service.SubforumService;
import info.superalsrk.model.core.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.opensymphony.xwork2.ActionSupport;

public class SubforumAction  extends ActionSupport{

	private static final long serialVersionUID = 5070437361317213008L;
	
	private Integer id;
	
	private String name;
	
	private String description;
	
	private String moderato;
	
	private Integer replyLevel;
	
	private Integer postLevel;
	
	private Integer scanLevel;
	
	private Integer forumId;
	
	private List <Subforum> subforumList;
	
	private List <Forum> forumList;
	
	private Subforum singleSubforum;
	
	@Autowired@Qualifier("userService")
	private UserService userService;
	
	@Autowired@Qualifier("forumService")
	ForumService forumService;
	
	@Autowired@Qualifier("subforumService")
	private SubforumService subforumService;
	
	public String load() {
		this.subforumList = subforumService.loadByForum(forumId);
		if(null != subforumList && subforumList.size() > 0) {
			for(Subforum sub: subforumList) {
				if(null != sub.getUser()) {
					sub.setUser(userService.queryById(sub.getUser().getId()));
				}
			}
		}
		return "finished";
	}
	public String add() {
		
		User user = userService.queryByName(moderato);
		Forum forum = forumService.queryById(forumId);
		
		Subforum subforum = new Subforum();
		subforum.setName(name);
		subforum.setDescription(description);
		subforum.setForum(forum);
		subforum.setUser(user);
		subforum.setPostLevel(postLevel);
		subforum.setReplyLevel(replyLevel);
		subforum.setScanLevel(scanLevel);
		subforum.setOrderSequence(subforumService.maxId()+1);
		
	
		subforumService.save(subforum);
		
		return "finished";
	}
	
	public String edit() {
		this.singleSubforum = subforumService.queryById(id);
		if(null != singleSubforum.getUser()) {
			this.singleSubforum.setUser(userService.queryById(this.singleSubforum.getUser().getId()));
		}
		return "edit";
	}
	
	public String update() {
		User user = userService.queryByName(moderato);
		Forum forum = forumService.queryById(forumId);
		
		Subforum subforum = subforumService.queryById(id);
		subforum.setName(name);
		subforum.setDescription(description);
		subforum.setReplyLevel(replyLevel);
		subforum.setPostLevel(postLevel);
		subforum.setScanLevel(scanLevel);
		subforum.setUser(user);
		subforum.setForum(forum);
		
		subforumService.update(subforum);
		
		return "finished";
	}
	
	public String delete() {
		Subforum subforum = subforumService.queryById(id);
		subforumService.delete(subforum);
		return "finished";
	}
	
	public String list() {
		this.subforumList = subforumService.loadByForum(forumId);
		return "list";
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

	public String getModerato() {
		return moderato;
	}

	public void setModerato(String moderato) {
		this.moderato = moderato;
	}

	public Integer getReplyLevel() {
		return replyLevel;
	}

	public void setReplyLevel(Integer replyLevel) {
		this.replyLevel = replyLevel;
	}

	public Integer getPostLevel() {
		return postLevel;
	}

	public void setPostLevel(Integer postLevel) {
		this.postLevel = postLevel;
	}

	public Integer getScanLevel() {
		return scanLevel;
	}

	public void setScanLevel(Integer scanLevel) {
		this.scanLevel = scanLevel;
	}

	public Integer getForumId() {
		return forumId;
	}

	public void setForumId(Integer forumId) {
		this.forumId = forumId;
	}

	public List<Subforum> getSubforumList() {
		return subforumList;
	}

	public void setSubforumList(List<Subforum> subforumList) {
		this.subforumList = subforumList;
	}

	public List<Forum> getForumList() {
		return forumList;
	}

	public void setForumList(List<Forum> forumList) {
		this.forumList = forumList;
	}

	public Subforum getSingleSubforum() {
		return singleSubforum;
	}

	public void setSingleSubforum(Subforum singleSubforum) {
		this.singleSubforum = singleSubforum;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public SubforumService getSubforumService() {
		return subforumService;
	}

	public void setSubforumService(SubforumService subforumService) {
		this.subforumService = subforumService;
	}
	
	
}
