package test_Users;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import entity.Users;
import mapping.UserMapperI;
import utils.MybatisUtils;

public class TestCRUDByAnnotationMapper {

	
	public void addUser() {
		SqlSession session = MybatisUtils.getSession(true);
		UserMapperI mapper = session.getMapper(UserMapperI.class);
		Users user=new Users();
		user.setName("ÀîËÄ");
		user.setAge(20);
		int user2 = mapper.addUser(user);
		System.out.println(user2);
	}
	
	
	public void rmUser() {
		SqlSession session = MybatisUtils.getSession(true);
		UserMapperI mapper = session.getMapper(UserMapperI.class);
		int rmUser = mapper.rmUser(7);
		System.out.println(rmUser);
	}
	
	
	public void getUser() {
		SqlSession session = MybatisUtils.getSession(true);
		UserMapperI mapper = session.getMapper(UserMapperI.class);
		Users user = mapper.getUser(1);
		System.out.println(user);
	}
	
	
	public void updateUser() {
		SqlSession session = MybatisUtils.getSession(true);
		UserMapperI mapper = session.getMapper(UserMapperI.class);
		Users users = new Users();
		users.setId(1);
		users.setName("¶­ÀÚ");
		users.setAge(20);
		mapper.updateUser(users);
	}
	
	@Test
	public void getAllUsers() {
		SqlSession session = MybatisUtils.getSession(true);
		UserMapperI mapper = session.getMapper(UserMapperI.class);
		List<Users> allUsers = mapper.getAllUsers();
		System.out.println(allUsers);
	}
}
