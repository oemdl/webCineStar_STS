package com.web.cinestar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.cinestar.model.Pelicula;
import com.web.cinestar.model.PeliculaList;
import com.web.cinestar.repository.IPelicula;
import com.web.cinestar.repository.IPeliculaList;

@Service
public class PeliculaService implements IPeliculaService{

	@Autowired
	private IPeliculaList iPeliculaList;
	
	@Autowired
	private IPelicula iPelicula;

	@Override
	public Pelicula getPelicula(int id) {
		return iPelicula.getPelicula(id);
	}

	@Override
	public List<PeliculaList> getPeliculas(int id) {
		return iPeliculaList.getPeliculas(id);
	}

}
