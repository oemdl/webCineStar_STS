package com.web.cinestar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CinePelicula {
	String Titulo, Horarios;

	@Id
	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getHorarios() {
		return Horarios;
	}

	public void setHorarios(String horarios) {
		Horarios = horarios;
	}
	
	
}
