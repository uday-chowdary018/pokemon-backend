package com.uday.kiran.pokemon_backend.Repo;






import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.uday.kiran.pokemon_backend.Entities.PokemonOwner;
import com.uday.kiran.pokemon_backend.Entities.PokemonUser;


@EnableJpaRepositories
public interface PokemonUserRepo extends JpaRepository<PokemonUser, Long> {

	//PokemonUser findByName(String pokemonName);
	   PokemonUser findByPokemonName(String pokemonName);
	 //  List<PokemonUser> findByPokemonOwnerName(String pokemonOwnerName);
       List<PokemonUser> findByOwnerId(Long id);
	  //  List<PokemonUser> findByPokemonOwner(PokemonOwner name);
     //  List<PokemonUser> getPokemonsByOwnerName(String pokemonOwnerName);
}
