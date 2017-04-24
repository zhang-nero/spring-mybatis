package com.zhang.nero.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhang.nero.modle.User;
import com.zhang.nero.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController
{
    private static Logger logger = Logger.getLogger(UserController.class);
    
    @Resource
    private IUserService userService;
    
    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model)
    {
        logger.info("showUser.");
        
        String name = request.getParameter("name");
        List<User> userlist = this.userService.getUserByName(name);
        User user = userlist.get(0);
        name = null;
        for(User u: userlist)
        {
            name += u.toString();
        }
        
        user.setUserName(name);
        model.addAttribute("user", user);
        return "showUser";
    }
}
