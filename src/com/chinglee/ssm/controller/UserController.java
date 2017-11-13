package com.chinglee.ssm.controller;

import com.chinglee.ssm.pojo.User;
import com.chinglee.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2017/11/13 0013.
 */
@Controller
public class UserController {
   @Autowired
    private UserService userService;
   @RequestMapping(value = "/userlist")
   public ModelAndView user() throws Exception{
       ModelAndView modelAndView=new ModelAndView();
       List<User> userlist=userService.selectAllUser();
       modelAndView.addObject("userlist",userlist);
       modelAndView.setViewName("/user/userlist");
       return modelAndView;
    }
}
