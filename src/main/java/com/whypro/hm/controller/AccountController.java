package com.whypro.hm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/account")
public class AccountController {
    @RequestMapping(value="/show", method=RequestMethod.GET)
	public String show() {
	    return "account/show";
	}
    
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String getLogin() {
        return "account/login";
    }
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String doLogin() {
	    
		return "redirect:/account/login";
	}
}