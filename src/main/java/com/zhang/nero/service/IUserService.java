package com.zhang.nero.service;

import java.util.List;

import com.zhang.nero.modle.User;

public interface IUserService {
	public List<User> getUserById(int userId);
	public List<User> getUserByName(String userName);
}
