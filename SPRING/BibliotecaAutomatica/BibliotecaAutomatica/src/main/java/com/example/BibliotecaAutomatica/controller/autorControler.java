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

import com.example.BibliotecaAutomatica.modelo.Autor;
import com.example.BibliotecaAutomatica.service.IAutorService;

@Controller
@RequestMapping(value="/autores")
public class autorControler {
	
	
	@GetMapping("/insertar")
	public String verDetalle(Model model) {
		return "autores/insertar";	
	}
	
	@PostMapping("/guardar")
	public String guardarVacante(Model model,Autor autor,BindingResult result,RedirectAttributes attributes) {
		if(result.hasErrors()) {
			for(ObjectError error:result.getAllErrors()) {
				System.err.println("Error:"+error.getDefaultMessage());
			}
			return "/autores/insertar";
		}

		return "redirect:/";
		
	}
}
