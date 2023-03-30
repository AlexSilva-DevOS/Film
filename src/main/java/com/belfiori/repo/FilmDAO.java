package com.belfiori.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belfiori.entities.Film;

public interface FilmDAO extends JpaRepository<Film, Integer>{
	
	List<Film> findByTitleContaining(String title);//named query - derived query

}
