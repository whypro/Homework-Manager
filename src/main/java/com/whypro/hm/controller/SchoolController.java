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
@RequestMapping("/school")
public class SchoolController {
    @Resource(name = "schoolMapper")  
    private SchoolMapper schoolMapper;
    
    // 显示所有学院
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView showAllSchools(HttpServletRequest req) {
        List<School> schools = schoolMapper.find();
        ModelAndView mav = new ModelAndView("school/show-all");
        mav.addObject("schools", schools);     
        return mav;
    }
    
    // 显示学院
    @RequestMapping(value="/{schoolId}", method=RequestMethod.GET)
    public ModelAndView showSchool(@PathVariable("schoolId") int schoolId) {
        School school = schoolMapper.get(schoolId);
        ModelAndView mav = new ModelAndView("school/modify");
        mav.addObject("school", school);
        return mav;
    }
    
    // 删除学院
    @RequestMapping(value="/{schoolId}", method=RequestMethod.DELETE)
    public String deleteTeacher(@PathVariable("schoolId") int schoolId, HttpServletRequest req) {
        schoolMapper.delete(schoolId);
        return "redirect:/school";
    }
    
    // 修改学院
    @RequestMapping(value="/{schoolId}", method=RequestMethod.PUT)
    public String update(
        @PathVariable("schoolId") int schoolId, 
        School school,
        HttpServletRequest req
    ) {
        school.setId(schoolId);
        schoolMapper.update(school);
        return "redirect:/school";
    }
    
    // 添加学院页面
    @RequestMapping(value="/add", method=RequestMethod.GET)
    public String showAdd(HttpServletRequest req) {
        return "school/add";
    }
    
    // 添加学院
    @RequestMapping(value="/add", method=RequestMethod.POST)
    public String add(
            String number, String name, String description,
            HttpServletRequest req
        ) {
        School school = new School(number, name, description);
        
        System.out.println(school.toString());
        int id = schoolMapper.save(school);
        // id.intValue();
        return "redirect:/school";
    }
}
