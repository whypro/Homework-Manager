package com.whypro.homework.beans;

import java.io.Serializable;

public class Teacher implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5210136712557380951L;
	private int id;
	private String number;	// 教师号
	private String password;	// 密码
	private String name;	// 姓名
	private String gender;	// 性别
	private String telephone;	// 固定电话
	private String mobile;	// 手机
	private String email;	// 电子邮箱
	private School school;	// 学院
	private String description;	// 简介
	
	public Teacher() {
	    
	}
	
	public Teacher(String name, String gender, String telephone, String mobile,
	        String email, int schoolId, String description) {
	    this.setName(name);
	    this.setGender(gender);
	    this.setTelephone(telephone);
	    this.setMobile(mobile);
	    this.setEmail(email);
	    this.school = null;
	    this.setDescription(description);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}