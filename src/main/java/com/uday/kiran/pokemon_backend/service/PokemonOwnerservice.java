package com.uday.kiran.pokemon_backend.service;

import java.util.List;

import com.uday.kiran.pokemon_backend.Entities.PokemonOwner;

public interface PokemonOwnerservice {
	
	
	PokemonOwner createOwner(PokemonOwner owner);
	
	List<PokemonOwner> getAllOwners();
	
	List<PokemonOwner> getOwnerByName(String name) ;
	//PokemonOwner findByName(String name);

}
