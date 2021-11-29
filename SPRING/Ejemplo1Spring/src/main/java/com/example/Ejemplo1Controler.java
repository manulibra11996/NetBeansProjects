package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ejemplo1Controler {
	@GetMapping("/")
	public String goHome(Model model) {
		model.addAttribute("nombre","");
		return "home";
	}
	
}
