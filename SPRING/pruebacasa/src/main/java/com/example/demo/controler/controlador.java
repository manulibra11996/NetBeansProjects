package com.example.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controlador {

	
	@GetMapping("/")
	public String mostrar() {
		return "index";
	}
}
