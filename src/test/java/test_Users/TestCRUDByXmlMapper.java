package test_Users;

import java.util.List;

import org.apache.catalina.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import entity.Users;
import utils.MybatisUtils;

public class TestCRUDByXmlMapper {

	private SqlSession session=MybatisUtils.getSession();
	@Test
	public void addUser() {
		Users users = new Users();
		users.setName("ÕÅÈý");
		users.setAge(22);
		String statement="mapping.userMapper.addUser";
		int result = session.insert(statement, users);
		session.commit();
		session.close();
		System.out.println(result);
	}
	
	
	public void rmUser() {
		String statement="mapping.userMapper.rmUser";
		int delete = session.delete(statement,5);
		session.commit();
		session.close();
		System.out.println(delete);
	}
	
	
	public void updateUser() {
		String statement="mapping.userMapper.updateUser";
		Users users = new Users();
		users.setId(1);
		users.setName("¶­ÀÚ");
		users.setAge(21);
		int update = session.update(statement,users);
		session.commit();
		session.close();
		System.out.println(update);
	}
	
	
	public void getAllUsers() {
		String statement="mapping.userMapper.getAllUsers";
		List<User> selectList = session.selectList(statement);
		for(int i=0;i<selectList.size();i++) {
			System.out.println(selectList.get(i));
		}
	}
}
