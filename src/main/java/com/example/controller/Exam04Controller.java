package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	
	@RequestMapping("")
	public String index() {
		return "exam04";
	}

	@RequestMapping("/receive-form")
	public String receiveForm() {
		return "exam04-result";
	}

}
