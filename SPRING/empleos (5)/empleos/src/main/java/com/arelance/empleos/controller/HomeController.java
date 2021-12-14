package com.arelance.empleos.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.arelance.empleos.service.IVacantesServices;
import com.arelance.empleosmodelo.Vacante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@Autowired
	private IVacantesServices vacantesServices;
	//@RequestMapping(value = "/tabla",method = {RequestMethod.GET,RequestMethod.POST})
	@GetMapping("/tabla")
	public String mostarTabla(Model model) {
		model.addAttribute("vacantes", vacantesServices.listarVacantes());
		return "tabla";
	}
	@GetMapping("/verDetalle/{idVacante}")
	public String mostrarVacante(@PathVariable Integer idVacante,Model model) {
		Vacante vacante = vacantesServices.buscarPorID(idVacante);
		model.addAttribute("vacante", vacante);
		return "detalle";
	}

	@GetMapping("/listado")
	public String mostraListado(Model model) {
		List<String> ofertas = new LinkedList<>();
		ofertas.add("Ingeniero Industrial");
		ofertas.add("vikingo");
		ofertas.add("Técnico Contable");
		ofertas.add("Ingeniero Quimico");
		ofertas.add("Vendedor");
		ofertas.add("Arquitecto");
		model.addAttribute("ofertas", ofertas);
		return "listado";
	}

	/**
	 * @param model
	 * @return home
	 */
	@GetMapping("/")
	public String mostrarHome(Model model) {
		String nombre = "Auxiliar de Contabilidad";
		Date FechaPublicacion = new Date();
		double salario = 9000.0;
		boolean vigente = true;
		model.addAttribute("nombre", nombre);
		model.addAttribute("fecha", FechaPublicacion);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);

		return "home";
	}
//	@GetMapping("/crearVacante")
//	public String altaVacante(Vacante vacante) {
//	return "crearVacante";	
//	}
	@RequestMapping(value = "/crearVacante",method = {RequestMethod.GET,RequestMethod.POST})
	public String altaVacante(Vacante vacante) {
	return "crearVacante";	
	}
	@PostMapping("/guardar")
	public String guardarVacante(Model model,Vacante vacante,BindingResult result,RedirectAttributes attributes) {
		if(result.hasErrors()) {
			for(ObjectError error:result.getAllErrors()) {
				System.err.println("Error:"+error.getDefaultMessage());
			}
			return "/crearVacante";
		}
		vacantesServices.altaVacante(vacante);
		attributes.addFlashAttribute("msg", "registro guardado");
		return "redirect:/tabla";
		
	}
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		//SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, false));
		
	}
	
//	static DateTimeFormatter formatoDeEntrada = DateTimeFormatter.ofPattern("dd-MM-yy");
//    static DateTimeFormatter formatoDeSalida = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//
//    public String convierte(String fechaEnTexto) {
//        LocalDate fecha = LocalDate.parse(fechaEnTexto, formatoDeEntrada);
//        return fecha.format(formatoDeSalida);
}
