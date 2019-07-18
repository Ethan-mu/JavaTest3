package com.neo.web;

import java.util.List;

import com.neo.model.Film;
import com.neo.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	@RequestMapping("/getUsers")
	public List<Film> getUsers() {
		return null;
	}




}