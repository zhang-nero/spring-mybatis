package com.zhang.nero.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhang.nero.dao.IUserDao;
import com.zhang.nero.modle.User;
import com.zhang.nero.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	
	@Resource
	private IUserDao userDao;
	
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
