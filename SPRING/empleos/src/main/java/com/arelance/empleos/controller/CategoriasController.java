package com.arelance.empleos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/categorias")
public class CategoriasController {
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public String crear() {
		return "categorias/formCategorias";
	}
	@RequestMapping(value="/index",method = RequestMethod.GET)
	public String mostarIndex() {
		return "categorias/listCategorias";
	}
	@RequestMapping(value="/save",method = RequestMethod.GET)
	public String guardar() {
		return "categorias/listCategorias";
	}

}
