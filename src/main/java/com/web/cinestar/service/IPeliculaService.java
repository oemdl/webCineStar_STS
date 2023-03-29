package com.web.cinestar.service;

import java.util.List;

import com.web.cinestar.model.Pelicula;
import com.web.cinestar.model.PeliculaList;

public interface IPeliculaService {
	
	public Pelicula getPelicula(int id);
	public List<PeliculaList> getPeliculas(int id);
}
