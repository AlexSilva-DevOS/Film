package com.belfiori.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belfiori.entities.Film;
import com.belfiori.repo.FilmDAO;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmDAO dao;
	
	@Override
	public List<Film> trovaTutti() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Film> trovaTuttiByRating(double min, double max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film> trovaTuttiByTitolo(String titolo) {
		// TODO Auto-generated method stub
		return dao.findByTitleContaining(titolo);
	}

	@Override
	public Film getFilmById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
