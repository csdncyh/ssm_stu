package com.cyh.service.impl;

import com.cyh.dao.StuMapper;
import com.cyh.dao.UserMapper;
import com.cyh.pojo.Stu;
import com.cyh.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 使用UserMap 接口操作数据层
 */

@Service("stuService")
public class StuServiceImpl implements StuService {

    @Autowired
    private StuMapper stuMapper;

    @Autowired
    private UserMapper userMapper;


    public Stu getStuById(int stuId) {
        Stu stu = stuMapper.getStuById(stuId);
        return stu;
    }

    public List<Stu> getStuAll() {
        List<Stu> stus = stuMapper.getStuAll();
        return stus;
    }

    public void addStu(Stu stu) {
        stuMapper.addStu(stu);
    }

    public void deleteStu(int stuId) {
        stuMapper.deleteStu(stuId);
    }

    public void updateStu(Stu stu) {
        stuMapper.updateStu(stu);
    }
}
