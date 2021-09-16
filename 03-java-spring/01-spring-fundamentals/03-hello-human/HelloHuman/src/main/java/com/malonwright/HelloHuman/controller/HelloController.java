package com.malonwright.HelloHuman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class HelloController {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}	
	@RequestMapping("/{fname}")
	public String Fname(@PathVariable("fname") String fname ) {
		return "Hello "+fname+"! Welcome to SpringBoot";
	}
	@RequestMapping("/{fname} {lname}")
	public String FnameLname(@PathVariable("fname")String fname, @PathVariable("lname") String lname) {
		return "Hello "+fname+" "+lname+"! Welcome to SpringBoot";
	}
//	public String user(Model model) {
//	//Defining key value values
//	String firstName= "Ada";
//	String lastName="Lovelace";
//	String email = "ones@zeros.com";
//	Integer age = 25;
//	//Defining key value pairs
//	model.addAttribute("first", firstName);
//	model.addAttribute("last", lastName);
//	model.addAttribute("email", email);
//	model.addAttribute("age", age);
//	
//	// renders index page
//	return "index.jsp";
//	
//}

}
