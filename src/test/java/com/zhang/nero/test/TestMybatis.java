package com.zhang.nero.test;  
  
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zhang.nero.modle.User;
import com.zhang.nero.service.IUserService;  
  
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath*:spring-mybatis.xml"})  
  
public class TestMybatis {  
    private static Logger logger = Logger.getLogger(TestMybatis.class);   
    
    @Resource(name="userService")
    private IUserService userService;
  
    @Test  
    public void test1() {
        User user = userService.getUserById(1);
        logger.info(JSON.toJSONString(user));  
    }  
}  