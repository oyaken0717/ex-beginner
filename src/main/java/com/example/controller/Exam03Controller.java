package com.example.controller;


import javax.servlet.ServletContext;

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
//	public String receiveForm(Integer item1,Integer item2,Integer item3){
//		Integer nonTaxPrice = item1 + item2 + item3;
//		Integer taxPrice = (int) (nonTaxPrice * 1.1);
//		application.setAttribute("nonTaxPrice", nonTaxPrice);
//		application.setAttribute("taxPrice", taxPrice);
//		return "exam03-result";
//	}

	@RequestMapping("/receive-form")
	public String receiveForm(Integer item1,Integer item2,Integer item3){
		Integer nonTaxPrice = item1 + item2 + item3;
		Integer taxPrice = (int) (nonTaxPrice * 1.1);
		application.setAttribute("nonTaxPrice", nonTaxPrice);
		application.setAttribute("taxPrice", taxPrice);
		return "exam03-result";
	}

}

	
