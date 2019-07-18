package com.neo.service;

import com.neo.mapper.FilmMapper;
import com.neo.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl implements FilmService {
	@Autowired
	private FilmMapper filmMapper;
	@Override
	public Film selectAll() {


		return null;
	}

	@Override
	public Film selectById(short id) {
		short s1  = 1;
		Film film=filmMapper.selectByPrimaryKey(s1);
		return film;
	}

	@Override
	public void inser(Film film) {
		filmMapper.insertSelective(film);
	}
}
