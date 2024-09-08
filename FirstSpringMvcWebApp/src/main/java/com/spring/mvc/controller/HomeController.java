package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping(path="/login")
	public String loginPage() {
		return "login";
	}

}