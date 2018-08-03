package mapping;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entity.Users;

public interface UserMapperI {
	@Select("select * from users where id =#{id}")
	public Users getUser(int id);

	@Insert("insert into users(name,age) values(#{name},#{age})")
	public int addUser(Users users);
	
	@Delete("delete from users where id=#{id}")
	public int rmUser(int id);
	
	@Update("update users set name=#{name},age=#{age} where id=#{id}")
	public int updateUser(Users users);
	
	@Select("select * from users")
	public List<Users> getAllUsers();
}
