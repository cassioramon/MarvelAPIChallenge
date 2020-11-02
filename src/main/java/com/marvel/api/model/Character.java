package com.marvel.api.model;

import java.io.Serializable;
import java.util.Date;
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
public class Character implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue
	@Id
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "modified")
	private Date modified;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Character_Comic", joinColumns = @JoinColumn(name = "character_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "comic_id", referencedColumnName = "id"))
	@JsonIgnoreProperties("characters")
	private Set<Comic> comics;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Character_Event", joinColumns = @JoinColumn(name = "character_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "event_id", referencedColumnName = "id"))
	@JsonIgnoreProperties("characters")
	private Set<Event> events;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Character_Serie", joinColumns = @JoinColumn(name = "character_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "serie_id", referencedColumnName = "id"))
	@JsonIgnoreProperties("characters")
	private Set<Serie> series;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Set<Comic> getComics() {
		return comics;
	}

	public void setComics(Set<Comic> comics) {
		this.comics = comics;
	}

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

	public Set<Serie> getSeries() {
		return series;
	}

	public void setSeries(Set<Serie> series) {
		this.series = series;
	}

}
