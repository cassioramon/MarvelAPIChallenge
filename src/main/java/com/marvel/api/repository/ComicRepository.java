package com.marvel.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marvel.api.model.Comic;

public interface ComicRepository extends JpaRepository<Comic, Long>{


}
