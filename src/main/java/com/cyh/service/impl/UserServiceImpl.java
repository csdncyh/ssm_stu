package com.cyh.service.impl;

import com.cyh.dao.StuMapper;
import com.cyh.dao.UserMapper;
import com.cyh.pojo.Stu;
import com.cyh.pojo.User;
import com.cyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 使用UserMap 接口操作数据层
 */

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private StuMapper stuMapper;

    @Resource
    private UserMapper userMapper;

    public User getUserByUserName(String user_name) {
        User user = userMapper.getUserByUserName(user_name);
        return user;
    }
}
