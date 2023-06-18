package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //use to processing http request
public class IndexController {

	@GetMapping("/")  //load this index page at project start
	public String index() {
		return "index";  //view page name
	}
}
