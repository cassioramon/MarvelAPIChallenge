package com.marvel.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marvel.api.model.Event;

public interface EventRepository extends JpaRepository<Event, Long>{


}
