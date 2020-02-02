package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {
	
	//@ResponseBody
	@RequestMapping("/register")
	public String Register() {
		return "register";
	}
	
	@RequestMapping("/index")
	public String RegisterSuccess() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String Login() {
		return "login";
	}
	
	
}
