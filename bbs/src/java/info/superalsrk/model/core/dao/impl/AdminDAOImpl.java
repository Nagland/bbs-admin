package info.superalsrk.model.core.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import info.superalsrk.model.core.dao.AdminDAO;
import info.superalsrk.model.core.entity.Admin;

@Component(value="adminDAO")
public class AdminDAOImpl implements AdminDAO {

	@Autowired@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	public void save(Admin admin) {
		hibernateTemplate.save(admin);
	}

	public void update(Admin admin) {
		hibernateTemplate.update(admin);
	}

	public void delete(Admin admin) {
		hibernateTemplate.delete(admin);
	}

	public Admin queryById(Integer id) {
		return hibernateTemplate.get(Admin.class, id);
	}

	@SuppressWarnings("unchecked")
	public Admin getExistedAdmin(String adminName, String password) {
		String hql = "from Admin where adminName = ? and password = ?";
		List <Admin> res = hibernateTemplate.find(hql, new Object[]{adminName, password});
		if(null != res && res.size() > 0) {
			return res.get(0);
		}
		return null;
	}

}
