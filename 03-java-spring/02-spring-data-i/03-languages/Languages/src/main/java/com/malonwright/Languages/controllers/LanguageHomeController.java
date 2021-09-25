package com.malonwright.Languages.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.malonwright.Languages.models.Language;
import com.malonwright.Languages.services.LanguageService;

@Controller
public class LanguageHomeController {
	@Autowired
	private LanguageService lService;
	
	@GetMapping("/")
	public String index(Model viewModel){
		lService.getAllLanguages();
		viewModel.addAttribute("languages", this.lService.getAllLanguages());
		return "/index.jsp";

	}
//	@GetMapping("/show/{id}")
//	public Language getOneLanguage(@PathVariable("id")Long id) {
//		return this.lService.getOneLanguage(id);
//		
//	}
	@GetMapping("/show/{id}")
	public String showOne(@PathVariable("id") Long id, @ModelAttribute("language")Language language, Model viewModel) {
		viewModel.addAttribute("language", this.lService.getOneLanguage(id));
		return "language.jsp";
	}
	@GetMapping("/new")
	public String newLanguage(@ModelAttribute("language") Language language) {
		return "new.jsp";
	}

	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("language")Language language, BindingResult result) {
		if (result.hasErrors()) {
			return "/new.jsp";
		}else {
			lService.createLanguage(language);
			return "redirect:/";
		}

	}
	
	@GetMapping("/edit/{id}")
	public String editLanguage(@PathVariable("id")Long id, @ModelAttribute("language") Language language, Model viewModel) {
		viewModel.addAttribute("language", this.lService.getOneLanguage(id));
		return "/edit.jsp";
	}
	
	@PostMapping(value="/edit/{id}")
	public String edit(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "/edit.jsp";
		}else {
			lService.editLanguage(language);
			return "redirect:/";
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public String destroy(@PathVariable("id")Long id) {
		lService.deleteLanguage(id);
		return "redirect:/";
	}
//	@PostMapping("/htmladd")
//	public String htmlAdd(@RequestParam("languageName") String language, @RequestParam("creatorName") String creator, @RequestParam("version") Integer version) {
//		Language languageToSave = new Language(language, creator, version);
//		return "redirect:/";
//	}
	
}
