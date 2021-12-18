package com.example.BibliotecaAutomatica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.BibliotecaAutomatica.modelo.Libro;
import com.example.BibliotecaAutomatica.service.IAutorService;
import com.example.BibliotecaAutomatica.service.ILibroService;

@Controller
@RequestMapping(value="/libros")
public class librosControler {
	
	@Autowired
	private ILibroService libroService;
	
	@Autowired
	private IAutorService autorService;
	
	@GetMapping("/insertar")
	public String verDetalle(Model model) {
		model.addAttribute("autores",autorService.listarAutores());
		return "libros/insertar";	
	}
	
	@PostMapping("/guardar")
	public String guardarVacante(Model model,Libro libro,BindingResult result,RedirectAttributes attributes) {
		if(result.hasErrors()) {
			for(ObjectError error:result.getAllErrors()) {
				System.err.println("Error:"+error.getDefaultMessage());
			}
			return "/libros/insertar";
		}
		libroService.altaLibro(libro);
		return "redirect:/";
		
	}
}
