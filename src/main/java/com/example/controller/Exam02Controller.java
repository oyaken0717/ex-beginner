package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

	@RequestMapping("")
	public String index(){
		return "exam02";
	}
	
	@RequestMapping("/receive-form")
	public String receiveForm(String name, Model model){
		model.addAttribute("name",name);
		return "exam01-result";
	}
}


