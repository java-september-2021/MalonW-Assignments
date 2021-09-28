package com.malonwright.DojosandNinjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.malonwright.DojosandNinjas.models.Dojo;
import com.malonwright.DojosandNinjas.models.Ninja;
import com.malonwright.DojosandNinjas.services.DojoService;


@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private DojoService dService;
	
	@GetMapping("/dojos")
	public List<Dojo> dojoIndex(){
		return this.dService.getAllDojos();
	}
	
	@GetMapping("/ninjas")
	public List<Ninja> ninjaIndex(){
		return this.dService.getAllNinjas();
	}

	@PostMapping("/ninja/create")
	public Ninja createN(Ninja ninja) {
		return this.dService.createNinja(ninja);
	}
}
