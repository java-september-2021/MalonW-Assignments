package com.malonwright.DojosandNinjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malonwright.DojosandNinjas.models.Dojo;
import com.malonwright.DojosandNinjas.models.Ninja;
import com.malonwright.DojosandNinjas.repositories.DojoRepository;
import com.malonwright.DojosandNinjas.repositories.NinjaRepository;

@Service
public class DojoService {

	@Autowired
	private DojoRepository dRepo;
	
	@Autowired
	private NinjaRepository nRepo;
	
	//get all
	public List<Dojo> getAllDojos(){
		return this.dRepo.findAll();
	}
	//get one
	public Dojo getOneDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	//create Dojo
	public Dojo createDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	//Get all
	public List<Ninja> getAllNinjas(){
		return this.nRepo.findAll();
	}
	//create Ninja
	public Ninja createNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
}
