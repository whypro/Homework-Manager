package com.whypro.fuckjava.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.whypro.fuckjava.entity.Teacher;


public interface TeacherMapper {
    @Select("select * from teacher where id=#{id}")
    public Teacher get(int teacherId);
    
    @Insert("insert into teacher(number, password, name, gender, telephone, mobile, email, school_id, description) values (#{number}, #{password}, #{name}, #{gender}, #{telephone}, #{mobile}, #{email}, #{schoolId}, #{description})")
    public int save(Teacher teacher);
    
    @Delete("delete from teacher where id=#{id}")
    public void delete(int teacherId);
    
    @Update("update teacher set number=#{number}, password=#{password}, name=#{name}, gender=#{gender}, telephone=#{telephone}, mobile=#{mobile}, email=#{email}, school_id=#{schoolId} ")
    public void update(Teacher teacher);
    
    @Select("select id, number, name, gender, telephone, mobile, email from teacher")
    public List<Teacher> find();
}