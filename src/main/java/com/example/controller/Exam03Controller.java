package com.example.controller;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index(){
		return "exam03";
	}
	
//	@RequestMapping("/receive-form")
//	public String receiveForm(Integer num1,Integer num2){
//		int answer = num1 + num2;
//		session.setAttribute("num1",num1);
//		session.setAttribute("num2",num2);
//		session.setAttribute("answer",answer);
//		return "exam02-result";
//	}
//	
//	@RequestMapping("to-page2")
//	public String toPage2(){
//		return "exam02-result2";
//	}

}

	
