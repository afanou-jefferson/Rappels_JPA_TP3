package fr.diginamic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.services.FilmService;


@RestController
@RequestMapping("")
// Le controller Main doit être dans un package fils du Main sinon il n'est pas détecté.
public class MainController {
	
	@Autowired
	private FilmService filmService;
	
	public MainController() {
		super();
	}
	
	@GetMapping("tp3")
	//@GetMapping
	public void getTp() {
		this.filmService.insertTp3();
	}
}
