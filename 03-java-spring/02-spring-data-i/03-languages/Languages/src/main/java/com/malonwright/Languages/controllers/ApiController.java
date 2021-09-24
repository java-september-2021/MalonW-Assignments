package com.malonwright.Languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malonwright.Languages.models.Language;
import com.malonwright.Languages.services.LanguageService;

@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	private LanguageService lService;
	
	@GetMapping("/")
	public List<Language> index(){
		return this.lService.getAllLanguages();
	}
	
	@GetMapping("/{id}")
	public Language getOne(@PathVariable("id") Long id) {
		return this.lService.getOneLanguage(id);
	}
	@PostMapping("/create")
	public Language create(Language language) {
		return this.lService.createLanguage(language);
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		return this.lService.deleteLangauage(id);
	}
}
