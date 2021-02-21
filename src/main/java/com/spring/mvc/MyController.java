package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController { 

	@RequestMapping("/") 
	public String showPage() {
		return "main-menu";
	}
	
	@RequestMapping("/enterName")
	public String enterName() {
		return "enter-name";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "hello-name";
	}
	
	@RequestMapping("/shout")
	public String letsShout(HttpServletRequest req, Model model) {
		String theName = req.getParameter("shoutName");
		theName = theName.toUpperCase();
		
		String result = "Yo " + theName;
		
		model.addAttribute("message", result);
		
		return "shouting-it-out";
	}
	
	@RequestMapping("/shoutV2")
	public String letsShoutUsingReqParam(@RequestParam("shoutversion2") String theName, Model model) {
		theName = theName.toUpperCase();
		
		String result = "Hello, " + theName;
		
		model.addAttribute("message", result);
		
		return "shouting-it-out";
	}
	
}	
