package info.superalsrk.model.core.dao;

import info.superalsrk.model.core.entity.Admin;

import org.springframework.stereotype.Component;
@Component
public interface AdminDAO {

	public void save(Admin admin);
	
	public void update(Admin admin);
	
	public void delete(Admin admin);
	
	public Admin queryById(Integer id);

	public Admin getExistedAdmin(String adminName, String password);
}
