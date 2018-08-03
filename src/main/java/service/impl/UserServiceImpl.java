package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserMapper;
import entity.User;
import service.UserServiceI;

@Service
public class UserServiceImpl implements UserServiceI{

	@Autowired
	private UserMapper userMapper;
	
	public User getUserById(int id) {
		return userMapper.getUserById(id);
	}

	public List<User> getAllUsers() {
		return userMapper.getAllUsers();
	}

	public void addUser(User user) {
		userMapper.addUser(user);
	}
	
	
}
