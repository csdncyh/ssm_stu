package com.cyh.controller;

import com.cyh.pojo.User;
import com.cyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    //请求登录页面
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "/user/login";
    }

    //登录表单
    @RequestMapping(value = "/loginValidate", method = RequestMethod.POST)
    public String loginValidate(@RequestParam("username")  String username,
                                @RequestParam("password") String password){
        if (username == null || password == null){
            return "user/login";
        }else {
            User user = userService.getUserByUserName(username);
            if (user.getPassword().equals(password)){
                System.out.println("登录成功");
                return "redirect:/stu/student/stuList";
            }else {
                return "user/login";
            }
        }
    }
}
