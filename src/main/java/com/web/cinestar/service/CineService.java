package com.web.cinestar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.cinestar.model.Cine;
import com.web.cinestar.model.CinePelicula;
import com.web.cinestar.model.CineTarifa;

import com.web.cinestar.repository.ICine;

@Service
public class CineService implements ICineService{
	
	@Autowired
	private ICine iCine;

		
	@Override
	public Cine getCine(int id) {
		return iCine.getCine(id);
	}

	@Override
	public List<Cine> getCines() {
		return iCine.getCines();
	}

	@Override
	public List<CineTarifa> getCineTarifas(int id) {
		return iCine.getCineTarifas(id);
	}

	@Override
	public List<CinePelicula> getCinePeliculas(int id) {
		return iCine.getCinePeliculas(id);
	}

}
