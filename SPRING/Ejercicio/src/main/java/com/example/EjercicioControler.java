package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjercicioControler {
	@GetMapping("/")
	public String goIndex() {;
		return "index";
	}
	
	@GetMapping("/Destino")
	public String goDestino() {
		return "p2";
	}
	
	@GetMapping("/Perfil")
	public String goPerfil() {
		return "p1";
	}
}
