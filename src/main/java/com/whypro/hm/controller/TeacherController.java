package com.whypro.hm.controller;

import java.util.List;

import com.whypro.hm.entity.School;
import com.whypro.hm.entity.Teacher;
import com.whypro.hm.mapper.SchoolMapper;
import com.whypro.hm.mapper.TeacherMapper;

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
    
    @Resource(name = "schoolMapper")  
    private SchoolMapper schoolMapper;
    
    // 显示所有教师
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView showAllTeachers(HttpServletRequest req) {
        List<Teacher> teachers = teacherMapper.find();
        ModelAndView mav = new ModelAndView("teacher/show-all");
        mav.addObject("teachers", teachers);     
        return mav;
    }
    
    // 显示教师
    @RequestMapping(value="/{teacherId}", method=RequestMethod.GET)
    public ModelAndView showTeacher(@PathVariable("teacherId") int teacherId) {
        Teacher teacher = teacherMapper.get(teacherId);
        List<School> schools = schoolMapper.find();
        ModelAndView mav = new ModelAndView("teacher/modify");
        System.out.println(teacher.getSchoolId());
        mav.addObject("teacher", teacher);
        mav.addObject("schools", schools);
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
    public ModelAndView showAdd(HttpServletRequest req) {
        List<School> schools = schoolMapper.find();
        System.out.println(schools.size());
        ModelAndView mav = new ModelAndView("teacher/add");
        mav.addObject("schools", schools);
        return mav;
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
    
    // 修改教师
    @RequestMapping(value="/{teacherId}", method=RequestMethod.PUT)
    public String update(
        @PathVariable("teacherId") int teacherId,
        String number, String password, String name, String gender, 
        String telephone, String mobile, String email, 
        @RequestParam("school-id") int schoolId, 
        String description,
        HttpServletRequest req
        ) {
        Teacher teacher = new Teacher(
                number, password, name, gender, telephone, mobile, 
                email, schoolId, description);
        teacher.setId(teacherId);
        teacherMapper.update(teacher);
        return "redirect:/teacher";
    }
}
