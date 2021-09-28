package com.malonwright.DojosandNinjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.malonwright.DojosandNinjas.services.DojoService;

@Controller
public class HomeController {


	@Autowired
	private DojoService dService;
	
	@GetMapping("/")
	public String index() {
		return "/index.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String newDojo() {
		return "/dojos/newdojo.jsp";
	}
	
	@GetMapping("/dojos/show/{id}")
	public String showDojo(Long id, Model viewModel) {
		dService.getOneDojo(id);
		dService.getAllNinjas();
		viewModel.addAttribute("ninja", this.dService.getAllNinjas());
		viewModel.addAttribute("dojo", this.dService.getOneDojo(id));
		return "/dojos/show.jsp";
	}
	@GetMapping("/ninjas/new")
	public String newNinja() {
		return "/ninjas/newninja.jsp";
	}
	
}

