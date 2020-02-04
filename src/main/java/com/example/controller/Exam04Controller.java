package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.User;
import com.example.form.UserForm;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	@ModelAttribute
	public UserForm stUpForm() {
		return new UserForm();
	}

	@RequestMapping("")
	public String index() {
		return "exam04";
	}

	@RequestMapping("/receive-form")
	public String receiveForm(@Validated UserForm form, BindingResult result, RedirectAttributes redirectAttributes,
			Model model) {
		if (result.hasErrors()) {
			// ■indexメソッドがmodelを受け取る形になっている。
			// > checkboxでmodelが必要になる為。
			return index();
		}

		User user = new User();
		BeanUtils.copyProperties(form, user);
//		user.setName(form.getName());
		user.setAge(form.getIntAge());
//		user.setComment(form.getComment());
		model.addAttribute("user", user);
		return "exam04-result";
	}

}
