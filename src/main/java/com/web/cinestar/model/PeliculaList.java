package com.web.cinestar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PeliculaList {

	@Id
	private int id;
	private String Titulo;
	private String Link;
	private String Sinopsis;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getLink() {
		return Link;
	}

	public void setLink(String link) {
		Link = link;
	}

	public String getSinopsis() {
		return Sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		Sinopsis = sinopsis;
	}
	
}
