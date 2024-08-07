package com.uday.kiran.pokemon_backend.Entities;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="pokemon_owners")
public class PokemonOwner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name", nullable=false)
	//@NotNull(message = "Name cannot be null")
	private String name;
	@OneToMany(mappedBy = "owner", cascade=CascadeType.ALL, orphanRemoval=true)
	@JsonManagedReference
	private List<PokemonUser> pokemons = new ArrayList<>();
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
	public List<PokemonUser> getPokemons() {
		return pokemons;
	}
	public void setPokemons(List<PokemonUser> pokemons) {
		this.pokemons = pokemons;
	}
	@Override
	public String toString() {
		return "PokemonOwner [id=" + id + ", name=" + name + ", pokemons=" + pokemons + "]";
	}
	

}
