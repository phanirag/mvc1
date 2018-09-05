package com.app.dao;

import java.util.List;

import com.app.model.User;

public interface IUserDao {

	public int saveUser(User user);
	public User getUserByNameAndPwd(String userName,String Password);
	public List<User> getAllUsers();
}
