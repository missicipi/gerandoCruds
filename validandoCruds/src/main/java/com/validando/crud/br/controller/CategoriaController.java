package com.validando.crud.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.validando.crud.br.domain.Categoria;
import com.validando.crud.br.services.CategoriaService;

@Controller
public class CategoriaController {

	@Autowired
	CategoriaService categoriaService;

	@RequestMapping(value = "/categorias", method = RequestMethod.GET)
	public ModelAndView getCategoria() {

		ModelAndView mv = new ModelAndView("categorias");
		List<Categoria> categorias = categoriaService.findAll();
		mv.addObject("categorias", categorias);

		return mv;
	}

}
