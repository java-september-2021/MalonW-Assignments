package com.malonwright.authentication.service;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malonwright.authentication.models.User;
import com.malonwright.authentication.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	
	//Get all users
	public List<User> getAllUsers(){
		return this.uRepo.findAll();
	}
	
	public User getOneUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}

	//Register user and hash their password
	public User registerUser(User user) {
		//Generate Hash
		String hashed = BCrypt.hashpw(user.getPassword(),BCrypt.gensalt());
		//Set the hashed password on the users password field
		user.setPassword(hashed);
		//Save the user and the user Object to the db
		return this.uRepo.save(user);
	}
	
	// authenticate user
	public boolean authenticateUser(String email, String password) {
		//first find the user by email
		User user = this.uRepo.findByEmail(email);
		//if we can't find it by email, return false
		if(user == null) {
			return false;
		} else {
			//if passwords match, return true, else false
			return BCrypt.checkpw(password,  user.getPassword()); 
		}
	}
	//find user by email
	public User findByEmail(String email) {
		return uRepo.findByEmail(email);
	}

	
}
