package com.whypro.hm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.whypro.hm.entity.Course;

public interface CourseMapper {
    @Select("select * from course where id=#{courseId}")
    public Course get(int courseId);
    
    @Insert("insert into course(number, name, description) values(#{number}, #{name}, #{description})")
    public int save(Course course);
    
    @Update("update course set number=#{number}, name=#{name}, description=#{description} where id=#{id}")
    public void update(Course course);
    
    @Delete("delete from course where id=#{courseId}")
    public void delete(int courseId);
    
    @Select("select * from course")
    public List<Course> find();
}
