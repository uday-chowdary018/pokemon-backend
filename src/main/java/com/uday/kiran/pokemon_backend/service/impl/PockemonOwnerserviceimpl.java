package com.uday.kiran.pokemon_backend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.uday.kiran.pokemon_backend.Entities.PokemonOwner;
import com.uday.kiran.pokemon_backend.Entities.PokemonUser;
import com.uday.kiran.pokemon_backend.Repo.PokemonOwnerRepo;
import com.uday.kiran.pokemon_backend.Repo.PokemonUserRepo;
import com.uday.kiran.pokemon_backend.service.PokemonOwnerservice;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PockemonOwnerserviceimpl implements PokemonOwnerservice{
	@Autowired
	private PokemonOwnerRepo ownerrepo;
	@Autowired
	private PokemonUserRepo userrepo;
    
	@Override
	public PokemonOwner createOwner(PokemonOwner owner) {
		 if (owner.getName() == null || owner.getName().trim().isEmpty()) {
		        throw new IllegalArgumentException("Name cannot be null or empty");
		    }
		return ownerrepo.save(owner);
	}

	@Override
	public List<PokemonOwner> getAllOwners() {
		return ownerrepo.findAll();
	}

	@Override
	public List<PokemonOwner> getOwnerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public PokemonOwner addPokemonToOwner(Long id, PokemonUser pokemonuser) {
		  Optional<PokemonOwner> optionalOwner = ownerrepo.findById(id);
	        if (optionalOwner.isPresent()) {
	            PokemonOwner owner = optionalOwner.get();
	            pokemonuser.setOwner(owner);
	            userrepo.save(pokemonuser);
	            owner.getPokemons().add(pokemonuser);
	            ownerrepo.save(owner);
	            return owner;
	        } else {
	            // Handle the case where the owner is not found
	            throw new RuntimeException("Owner not found with id: " + id);
	        }
	}


//	
//	@Override
//	public List<PokemonOwner> findByName(String name) {
//		return ownerrepo.findByName(name) ;
//	}

//	@Override
//	public List<PokemonOwner> getOwnerByName(String name) {
//		return ownerrepo.findByName(name);
//	}

	
	

}
