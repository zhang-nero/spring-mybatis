package com.zhang.nero.dao;

import java.util.List;

import com.zhang.nero.modle.User;

public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByPrimaryKey(Integer id);

    List<User> selectByname(String name);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}