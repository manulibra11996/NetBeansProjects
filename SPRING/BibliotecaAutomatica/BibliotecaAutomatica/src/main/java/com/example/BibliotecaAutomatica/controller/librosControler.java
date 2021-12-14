package com.example.BibliotecaAutomatica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/libros")
public class librosControler {
	@GetMapping("/insertar")
	public String verDetalle() {
	return "libros/insertar";	
	}
}
