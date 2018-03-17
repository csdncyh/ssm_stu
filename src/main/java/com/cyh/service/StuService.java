package com.cyh.service;

import com.cyh.pojo.Stu;
import com.cyh.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stuService")
public interface StuService {
    public Stu getStuById(int stuId);
    public List<Stu> getStuAll();
    public void addStu(Stu stu);
    void deleteStu(int stuId);
    void updateStu(Stu stu);
}