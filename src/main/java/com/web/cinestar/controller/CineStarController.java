package com.web.cinestar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.web.cinestar.service.CineService;
import com.web.cinestar.service.PeliculaService;

@Controller
public class CineStarController {

	@Autowired
	CineService cineService;
	
	@Autowired
	PeliculaService peliculaService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/cines")
	public String cines(Model model) {
		model.addAttribute("cines", cineService.getCines());
		return "cines";
	}
	
	@GetMapping("peliculas/{idx}")
	public String getPeliculas(@PathVariable("idx") String idx, Model model) {
		if ( idx != null && (idx.equals("cartelera") || idx.equals("estrenos") ) )
			model.addAttribute("peliculas", peliculaService.getPeliculas( idx.equals("cartelera") ? 1 : 2 ) );
		
		return "peliculas";
	}
	
	@GetMapping("pelicula/{id}")
	public String getPelicula(@PathVariable("id") int id, Model model) {
		model.addAttribute("pelicula", peliculaService.getPelicula(id) );
		return "pelicula";
	}
	
}
