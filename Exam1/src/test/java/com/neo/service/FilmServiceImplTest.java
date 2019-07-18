package com.neo.service;

import com.neo.MybatisXmlApplicationTests;
import com.neo.aop.ServiceAspect;
import com.neo.config.Config;
import com.neo.model.Film;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import static org.junit.Assert.*;

public class FilmServiceImplTest extends MybatisXmlApplicationTests {
	@Autowired
	private FilmService filmService;
	private static final Logger log = LoggerFactory.getLogger(FilmServiceImplTest.class);
	@Autowired
	private Config config;
//	@Test
//	public void selectById() {
//		short s1  = 1;
//		Film film=filmService.selectById(s1);
//		System.out.println(film);
//	}

	@Test
	public void sert() {
		log.info("-------------------------------------------------------------");
		log.info("File Title:"+config.getTitle());
		log.info("File Description:"+config.getDescription());
		log.info("File LanguageId:"+config.getLanguageId());
		Film film=new Film();
		film.setDescription(config.getDescription());
		film.setTitle(config.getTitle());
		film.setLanguageId(config.getLanguageId());

		filmService.inser(film);
		System.out.println("插入成功");
		log.info("---------------------------------------------");
	}
}