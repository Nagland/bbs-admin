package info.superalsrk.control.ajax.admin;

import info.superalsrk.model.core.entity.Forum;
import info.superalsrk.model.core.service.ForumService;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.opensymphony.xwork2.ActionSupport;

public class ForumAction extends ActionSupport {

	private static final long serialVersionUID = -3853845521950506018L;
	
	private Integer id1;
	
	private Integer id2;
	
	@Autowired@Qualifier("forumService")
	ForumService forumService;
	
	
	@JSON(serialize=false)
	public String swap() throws Exception {
		Forum forum1 = forumService.queryById(id1);
		Forum forum2 = forumService.queryById(id2);
		
		Integer tmp = forum1.getOrderSequence();
		forum1.setOrderSequence(forum2.getOrderSequence());
		forum2.setOrderSequence(tmp);
		
		forumService.update(forum1);
		forumService.update(forum2);
		return super.execute();
	}


	public Integer getId1() {
		return id1;
	}


	public void setId1(Integer id1) {
		this.id1 = id1;
	}


	public Integer getId2() {
		return id2;
	}


	public void setId2(Integer id2) {
		this.id2 = id2;
	}
	
}
