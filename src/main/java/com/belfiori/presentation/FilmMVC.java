package com.belfiori.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belfiori.entities.Film;
import com.belfiori.services.FilmService;

@Controller
@RequestMapping("")
public class FilmMVC {

	@Autowired
	private FilmService service;
	
	@GetMapping("all")
	public String films(Model m){
		//return service.trovaTutti();
		m.addAttribute("elencoFilm", service.trovaTutti());
		return "elenco";
	}
	
	@GetMapping("all/{title}")
	public String films(@PathVariable String title, Model m){
		m.addAttribute("elencoFilm", service.trovaTuttiByTitolo(title));
		return "elenco";
	}
}
