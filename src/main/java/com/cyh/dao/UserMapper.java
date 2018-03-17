package com.cyh.dao;

import com.cyh.pojo.User;

/**
 * 和Mapper.xml文件映射
 */
public interface UserMapper {
    public User getUserByUserName(String user_name);

}
