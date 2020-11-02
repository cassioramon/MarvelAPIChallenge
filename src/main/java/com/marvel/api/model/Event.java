package com.marvel.api.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Event implements Serializable {

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

	@ManyToMany(mappedBy = "events")
	@JsonIgnoreProperties("events")
	private Set<Character> characters;

	@ManyToMany(mappedBy = "events")
	@JsonIgnoreProperties("events")
	private Set<Character> comics;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "Event_Serie", 
			joinColumns = @JoinColumn(name = "event_id", referencedColumnName = "id"), 
			inverseJoinColumns = @JoinColumn(name = "serie_id", referencedColumnName = "id"))
	@JsonIgnoreProperties("events")
	private Set<Serie> series;

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

	public Set<Serie> getSeries() {
		return series;
	}

	public void setSeries(Set<Serie> series) {
		this.series = series;
	}

}
