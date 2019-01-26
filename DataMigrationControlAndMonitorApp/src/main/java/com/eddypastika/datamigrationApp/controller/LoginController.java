package com.eddypastika.datamigrationApp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.eddypastika.datamigrationApp.form.LoginForm;

@Controller
public class LoginController {
	
	@Value("${error.message}")
	private String errorMessage;
	
	@GetMapping({"/", "index", "login"})
	public String showLoginPage(Model model) {
		
		LoginForm loginForm = new LoginForm();
		model.addAttribute("loginForm", loginForm);
		return "login";
	}
	
	@PostMapping("/login")
	public String loginUser(Model model, @ModelAttribute("loginForm") LoginForm loginForm, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()){
	        System.out.println("There was a error "+bindingResult);
	        System.out.println("User is: "+ loginForm.getUserName());
	        return "login";
	    }


		String result = "";
		String username = loginForm.getUserName();
		String password = loginForm.getPassWord();
		
		if (password.equals("Akukamu123")) {
			result = "layout";
		} else {
			model.addAttribute("errorMessage", errorMessage);
			//model.addAttribute("personForm", new PersonForm());
			result = "login";
		}
		return result;
	}

}
