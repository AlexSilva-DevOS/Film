package com.belfiori.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belfiori.entities.Film;
import com.belfiori.services.FilmService;

@RestController
@RequestMapping("api")
public class FilmRest {

	@Autowired
	private FilmService service;
	
	@GetMapping("all")
	public List<Film> films(){
		return service.trovaTutti();
	}
	@GetMapping("all/{title}")
	public List<Film> films(@PathVariable String title){
		return service.trovaTuttiByTitolo(title);
	}
}
