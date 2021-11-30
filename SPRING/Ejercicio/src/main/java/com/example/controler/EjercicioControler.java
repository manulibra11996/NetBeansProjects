package com.example.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjercicioControler {
	@GetMapping("/")
	public String goIndex(Model model) {
		model.addAttribute("nombre","Manuel");
		return "index";
	}
	@GetMapping("/Perfil")
	public String goPerfil() {
		return "categoria/p1";
	}
	
	@GetMapping("/Destino")
	public String goDestino() {
		return "categoria/p2";
	}
	
}
