package com.app.service;

import java.util.List;

import com.app.model.User;

public interface IUserService {

	public int saveUser(User user);
	public User getUserByNameAndPwd(String userName,String Password);
	public List<User> getAllUsers();
}
