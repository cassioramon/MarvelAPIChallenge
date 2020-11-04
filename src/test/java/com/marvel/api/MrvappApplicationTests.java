package com.marvel.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.marvel.api.model.Character;
import com.marvel.api.repository.CharacterRepository;

@SpringBootTest
@AutoConfigureMockMvc
class MrvappApplicationTests {
	
	@Autowired
	private MockMvc mock;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private CharacterRepository characterRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	void findAllCharacters() throws Exception {			
		List<Character> characters = characterRepository.findAll();
		Assertions.assertNotNull(characters);
		Assertions.assertNotEquals(characters.size(), 0);		
	}
	
	@Test
	void characterFound() throws Exception {		
		ResultActions result =  mock.perform(get("/characters/1"));		
		result.andExpect(status().isOk());		
	}
	
	@Test
	void characterNotFound() throws Exception {		
		ResultActions result =  mock.perform(get("/characters/999"));		
		result.andExpect(status().isNotFound());		
	}
	
	@Test
	void characterWithNoComics() throws Exception {
		
		List<Character> characters = characterRepository.findAll();
		
		Character randomCharacter = choiceRandomCharacter(characters);
		
		ResultActions result =  mock.perform(get("/characters/" + randomCharacter.getId() + "/comics"));		
		result.andExpect(status().isNotFound());		
	}
	
	Character choiceRandomCharacter(List<Character> characters) {		
		Random rand = new Random();		
		return characters.get(rand.nextInt(characters.size() - 1));
	}

}
