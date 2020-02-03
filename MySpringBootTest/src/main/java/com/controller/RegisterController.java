package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bean.User;

@Controller
public class RegisterController {

	// @ResponseBody
	@RequestMapping("/register")
	public String Register() {
		return "register";
	}

	@RequestMapping(value = "/index")
	// @ModelAttribute
	public ModelAndView RegisterSuccess(@RequestBody String inputEmail) {
		System.out.println("posted");
		System.out.println(inputEmail);
		User user = new User();
		user.setEmail(inputEmail);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject(user);
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping("/login")
	public String Login() {
		return "login";
	}

	@RequestMapping("/addBook")
	public String addBook() {
		return "addBook";
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public ModelAndView test(
			@RequestParam("name") String name
			) {
		ModelAndView modelAndView=new ModelAndView();
		System.out.println(name);
		
		return modelAndView;
		
	}
	
	@RequestMapping("/test1")
	public String test1() {
		return "test";
		
	}
}
