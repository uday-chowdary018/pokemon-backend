package com.uday.kiran.pokemon_backend.Entities;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="pokemons")
public class PokemonUser {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 @ManyToOne
	 @JoinColumn(name="owner_id")
	 @JsonBackReference
	 private PokemonOwner owner;
	 
	 @Column(name="pokemon_name")
	 private String pokemonName;
	 
	 @Column(name="pokemon_ability")
	 private String pokemonAbility;
	 
	 @Column(name="initial_position_x")
	 private int initialPositionX;
	 
	 @Column(name="initial_position_y")
	 private int initialPositionY;
	 
	 private int speed;
	 @Column(nullable = true)
	 private String direction;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
    public String getPokemonName() {
		return pokemonName;
	}
	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
	public String getPokemonAbility() {
		return pokemonAbility;
	}
	public void setPokemonAbility(String pokemonAbility) {
		this.pokemonAbility = pokemonAbility;
	}
	public int getInitialPositionX() {
		return initialPositionX;
	}
	public void setInitialPositionX(int initialPositionX) {
		this.initialPositionX = initialPositionX;
	}
	public int getInitialPositionY() {
		return initialPositionY;
	}
	public void setInitialPositionY(int initialPositionY) {
		this.initialPositionY = initialPositionY;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public PokemonOwner getOwner() {
		return owner;
	}
	public void setOwner(PokemonOwner owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "PokemonUser [id=" + id + ", owner=" + owner + ", pokemonName=" + pokemonName + ", pokemonAbility="
				+ pokemonAbility + ", initialPositionX=" + initialPositionX + ", initialPositionY=" + initialPositionY
				+ ", speed=" + speed + ", direction=" + direction + "]";
	}
	




}
