package com.arelance.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.arelance.biblioteca.service.ILibroService;

@Controller
public class HomeController {
	@Autowired
	private ILibroService libroServices;
	
	@GetMapping("/")
	public String mostarTabla(Model model) {
		model.addAttribute("libros", libroServices.listarLibros());
		return "index";
	}
	
	@GetMapping("/pruebas")
	public String mostarTabla2(Model model) {
		model.addAttribute("libros", libroServices.listarLibros());
		return "index";
	}
	
	
}
