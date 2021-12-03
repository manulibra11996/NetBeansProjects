package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import Beans.Departamentos;
import Beans.Empleado;

@Controller
@RequestMapping("/perfil/usuario")
public class GestorPerfilUsuarioControler{
	
	@GetMapping(value ={"/informacion/{nombre}","/informacion"})
	public String EjemploParametro(@PathVariable(required = false) String nombre,Model model) {
		if(nombre!=null)
		model.addAttribute("nombre", buscarEmpleadoporId(nombre).orElseGet(Empleado::new));
		else {
			return "errorLocalizacionUsuario";
		}
		
		return "informacion";
	}
	

	private Optional<Empleado> buscarEmpleadoporId(String nombre) {
		
		return crearEmpleados().stream().filter(u->u.getNombre().equalsIgnoreCase(nombre)).findAny();
		
	}
	
	
	private List<Empleado> crearEmpleados(){
		return List.of(new Empleado(1,"logo.png","Gabriel", "Gomez", Departamentos.RRHH,1),
				new Empleado(2,"logo2.png","Jorge", "Martin", Departamentos.Contabilidad,0),
				new Empleado(3,"Manuel", "Fernández", Departamentos.Programacion,0));
	}
}
