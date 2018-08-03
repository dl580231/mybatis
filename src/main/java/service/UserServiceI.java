package service;

import java.util.List;

import entity.User;

public interface UserServiceI {

	public User getUserById(int id);
	
	public List<User> getAllUsers();

	public void addUser(User user);
}
