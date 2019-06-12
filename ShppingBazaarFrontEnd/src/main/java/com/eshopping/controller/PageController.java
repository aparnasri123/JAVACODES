package com.eshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping(value="/login")
	public String showLoginPage() 
	{
		System.out.println("Login Page executed");
		return "Login";
	}
	
	@RequestMapping(value="/register")
	public String showRegisterationPage()
	{
		System.out.println("Registration Page executed");
		return "Register";
	}
	
}
