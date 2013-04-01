package info.superalsrk.model.core.dao;

import java.util.List;
import org.springframework.stereotype.Component;

import info.superalsrk.model.core.entity.Reply;

@Component
public interface ReplyDAO {

	public void save(Reply reply);
	
	public void update(Reply reply);
	
	public void delete(Reply reply);
	
	public Reply queryById(String id);
	
	public List<Reply> queryByPage(int pageNum,int pageSize,String topicId);
}
