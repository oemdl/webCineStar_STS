package com.web.cinestar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
