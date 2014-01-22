package com.whypro.hm.controller;

import java.util.List;

import com.whypro.hm.entity.Course;
import com.whypro.hm.mapper.CourseMapper;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/course")
public class CourseController {
    @Resource(name = "courseMapper")  
    private CourseMapper courseMapper;
    
    // 显示所有课程
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView showAllCourses(HttpServletRequest req) {
        List<Course> courses = courseMapper.find();
        ModelAndView mav = new ModelAndView("course/show-all");
        mav.addObject("courses", courses);     
        return mav;
    }
    
    // 显示课程
    @RequestMapping(value="/{courseId}", method=RequestMethod.GET)
    public ModelAndView showCourse(@PathVariable("courseId") int courseId) {
        Course course = courseMapper.get(courseId);
        ModelAndView mav = new ModelAndView("course/modify");
        mav.addObject("course", course);
        return mav;
    }
    
 // 删除课程
    @RequestMapping(value="/{courseId}", method=RequestMethod.DELETE)
    public String deleteCourse(@PathVariable("courseId") int courseId, HttpServletRequest req) {
        courseMapper.delete(courseId);
        return "redirect:/course";
    }
    
    // 修改课程
    @RequestMapping(value="/{courseId}", method=RequestMethod.PUT)
    public String update(@PathVariable("courseId") int courseId, Course course, HttpServletRequest req) {
        course.setId(courseId);
        courseMapper.update(course);
        return "redirect:/course";
    }
    
    // 添加课程页面
    @RequestMapping(value="/add", method=RequestMethod.GET)
    public String showAdd(HttpServletRequest req) {
        return "course/add";
    }
    
    // 添加课程
    @RequestMapping(value="/add", method=RequestMethod.POST)
    public String add(
            String number, String name, String description,
            HttpServletRequest req
        ) {
        Course course = new Course(number, name, description);
        
        System.out.println(course.toString());
        int id = courseMapper.save(course);
        // id.intValue();
        return "redirect:/course";
    }
}
