package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.model.User;

@Controller
public class RegisterController {
	
	@GetMapping("/register")
	public String getRegisterForm() {
		return "Register";
	}
	
	@PostMapping("/register")
	public String postSignUp(@ModelAttribute User user, Model model ) {
		model.addAttribute("fname",user.getFname());
		model.addAttribute("lname",user.getLname());
		model.addAttribute("uname",user.getUsername());
		model.addAttribute("psw",user.getPassword());
		
		return "Profile";
	}

	

}

