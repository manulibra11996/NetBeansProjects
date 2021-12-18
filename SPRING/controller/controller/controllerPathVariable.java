package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Departamento;
import com.example.demo.entity.Usuario;

@Controller
public class controllerPathVariable {

	@GetMapping("/recogerId/{id}")
	public String recogerId(@PathVariable("id")Integer id, Model model) {
		model.addAttribute("idRecogido", id);
		return "pag2";
	}
	
	@GetMapping({"/buscarEmpleado/{nombre}","/buscarEmpleado/"})
	public String buscarEmpleado(@PathVariable(required = false) String nombre, Model model) {
		if(nombre!=null)
		model.addAttribute("usuario", buscarUsuarioporId(nombre).orElseGet(Usuario::new));  
		
		return "pag2";
	}
	
	
	private Optional<Usuario> buscarUsuarioporId(String nombre) {
		
		return crearEmpleados().stream().filter(u->u.getNombre().equalsIgnoreCase(nombre)).findAny();
		
	}
	
	
	private List<Usuario> crearEmpleados(){
		return List.of(new Usuario("Paco", 21,Departamento.ADMINISTRACION), 
				new Usuario("Juan", 33,Departamento.RRHH), 
				new Usuario("Carlos", 55,Departamento.VENTAS));
	}
	
	
	
}
