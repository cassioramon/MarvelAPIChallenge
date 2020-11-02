package com.marvel.api.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Serie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;

	@Column
	private String title;

	@Column
	private String description;

	@Column(name="start_year")
	private Integer startYear;

	@Column(name="end_year")
	private Integer endYear;

	@Column
	private String rating;

	@ManyToMany(mappedBy = "series")
	@JsonIgnoreProperties("series")
	private Set<Character> characters;

	@ManyToMany(mappedBy = "series")
	@JsonIgnoreProperties("series")
	private Set<Character> comics;

	@ManyToMany(mappedBy = "series")
	@JsonIgnoreProperties("series")
	private Set<Event> events;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStartYear() {
		return startYear;
	}

	public void setStartYear(Integer startYear) {
		this.startYear = startYear;
	}

	public Integer getEndYear() {
		return endYear;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Set<Character> getCharacters() {
		return characters;
	}

	public void setCharacters(Set<Character> characters) {
		this.characters = characters;
	}

	public Set<Character> getComics() {
		return comics;
	}

	public void setComics(Set<Character> comics) {
		this.comics = comics;
	}

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

}
