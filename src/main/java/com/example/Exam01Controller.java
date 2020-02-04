package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

	@RequestMapping("")
	public String index(){
		return "exam01";
	}
	
	@RequestMapping("/receive-form")
	public String receiveForm(){
		return "exam01-result";
	}
}
