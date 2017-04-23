package com.zhang.nero.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhang.nero.dao.IUserDao;
import com.zhang.nero.modle.User;
import com.zhang.nero.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	
	@Resource
	private IUserDao userDao;
	
	public List<User> getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId); 
	}
	

    public List<User> getUserByName(String userName)
    {
        // TODO Auto-generated method stub
        return this.userDao.selectByname(userName);
    }

}
