package com.example;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ejemplo1Controler {
	@GetMapping("/")
	public String goHome(Model model) {
		model.addAttribute("nombre","Grabriel");
		List<String> ciudades = new LinkedList<>();
		ciudades.add("Madrid");
		ciudades.add("Toledo");
		ciudades.add("Sevilla");
		model.addAttribute("ciudades", ciudades);
		return "home";
	}
	
}
