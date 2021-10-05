package com.malonwright.ProductsAndCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malonwright.ProductsAndCategories.models.User;
import com.malonwright.ProductsAndCategories.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	
	//Create User
	public User createUser(User user) {
		return this.uRepo.save(user);
	}
	
	//get One User
	public User getOneUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	
	//Get All Users
	public List<User> getAllUsers(){
		return this.uRepo.findAll();
	}
	
	
	
	
}
