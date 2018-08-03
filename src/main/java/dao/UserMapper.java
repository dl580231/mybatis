package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import entity.User;

public interface UserMapper {
    
	/*@Select("Select user_name userName,user_birthday userBirthday,user_salary userSalary from t_user Where user_id=#{id}")*/
	public User getUserById(Integer id);
	
	/*@Insert("insert into t_user(user_name,user_birthday,user_salary) values(#{userName},#{userBirthday},#{userSalary})")*/
	public void addUser(User user);

	/*@Delete("delete from t_user where user_id=#{id}")*/
	public void rmUser(int id);
	
	/*@Update("update t_user set user_name=#{userName},user_birthday=#{userBirthday},user_Salary=#{userSalary}")*/	
	public void updateUser(User user);
	
	public List<User> getAllUsers();
}