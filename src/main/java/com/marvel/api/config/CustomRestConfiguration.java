package com.marvel.api.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

import com.marvel.api.model.Character;
import com.marvel.api.model.Comic;
import com.marvel.api.model.Event;

@Component
public class CustomRestConfiguration implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Character.class, Event.class, Comic.class);

	}

}
