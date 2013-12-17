package com.whypro.homework.dao;

import com.whypro.homework.beans.School;

import net.paoding.rose.jade.annotation.DAO;
import net.paoding.rose.jade.annotation.SQL;
import net.paoding.rose.jade.core.Identity;

@DAO
public interface SchoolDAO {
    @SQL("insert into school values(:1.number, :1.name, :1.description)")
    public Identity save(School school);
    
    @SQL("delete from school where id=:1")
    public void delete(int schoolId);
    
    @SQL("update school set number=:1.number, name=:1.name, description=:1.description)")
    public Identity update(School school);
    
    @SQL("select id, name, description from school where id=:1")
    public School get(int schoolId);
    
    @SQL("select id, name, description from school")
    public School find();
}
