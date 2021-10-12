package com.malonwright.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.malonwright.authenication.UserValidator.userValidator;
import com.malonwright.authentication.models.User;
import com.malonwright.authentication.service.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService uService;
	
	@Autowired
	private userValidator validator;
	
	
	//Index-registration and login page
	@GetMapping("/")
	public String registerForm(@ModelAttribute("user") User user) {
		return "registrationPage.jsp";
	}
	
	//register user
	@PostMapping("/registration")
	public String registerUser(@Valid @ModelAttribute("user")User user,BindingResult result, HttpSession session) {
		validator.validate(user, result);
		if(result.hasErrors()) {
			return "/registrationPage.jsp";
		}
		User newUser = this.uService.registerUser(user);
		session.setAttribute("userId", newUser);
		return "redirect:/";
	}
	//login and authenticate
	@PostMapping("/login")
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session,RedirectAttributes redirectAttr) {
		if(!uService.authenticateUser(email, password)) {
			redirectAttr.addFlashAttribute("loginError", "Invalid Credentials");
			return "redirect:/";
		}
		User u =uService.findByEmail(email);
		session.setAttribute("user__id", u.getId());
		return "redirect:/home";
	}
	
	//Logout
	@GetMapping("/logout")
	public String Logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	//home Page
	@GetMapping("/home")
	public String Home(HttpSession session, Model viewModel) {
		if(session.getAttribute("user__id") == null) {
			return "redirect:/";
		}
		viewModel.addAttribute("user", this.uService.getOneUser((Long)session.getAttribute("user__id")));
	
		return "homePage.jsp";
	}
	
}
