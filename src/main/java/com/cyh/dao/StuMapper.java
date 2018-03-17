package com.cyh.dao;

import com.cyh.pojo.Stu;

import java.util.List;

public interface StuMapper {
    Stu getStuById(int stuId);
    List<Stu> getStuAll();
    void addStu(Stu stu);
    void deleteStu(int stId);
    void updateStu(Stu stu);
}
