package com.neo.service;


import com.neo.model.Film;

public interface FilmService {

	Film selectAll();
	Film selectById(short id);
	void inser(Film film);
}
