package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String getLoginForm() {
		return "Login";
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User user, Model model ) {
		
		if(user.getUsername().equals("ram")&& user.getPassword().equals("123")) {
			model.addAttribute("uname",user.getUsername());
			return "Home";
		}
		
		model.addAttribute("message","user not found!!");
		return "Login";
	}
}
