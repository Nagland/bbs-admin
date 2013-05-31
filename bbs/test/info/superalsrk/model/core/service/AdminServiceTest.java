package info.superalsrk.model.core.service;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import info.superalsrk.model.core.entity.Admin;
import info.superalsrk.model.util.MDEncode;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class AdminServiceTest {


	AdminService adminsService;
	@Before
	public void setUp() throws Exception {
		ApplicationContext ctx =   new FileSystemXmlApplicationContext("classpath:/spring/applicationContext.xml");
		adminsService = (AdminService) ctx.getBean("adminService");
	}

	
	@Ignore
	public void testSave() {
		Admin admin = new Admin();
		admin.setAdminName("adminsdf");
		admin.setPassword(MDEncode.encode("admin"));
		adminsService.save(admin);
	}

	@Ignore
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testGetExistedAdmin1() {
		Admin admin = adminsService.getExistedAdmin("admin", MDEncode.encode("admin"));
		assertEquals(admin.getAdminName(),"admin");
	}
	
	@Ignore
	public void testGetExistedAdmin2() {
		Admin admin = adminsService.getExistedAdmin("admin", "admin");
		assertEquals(null, admin);
	}

	@Ignore
	public void testResetPassword() {
		fail("Not yet implemented");
	}

}
