package com.arelance.empleos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/vacantes")
public class VacanteController {
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idVacante, Model model) {
	model.addAttribute("idVacanteSeleccionada", idVacante);	
	return "vacantes/verIdSeleccionada";	
	}
	
}
