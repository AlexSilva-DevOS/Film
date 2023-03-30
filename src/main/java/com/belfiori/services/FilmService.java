package com.belfiori.services;

import java.util.List;

import com.belfiori.entities.Film;

public interface FilmService {
	
	List<Film> trovaTutti();
	
	List<Film> trovaTuttiByRating(double min, double max);
	
	List<Film> trovaTuttiByTitolo(String titolo);
	
	Film getFilmById(int id);
	
	
	
	

}
