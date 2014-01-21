package com.whypro.fuckjava.controller;

import java.util.List;

import com.whypro.fuckjava.entity.Teacher;
import com.whypro.fuckjava.mapper.TeacherMapper;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Resource(name = "teacherMapper")  
    private TeacherMapper teacherMapper;
    
    // 显示所有教师
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView showAllTeachers(HttpServletRequest req) {
        List<Teacher> teachers = teacherMapper.find();
        ModelAndView mav = new ModelAndView("teacher/show-all");
        mav.addObject("teachers", teachers);     
        return mav;
    }
    
    // 删除教师
    @RequestMapping(value="/{teacherId}", method=RequestMethod.DELETE)
    public String deleteTeacher(@PathVariable("teacherId") int teacherId, HttpServletRequest req) {
        teacherMapper.delete(teacherId);
        return "redirect:/teacher";
    }
    
    // 添加教师页面
    @RequestMapping(value="/add", method=RequestMethod.GET)
    public String showAdd(HttpServletRequest req) {
        return "teacher/add";
    }
    
    // 添加教师
    @RequestMapping(value="/add", method=RequestMethod.POST)
    public String add(
            String number, String password, String name, String gender, 
            String telephone, String mobile, String email, 
            @RequestParam("school-id") int schoolId, 
            String description,
            HttpServletRequest req
        ) {
        Teacher teacher = new Teacher(
                number, password, name, gender, telephone, mobile, 
                email, schoolId, description);
        System.out.println(teacher.toString());
        int id = teacherMapper.save(teacher);
        // id.intValue();
        return "redirect:/teacher";
    }
}
