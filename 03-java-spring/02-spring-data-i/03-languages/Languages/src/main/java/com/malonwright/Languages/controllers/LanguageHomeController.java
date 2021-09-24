package com.malonwright.Languages.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
		viewModel.addAttribute("allLanguages", this.lService.getAllLanguages());
		return "/index.jsp";

	}
	@GetMapping("/show/{id}")
	public Language getOneLanguage(@PathVariable("id")Long id) {
		return this.lService.getOneLanguage(id);
	}
	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("language")Language language, BindingResult result) {
		if (result.hasErrors()) {
			return "/index.jsp";
		}else {
			lService.createLanguage(language);
			return "redirect:/";
		}
//		return this.lService.createLanguage(language);
	}
	
	@GetMapping("/{id}/edit")
	public String editLanguage(@PathVariable("id")Long id, @ModelAttribute("language") Language language, Model viewModel) {
		viewModel.addAttribute("language", this.lService.getOneLanguage(id));
		return "/edit,jsp";
	}
	
	@PostMapping(value="/{id}/edit")
	public String edit(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable ("id") Long id, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("language", this.lService.getOneLanguage(id));
			return "/edit.jsp";
		}else {
			lService.editLanguage(language);
			return "redirect:/";
		}
	}
	
//	@PostMapping("/htmladd")
//	public String htmlAdd(@RequestParam("languageName") String language, @RequestParam("creatorName") String creator, @RequestParam("version") Integer version) {
//		Language languageToSave = new Language(language, creator, version);
//		return "redirect:/";
//	}
	
}
