package com.example;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Beans.Departamentos;
import Beans.Empleado;

@Controller
public class vacanteControler {
	@GetMapping("/crearVacante")
	public String goVacante() {
		return "crearVacante";
	}
	
	
}
