package com.uday.kiran.pokemon_backend.dto;

public class PokemonDTO {
	
	private String pokemonName;
	private String pokemonAbility;
	private int pokemonCount;
	private int speed;
	private String direction;
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
	private int initialPositionX;
	 private int initialPositionY;
	
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
	
	
	public PokemonDTO(String pokemonName, String pokemonAbility, int pokemonCount, int speed, String direction,
			int initialPositionX, int initialPositionY) {
		super();
		this.pokemonName = pokemonName;
		this.pokemonAbility = pokemonAbility;
		this.pokemonCount = pokemonCount;
		this.speed = speed;
		this.direction = direction;
		this.initialPositionX = initialPositionX;
		this.initialPositionY = initialPositionY;
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
	public int getPokemonCount() {
		return pokemonCount;
	}
	public void setPokemonCount(int pokemonCount) {
		this.pokemonCount = pokemonCount;
	}
	
	
}
