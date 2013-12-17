package com.whypro.homework.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.whypro.homework.beans.Teacher;
import com.whypro.homework.dao.TeacherDAO;

import net.paoding.rose.web.Invocation;
import net.paoding.rose.web.annotation.Param;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;
import net.paoding.rose.web.annotation.rest.Post;

@Path("teacher")
public class TeacherController {
	@Autowired
    private TeacherDAO teacherDAO;
	
	@Get("")
	public String showTeachers(Invocation inv) {
		List<Teacher> teachers = teacherDAO.find();
	    inv.addModel("teachers", teachers);     
		return "teacher/teachers";
	}
	
	@Get("add")
	public String showRegister(Invocation inv) {
		return "teacher/add";
	}
	
	@Post("add")
	public String register(Teacher teacher) {
	    teacherDAO.save(teacher);
	    return "@注册成功";
	}
	
	@Get("{teacherNumber}")
	public String show(@Param("teacherNumber") String teacherNumber) {
	    return "@teacher: " + teacherNumber;
	}
}