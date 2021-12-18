package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Departamento;
import com.example.demo.entity.Usuario;

@Controller
public class Controller2 {
	
	@GetMapping("/perfil")
	public String pag1(Model model) {
		model.addAttribute("nombre", "Hola Pepe");
		model.addAttribute("user", new Usuario("Maria",25,Departamento.ADMINISTRACION));
		model.addAttribute("usuarios", List.of(new Usuario("Paco", 21,Departamento.ADMINISTRACION,"user1.jpg"), new Usuario("Juan", 33,Departamento.RRHH,"user2.jpg"), new Usuario("Carlos", 55,Departamento.VENTAS)));
		return "pag1";
	}
	
	@GetMapping("/descripcion")
	public String pag2(Model model) {
		
		return "pag2";
	}
	
}
