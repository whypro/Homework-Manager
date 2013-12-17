package com.whypro.homework.controllers;

import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;
import net.paoding.rose.web.annotation.rest.Post;

@Path("account")
public class AccountController {
	@Get("show")
	public String show() {
	    return "r:/account/hehe";
	}
	@Post
	public String doLogin() {
		return "@登陆成功";
	}
	@Get("hehe")
	public String hehe() {
		return "@hehe";
	}
}