package test_sm;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import entity.User;
import service.UserServiceI;
import spring_config.Spring_mybatis;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {Spring_mybatis.class})
public class TestCRUDByAnnotationMapper {

	@Autowired
	private UserServiceI service;
	
	
	public void getUserById() {
		User user = service.getUserById(1);
		System.out.println(user);
	}
	@Test
	public void getAllUsers() {
		List<User> allUsers = service.getAllUsers();
		System.out.println(allUsers);
	}
	
	public void addUser() {
		User user=new User();
		user.setUserName("ะกร๗");
		user.setUserBirthday(new Date());
		user.setUserSalary(3000.0);
		service.addUser(user);
	}
	
}
