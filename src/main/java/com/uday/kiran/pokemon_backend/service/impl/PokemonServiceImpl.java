package com.uday.kiran.pokemon_backend.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uday.kiran.pokemon_backend.Entities.PokemonOwner;
import com.uday.kiran.pokemon_backend.Entities.PokemonUser;
import com.uday.kiran.pokemon_backend.Repo.PokemonOwnerRepo;
import com.uday.kiran.pokemon_backend.Repo.PokemonUserRepo;
import com.uday.kiran.pokemon_backend.service.PokemonService;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class PokemonServiceImpl implements PokemonService{
	 
     
	@Autowired
	private PokemonUserRepo pokemonrepo;
	@Autowired
	private PokemonOwnerRepo ownerrepo;
	
	@Override
	public List<PokemonUser> getAllPokemons() {
		return pokemonrepo.findAll();
	}

	@Override
	public PokemonUser getPokemonById(Long id) {
		return pokemonrepo.findById(id).orElse(null);
		//  return pokemonRepository.findById(id).orElse(null);
	}



	@Override
	public void deletePokemon(Long id) {
		 pokemonrepo.deleteById(id);
		
	}


	


	@Override
	public PokemonUser findByName(String pokemonName) {
		return pokemonrepo.findByPokemonName(pokemonName);
	}
    @Override
    public List<PokemonUser> getAllPokemonOwnerNames() {
        List<PokemonOwner> owners = ownerrepo.findAll();
        return owners.stream()
                     .map(PokemonOwner::getName())
                     .collect(Collectors.toList());
    }
    public List<PokemonUser> findByOwnerId(Long id) {
        return pokemonrepo.findByOwnerId(id);
    }
	


//	@Override
//	public PokemonUser addPokemon(Long id,PokemonUser pokemonuser) {
//		 try {
//		       
//		        PokemonOwner owner = ownerrepo.findById(id).orElse(null);
//		       if(owner==null) {
//		    	   throw new RuntimeException("owner not found");
//		       }
//		        pokemonuser.setOwner(owner);
//		        return pokemonrepo.save(pokemonuser);
//		    } catch (Exception e) {
//		        // Handle exceptions and log details
//		        e.printStackTrace();
//		        throw new RuntimeException("Error adding Pokémon", e);
//		    }
//	}

	



	

	

	
}
