package com.malonwright.Languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malonwright.Languages.models.Language;
import com.malonwright.Languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	@Autowired
	private LanguageRepository lRepo;
	
	// Get every Single Language in DB
	public List<Language> getAllLanguages(){
		return this.lRepo.findAll();
	}
	//Get one Language
	public Language getOneLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	//Create an Language
	public Language createLanguage(Language language) {
		return this.lRepo.save(language);
	}
	//Update a Language
	public Language editLanguage(Language language) {
		return this.lRepo.save(language);
	}
	//Delete a Language
	public String deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
		return "This language has been deleted";
	}
}
