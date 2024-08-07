package com.uday.kiran.pokemon_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uday.kiran.pokemon_backend.Entities.PokemonOwner;
import com.uday.kiran.pokemon_backend.Entities.PokemonUser;
import com.uday.kiran.pokemon_backend.service.impl.PockemonOwnerserviceimpl;

@RestController
@RequestMapping("/api/pokemon-owners")
@CrossOrigin(origins = "https://pokemons-orcin-phi.vercel.app")
public class PokemonOwnerController {
	@Autowired
	private PockemonOwnerserviceimpl ownerService;
	
	@PostMapping
	public PokemonOwner createOwner( @RequestBody PokemonOwner owner) {
		
		return ownerService.createOwner(owner) ;
		
	}
	@GetMapping
	public List<PokemonOwner> getAllOwners(){
		return ownerService.getAllOwners();
		
	}
	
	@PostMapping("/{id}/pokemons")
	public PokemonOwner addPokemonToOwner(@PathVariable Long id, @RequestBody PokemonUser pokemonuser) {
		return ownerService.addPokemonToOwner(id, pokemonuser);
		
	}


}
