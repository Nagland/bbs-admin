package info.superalsrk.control.ajax.admin;

import info.superalsrk.model.core.entity.Subforum;
import info.superalsrk.model.core.service.SubforumService;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.opensymphony.xwork2.ActionSupport;

public class SubforumAction extends ActionSupport {

	private static final long serialVersionUID = -3853845521950506018L;
	
	private Integer id1;
	
	private Integer id2;
	
	@Autowired@Qualifier("subforumService")
	SubforumService subforumService;
	
	
	@JSON(serialize=false)
	public String swap() throws Exception {
		Subforum forum1 = subforumService.queryById(id1);
		Subforum forum2 = subforumService.queryById(id2);
		
		Integer tmp = forum1.getOrderSequence();
		forum1.setOrderSequence(forum2.getOrderSequence());
		forum2.setOrderSequence(tmp);
		
		subforumService.update(forum1);
		subforumService.update(forum2);
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
