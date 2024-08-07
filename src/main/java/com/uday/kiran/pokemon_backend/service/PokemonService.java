package com.uday.kiran.pokemon_backend.service;

import java.util.List;

import com.uday.kiran.pokemon_backend.Entities.PokemonUser;


public interface PokemonService {
	
	 List<PokemonUser> getAllPokemons();
	 PokemonUser getPokemonById(Long id);
	 
	// PokemonUser savePokemon(PokemonUser pokemonuser);
	 void deletePokemon(Long id);
	 //PokemonUser addPokemon(Long ownerId, PokemonUser pokemonuser);
		   
	 //List<PokemonUser> getPokemonsByOwnerId(Long ownerId) ;
	PokemonUser findByName(String pokemonName);

	//PokemonUser addPokemon(String pokemonOwnerName, PokemonUser pokemonuser);
	// PokemonUser addPokemon( Long id,PokemonUser pokemonuser);
	 List<PokemonUser> getAllPokemonOwnerNames() ;
	 List<PokemonUser> findByOwnerId(Long id);
}
