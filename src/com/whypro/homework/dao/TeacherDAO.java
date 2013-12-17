package com.whypro.homework.dao;

import java.util.List;

import com.whypro.homework.beans.Teacher;

import net.paoding.rose.jade.annotation.DAO;
import net.paoding.rose.jade.annotation.SQL;
import net.paoding.rose.jade.core.Identity;

@DAO
public interface TeacherDAO {

	@SQL("insert into teacher(number, password, name, gender, telephone, mobile, email, school_id) " +
			"values(:1.number, :1.password, :1.name, :1.gender, :1.telephone, :1.mobile, :1.email, :1.school_id)")
	public Identity save(Teacher teacher);
	
	@SQL("delete from teacher where id=:1")
	public void delete(int teacherId);
	
	@SQL("update teacher set number=:1.number, password=:1.password, " +
			"name=:1.name, gender=:1.gender, " +
			"telephone=:1.telephone, mobile=:1.mobile, email=:1.email, " +
			"school_id=:1.schoolId")
	public void update(Teacher teacher);
	
	@SQL("select id, number, password, name, gender, telephone, mobile, email, school_id " +
			"from teacher where id=:1")
	public Teacher get(int teacherId);
	
	@SQL("select id, number, name, gender, telephone, mobile, email, school_id " +
			"from teacher")
	public List<Teacher> find();
}