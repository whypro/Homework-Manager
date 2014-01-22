package com.whypro.hm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.whypro.hm.entity.School;

public interface SchoolMapper {
    @Select("select id, number, name, description from school where id=#{schoolId}")
    public School get(int schoolId);
    
    @Insert("insert into school(number, name, description) values(#{number}, #{name}, #{description})")
    public int save(School school);
    
    @Update("update school set number=#{number}, name=#{name}, description=#{description} where id=#{id}")
    public void update(School school);
    
    @Delete("delete from school where id=#{schoolId}")
    public void delete(int schoolId);
    
    @Select("select id, number, name, description from school")
    public List<School> find();
}
