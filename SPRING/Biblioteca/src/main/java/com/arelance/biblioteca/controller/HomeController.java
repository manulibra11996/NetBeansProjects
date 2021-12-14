package com.arelance.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.arelance.biblioteca.service.ILibroService;

@Controller
public class HomeController {
	@Autowired
	private ILibroService libroServices;
	
	@GetMapping("/")
	public String mostarTabla(Model model) {
		model.addAttribute("libros", libroServices.listarLibros());
		return "index";
	}
	
	@GetMapping("/pruebas")
	public String mostarTabla2(Model model) {
		model.addAttribute("libros", libroServices.listarLibros());
		return "index";
	}
	
	/*@GetMapping("/verDetalle/{idVacante}")
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
	 *//*
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
	@GetMapping("/crearVacante")
	public String altaVacante() {
	return "crearVacante";	
	}
	
	@GetMapping("/formulario")
	public String Pruebas() {
	return "formulario";	
	}

	@PostMapping("/guardar")
	public void guardarVacante(Vacante vacante,BindingResult result,HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		if(result.hasErrors()) {
			request.getRequestDispatcher("crearVacante").forward(request, response);
		}
		vacantesServices.altaVacante(vacante);
		response.sendRedirect("/tabla");
		//request.getRequestDispatcher("/tabla").forward(request, response);
		//return "tabla";
		
	}

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		//SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, false));	
	}
	
	@RequestMapping(value="/guardarPuebas")
	public String guardarVacante(@RequestParam("nombre") String nombre,@RequestParam("fecha") Date fecha, Model model)  {
		model.addAttribute("nombre",nombre);
		model.addAttribute("fecha", fecha);
		return "mostrarDato";
		
	}*/
//	static DateTimeFormatter formatoDeEntrada = DateTimeFormatter.ofPattern("dd-MM-yy");
//    static DateTimeFormatter formatoDeSalida = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//
//    public String convierte(String fechaEnTexto) {
//        LocalDate fecha = LocalDate.parse(fechaEnTexto, formatoDeEntrada);
//        return fecha.format(formatoDeSalida);
}
