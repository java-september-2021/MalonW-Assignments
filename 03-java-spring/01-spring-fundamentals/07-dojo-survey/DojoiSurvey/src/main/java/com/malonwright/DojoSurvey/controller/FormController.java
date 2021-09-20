package com.malonwright.DojoSurvey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Should Display Form
@Controller
public class FormController {
	@GetMapping(value="/")
	public String index() {
		return "index.jsp";
	}
	
	//Takes data from form submission assigns to key, value pairs
	@PostMapping(value="/result")
	public String results(@RequestParam(value="name")String name,@RequestParam(value="dojo") String dojo,@RequestParam(value="language")String language,@RequestParam(value="comment") String comment, Model model){

		
		model.addAttribute("name", name);
		model.addAttribute("dojo", dojo);
		model.addAttribute("language", language);
		model.addAttribute("comment", comment);
		
		
		return "redirect:/results";
	}
	//Displays results page with data taken in from form submission.
	@GetMapping(value="/results")
	public String results() {
		
		return "results.jsp";
}

	
}
