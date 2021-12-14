package com.example.BibliotecaAutomatica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.BibliotecaAutomatica.service.ILibroService;

@Controller
public class controlador {

	@Autowired
	private ILibroService libroService;
	
	
	@GetMapping("/")
	public String mostrar(Model model) {
		model.addAttribute("libros",libroService.listarLibros());
		return "index";
	}
}
