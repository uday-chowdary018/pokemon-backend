package com.uday.kiran.pokemon_backend.dto;

public class PokemonUserDTO {

	private Long id;
	private String pokemonName;
	private String pokemonAbility;
    private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int pokemonCount;

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

	public int getPokemonCount() {
		return pokemonCount;
	}

	public void setPokemonCount(int pokemonCount) {
		this.pokemonCount = pokemonCount;
	}

	public PokemonUserDTO(Long id, String pokemonName, String pokemonAbility, String name, int pokemonCount) {
		super();
		this.id = id;
		this.pokemonName = pokemonName;
		this.pokemonAbility = pokemonAbility;
		this.name = name;
		this.pokemonCount = pokemonCount;
	}

	


	
	
}
