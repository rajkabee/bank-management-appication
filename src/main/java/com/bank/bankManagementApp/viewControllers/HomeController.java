package com.bank.bankManagementApp.viewControllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@Value("${bank_name}")
	String bank_name;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("bank_name", bank_name);
		return "home";
	}
	
	@RequestMapping("createUserForm")
	public String createUserForm(Model model) {
		model.addAttribute("bank_name", bank_name);
		return "createUserForm";
	}
	
}
