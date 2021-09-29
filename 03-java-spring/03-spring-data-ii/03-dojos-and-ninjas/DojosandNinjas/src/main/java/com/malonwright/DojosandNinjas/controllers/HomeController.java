package com.malonwright.DojosandNinjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.malonwright.DojosandNinjas.models.Dojo;
import com.malonwright.DojosandNinjas.models.Ninja;
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
	public String showDojo(@PathVariable("id")Long id, Model viewModel) {
		viewModel.addAttribute("dojo", this.dService.getOneDojo(id));
		return "/dojos/show.jsp";
	}
	@GetMapping("/ninjas/new")
	public String newNinja() {
		return "/ninjas/newninja.jsp";
	}
	@PostMapping("/dojos/createDojo")
	public String createDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result){
		if(result.hasErrors()) {
			return "newdojo.jsp";
		}
		dService.createDojo(dojo);
		return "redirect:/index";
	}
	
	@PostMapping("/ninjas/createNinja")
	public String createNinja(@Valid @ModelAttribute("ninja")Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return"newninja.jsp";
		}
		dService.createNinja(ninja);
		return String.format("redirect:/dojos/show/%s", ninja.getDojo().getId());
	}
}

