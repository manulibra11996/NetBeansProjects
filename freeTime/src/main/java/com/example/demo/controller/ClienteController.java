package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;

@Controller
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/users")
	public String showClientes(Model model) {
		List<Cliente> listadoClientes = (List<Cliente>) clienteRepository.findAll();
		model.addAttribute("titulo", "Listado de Clientes");
		model.addAttribute("listausers",listadoClientes	);
		return "listausers";
	}
	
	//redireccion a pagina crear
	@GetMapping("/pageCrearCliente")
	public String crear(Model model) {
		Cliente cliente = new Cliente();

		model.addAttribute("titulo","Formulario: Nuevo cliente");
		model.addAttribute("cliente",cliente);

		return "crearCliente";
	}
	
	@PostMapping("/guardarCliente") //model attribute, para recibir datos de objeto
	public String guardar(@ModelAttribute Cliente cliente ) {
		
		clienteRepository.save(cliente);
		System.out.println("cliente guardado bien bien guay");
		return "redirect:listausers";
		
	}
	
	
	@InitBinder	//yyyy-MM-dd USAR ESTE FORMATO PARA FECHA, EJEMPLO 1232-11-12
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(
	            dateFormat, false));
	}
	
}
