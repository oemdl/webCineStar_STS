package com.web.cinestar.service;

import java.util.List;

import com.web.cinestar.model.Cine;
import com.web.cinestar.model.CinePelicula;
import com.web.cinestar.model.CineTarifa;

public interface ICineService {

	public Cine getCine(int id);
	public List<Cine> getCines();
	public List<CineTarifa> getCineTarifas(int id);
	public List<CinePelicula> getCinePeliculas(int id);
}