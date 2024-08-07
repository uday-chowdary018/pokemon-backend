package com.uday.kiran.pokemon_backend.dto;

public class PokemonUserRequestDTO {
	
	
	private String pokemonOwnerName;
	private String pokemonName;
	private String pokemonAbility;
	private int initialPositionX;
	private int initialPositionY;
	private int speed;
	private String direction;
	public String getPokemonOwnerName() {
		return pokemonOwnerName;
	}
	public void setPokemonOwnerName(String pokemonOwnerName) {
		this.pokemonOwnerName = pokemonOwnerName;
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
	
	
	

}
