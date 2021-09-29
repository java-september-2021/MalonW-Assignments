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
	//index
	@GetMapping("/")
	public String index() {
		return "/index.jsp";
	}
	//new dojo form with list of dojos
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo")Dojo dojo, Model viewModel) {
		viewModel.addAttribute("dojos", this.dService.getAllDojos());
		return "/dojos/newdojo.jsp";
	}
	//show 1 dojo with list of students
	@GetMapping("/dojos/show/{id}")
	public String showDojo(@PathVariable("id")Long id, Model viewModel) {
		viewModel.addAttribute("dojo", this.dService.getOneDojo(id));
		return "/dojos/show.jsp";
	}
	//new ninja form
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja")Ninja ninja, Model viewModel) {
		viewModel.addAttribute("dojo",this.dService.getAllDojos());
		return "/ninjas/newninja.jsp";
	}
	
	//create dojo
	@PostMapping("/dojos/createDojo")
	public String createDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result){
		if(result.hasErrors()) {
			return "/dojos/newdojo.jsp";
		}
		dService.createDojo(dojo);
		return "redirect:/dojos/new";
	}
	//create ninja
	@PostMapping("/ninjas/createNinja")
	public String createNinja(@Valid @ModelAttribute("ninja")Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return"/ninjas/newninja.jsp";
		}
		dService.createNinja(ninja);
//		return "/ninjas/newninja.jsp";
		return String.format("redirect:/dojos/show/%s", ninja.getDojo().getId());
//		return "redirect:/";
	}
}

