package com.cyh.controller;

import com.cyh.pojo.Stu;
import com.cyh.pojo.User;
import com.cyh.service.StuService;
import com.cyh.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/stu")
public class StuController {

    @Resource
    private StuService stuService;

    /**
     * 所有学生
     * @return
     */
    @RequestMapping(value = "/student/stuList", method = RequestMethod.GET)
    public ModelAndView stuList(){
        System.out.println("进入");
        ModelAndView modelAndView = new ModelAndView();
        List<Stu> stus = stuService.getStuAll();
        modelAndView.addObject("stus", stus);
        modelAndView.setViewName("/student/stuList");
        return modelAndView;
    }


    @RequestMapping(value = "/getStuById/{stuId}")
    public ModelAndView getStuById(@PathVariable Integer stuId){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("用户id=="+stuId);
        Stu stu = stuService.getStuById(stuId);
        System.out.println(stu);
        List<Stu> stus = new  ArrayList<Stu>();
        stus.add(stu);
        modelAndView.addObject("stus", stus);
        modelAndView.setViewName("/student/stuList");
        return modelAndView;
    }


    @RequestMapping(value = "/addPage",method = RequestMethod.GET)
    public String addPage(){
        return "/student/addPage";
    }

    @RequestMapping(value = "/addPage/{stuId}",method = RequestMethod.GET)
    public ModelAndView addPage(@PathVariable  String stuId){
        ModelAndView modelAndView = new ModelAndView();
        Stu stu = stuService.getStuById(Integer.parseInt(stuId));
        modelAndView.addObject("stu",stu);
        modelAndView.setViewName("/student/addPage");
        return modelAndView;
    }

    @RequestMapping(value = "/addStu", method = RequestMethod.POST)
    public String addStu(@RequestParam("stuName") String stuName,
                       @RequestParam("stuAge") String stuAge,
                       @RequestParam("stuMajor") String stuMajor){
        System.out.println("add");
        Stu stu = new Stu();
        stu.setStuName(stuName);
        stu.setStuAge(Integer.parseInt(stuAge));
        stu.setStuMajor(stuMajor);
        stuService.addStu(stu);
        return "redirect:/stu/student/stuList";
    }

    @RequestMapping(value = "/deleteStu/{stuId}")
    public String deleteStu(@PathVariable Integer stuId){
        System.out.println("删除"+stuId);
        stuService.deleteStu(stuId);
        return "redirect:/stu/student/stuList";
    }
    @RequestMapping(value = "/updateStu")
    public String updateStu(@RequestParam("stuId") String stuId,
                            @RequestParam("stuName") String stuName,
                            @RequestParam("stuAge") String stuAge,
                            @RequestParam("stuMajor") String stuMajor){
        System.out.println("id"+stuId+"name"+stuName+"age"+stuAge);
        Stu stu = new Stu();
        stu.setStuId(Integer.parseInt(stuId));
        stu.setStuName(stuName);
        stu.setStuAge(Integer.parseInt(stuAge));
        stu.setStuMajor(stuMajor);
        stuService.updateStu(stu);
        return "redirect:/stu/student/stuList";
    }
}
