package com.cyh.pojo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by lenovo on 2017/4/25.
 */
//@XmlRootElement
public class Stu {
    private int stuId;
    private String stuName;
    private int stuAge;
    private String stuMajor;


    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuMajor='" + stuMajor + '\'' +
                '}';
    }
}
