package com.whypro.homework.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.whypro.homework.beans.Teacher;
import com.whypro.homework.dao.TeacherDAO;

import net.paoding.rose.jade.core.Identity;
import net.paoding.rose.web.Invocation;
import net.paoding.rose.web.annotation.Param;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;
import net.paoding.rose.web.annotation.rest.Post;

@Path("teacher")
public class TeacherController {
	@Autowired
    private TeacherDAO teacherDAO;
	
	// 显示所有教师
	@Get("list")
	public String showAllTeachers(Invocation inv) {
		List<Teacher> teachers = teacherDAO.find();
	    inv.addModel("teachers", teachers);     
		return "teacher/show-all";
	}
	
	// 添加教师页面
	@Get("add")
	public String showAdd(Invocation inv) {
		return "teacher/add";
	}
	
	// 添加教师
	@Post("add")
	public String add(Invocation inv) {
	    String number = inv.getParameter("number");
	    String password = inv.getParameter("password");
	    String name = inv.getParameter("name");
	    String gender = inv.getParameter("gender");
	    String telephone = inv.getParameter("telephone");
	    String mobile = inv.getParameter("mobile");
	    String email = inv.getParameter("email");
	    int schoolId = Integer.parseInt(inv.getParameter("school-id"));
	    String description = inv.getParameter("description");
	    Teacher teacher = new Teacher(
	            number, password, name, gender, telephone, mobile, 
	            email, schoolId, description);
	    // System.out.println(teacher.toString());
	    Identity id = teacherDAO.save(teacher);
	    // id.intValue();
	    return "@注册成功";
	}
	
	// 显示教师信息
	@Get("{teacherId}")
	public String showTeacher(Invocation inv, @Param("teacherId") int teacherId) {
	    Teacher teacher = teacherDAO.get(teacherId);
	    inv.addModel("teacher", teacher);
	    return "teacher/show-one";
	}
}