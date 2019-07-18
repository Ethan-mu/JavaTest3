package com.neo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:docker-compose.properties"})
public class Config {

	@Value("${service.title}")
	private String title;
	@Value("${service.languageId}")
	private byte languageId;

	@Value("${service.description}")
	private String description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public byte getLanguageId() {
		return languageId;
	}

	public void setLanguageId(byte languageId) {
		this.languageId = languageId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}