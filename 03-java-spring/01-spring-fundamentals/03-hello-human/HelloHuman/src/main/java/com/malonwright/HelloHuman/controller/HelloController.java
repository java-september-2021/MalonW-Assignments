package com.malonwright.HelloHuman.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	@RequestMapping("")
	public String home() {
		return "Hello Human! Welcome to SpringBoot";
		
	}
	@RequestMapping("/{fname}")
	public String Fname(@PathVariable("fname") String fname ) {
		return "Hello "+fname+"! Welcome to SpringBoot";
	}
	@RequestMapping("/{fname} {lname}")
	public String FnameLname(@PathVariable("fname")String fname, @PathVariable("lname") String lname) {
		return "Hello "+fname+" "+lname+"! Welcome to SpringBoot";
	}

}
