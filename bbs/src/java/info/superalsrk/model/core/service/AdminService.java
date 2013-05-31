package info.superalsrk.model.core.service;

import info.superalsrk.model.core.dao.AdminDAO;
import info.superalsrk.model.core.entity.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component(value="adminService")
public class AdminService {

	@Autowired@Qualifier("adminDAO")
	private AdminDAO adminDAO;
	
	@Transactional
	public void save(Admin admin) {
		adminDAO.save(admin);
	}
	
	@Transactional
	public void update(Admin admin) {
		adminDAO.update(admin);
	}
	
	@Transactional
	public void delete(Admin admin) {
		adminDAO.delete(admin);
	}
	
	@Transactional
	public Admin getExistedAdmin(String adminName, String password) {
		return adminDAO.getExistedAdmin(adminName, password);
	}
	
	@Transactional
	public boolean resetPassword(String adminName, String oldPassword, String newPassword) {
		Admin admin = getExistedAdmin(adminName, oldPassword);
		if(null == admin) {
			return false;
		} else {
			admin.setPassword(newPassword);
			adminDAO.update(admin);
			return true;
		}
	}
}
