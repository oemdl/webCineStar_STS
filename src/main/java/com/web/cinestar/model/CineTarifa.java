package com.web.cinestar.model;

import jakarta.persistence.Entity;

@Entity
public class CineTarifa {
	
	String DiasSemana;
	double Precio;
	
	public String getDiasSemana() {
		return DiasSemana;
	}
	public void setDiasSemana(String diasSemana) {
		DiasSemana = diasSemana;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	
}
