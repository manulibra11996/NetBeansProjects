package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Opinion;
import com.example.demo.repository.OpinionRepository;

@Controller
public class OpinionController {

	@Autowired
	private OpinionRepository opinionRepository;
	
	@GetMapping("/opinion")
	public String showOpinion(Model model) {
		List<Opinion> listadoOpiniones = (List<Opinion>) opinionRepository.findAll();
		model.addAttribute("titulo", "Listado de Opiniones");
		model.addAttribute("listaopinion",listadoOpiniones	);
		return "listaopinion";
	}
	
	//redireccion a pagina crear una opinion
	@GetMapping("/pageCrearOpinion")
	public String crearOpinion(Model model) {
		Opinion opinion = new Opinion();

		model.addAttribute("titulo","Formulario: Nuevo cliente");
		model.addAttribute("opinion",opinion);

		return "crearOpinion";
	}
	
	@PostMapping("/guardarOpinion") //model attribute, para recibir datos de objeto
	public String guardar(@ModelAttribute Opinion opinion ) {
		
		opinionRepository.save(opinion);
		System.out.println("opinion guardado hasta el sin de los tiempos");
		return "redirect:opinion";
		
	}
	
	
	@GetMapping("/editOpinion/{id}")
	public String editar(@PathVariable("id") Long idOpinion, Model model) {
		Optional<Opinion> opinion = opinionRepository.findById(idOpinion);
		
		
		model.addAttribute("titulo","Formulario: Editar opinion");
		model.addAttribute("opinion",opinion);
		return "crearOpinion";
	}
	
	
	@GetMapping("/deleteOpinion/{id}")
	public String eliminar(@PathVariable("id")  Long idOpinion) {

		opinionRepository.deleteById(idOpinion);
		System.out.println("registro eliminado y no se podra recuperar nunca muahahahaha");
		
		return "redirect:/opinion";
	}
	
	
}
