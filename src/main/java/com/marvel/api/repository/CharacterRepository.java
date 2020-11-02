package com.marvel.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marvel.api.model.Character;

public interface CharacterRepository extends JpaRepository<Character, Long>{


}
