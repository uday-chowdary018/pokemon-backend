package com.uday.kiran.pokemon_backend.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uday.kiran.pokemon_backend.Entities.PokemonOwner;
import com.uday.kiran.pokemon_backend.Entities.PokemonUser;


public interface PokemonOwnerRepo extends JpaRepository<PokemonOwner, Long> {
    
	
	Optional<PokemonOwner> findByName(String name);
	//Optional<PokemonOwner> findById(Long id);
	//Optional<PokemonOwner> findByOwnerName(String name);
     Optional<PokemonOwner> findById(Long id);
}
