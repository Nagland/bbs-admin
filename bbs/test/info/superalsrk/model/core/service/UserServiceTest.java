package info.superalsrk.model.core.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import info.superalsrk.model.core.entity.User;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserServiceTest {

	UserService userService;
	@Before
	public void setUp() throws Exception {
		ApplicationContext ctx =   new FileSystemXmlApplicationContext("classpath:/spring/applicationContext.xml");
		userService = (UserService) ctx.getBean("userService");
	}
	
	@Ignore
	public void testSave() {
		User user = new User();
		user.setUserName("mikumiku");
		user.setEmail("mikumiku@qq.com");
		user.setPassword("123");
		user.setRegisterTime(new java.util.Date());
		user.setScore(0);
		user.setCurrentLevel(0);
		userService.save(user);
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
	public void testQueryById() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testTotalCount() {
		int res1 = userService.totalCount(null);
		int res2 = userService.totalCount("宝箱");
		int res3 = userService.totalCount("stackbox");
		
		assertEquals(5,res1);
		assertEquals(2,res2);
		assertEquals(1,res3);
		
	}

	@Ignore
	public void testQueryMore() {
		List <User> res = userService.queryMore(0, 15, "宝箱");
		for (User user: res) {
			System.out.println(user.getUserName());
		}
	}

}
