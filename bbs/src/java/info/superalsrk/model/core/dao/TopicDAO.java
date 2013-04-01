package info.superalsrk.model.core.dao;

import java.util.List;
import org.springframework.stereotype.Component;

import info.superalsrk.model.core.entity.Topic;


@Component
public interface TopicDAO {
	public void save(Topic topic);
	
	public void update(Topic topic);
	
	public void delete(Topic topic);
	
	public Topic queryById(String id);
	
	public List<Topic> queryByPage(int pageNum,int pageSize,int subForumId);
}
