package com.example;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import Beans.Departamentos;
import Beans.Empleado;



@Controller
public class Ejemplo1Controler {
	@GetMapping("/")
	public String goHome(Model model) {
		model.addAttribute("nombre","Grabriel");
		List<String> ciudades = new LinkedList<>();
		ciudades.add("Madrid");
		ciudades.add("Toledo");
		ciudades.add("Sevilla");
		model.addAttribute("ciudades", ciudades);
		
		List<Empleado> empleado = new LinkedList<>();
		empleado.add(new Empleado(1,"logo.png","Gabriel", "Gomez", Departamentos.RRHH,1));
		empleado.add(new Empleado(2,"logo2.png","Jorge", "Martin", Departamentos.Contabilidad,0));
		empleado.add(new Empleado(3,"Manuel", "Fernández", Departamentos.Programacion,0));
		model.addAttribute("empleados", empleado);
		return "home";
	}
	
}
