package com.malonwright.authenication.UserValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.malonwright.authentication.models.User;
import com.malonwright.authentication.repositories.UserRepository;



@Component
public class userValidator {
	@Autowired
	private UserRepository uRepo;
	
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		
		if (!user.getPassword().equals(user.getPasswordConfirmation())) {
			errors.rejectValue("password","Match", "Passwords do not match!!!!!!!!!");
		}
		if(this.uRepo.existsByEmail(user.getEmail())) {
			errors.rejectValue("email", "Unique", "Email has already been taken!");;
		}
		
	}
}
