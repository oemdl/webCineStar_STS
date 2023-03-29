package com.web.cinestar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.web.cinestar.model.Cine;
import com.web.cinestar.model.CinePelicula;
import com.web.cinestar.model.CineTarifa;

@Repository
public interface ICine extends JpaRepository<Cine, Integer> {

	@Query(value = "{call sp_getCine(:id)}", nativeQuery = true )
	Cine getCine(int id);
	
	@Query(value = "{call sp_getCines()}", nativeQuery = true )
	List<Cine> getCines();
	
	@Query(value = "{call sp_getCineTarifas(:id)}", nativeQuery = true )
	List<CineTarifa> getCineTarifas(int id);
	
	@Query(value = "{call sp_getCinePeliculas(:id)}", nativeQuery = true )
	List<CinePelicula> getCinePeliculas(int id);
	
}
