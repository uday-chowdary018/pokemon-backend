package com.uday.kiran.pokemon_backend.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.uday.kiran.pokemon_backend.Entities.PokemonUser;
import com.uday.kiran.pokemon_backend.Repo.PokemonOwnerRepo;
import com.uday.kiran.pokemon_backend.Repo.PokemonUserRepo;
import com.uday.kiran.pokemon_backend.dto.PokemonDTO;
import com.uday.kiran.pokemon_backend.dto.PokemonUserDTO;
import com.uday.kiran.pokemon_backend.dto.PokemonUserRequestDTO;
import com.uday.kiran.pokemon_backend.service.PokemonService;
import com.uday.kiran.pokemon_backend.Entities.PokemonOwner;

@RestController
@RequestMapping("/api/pokemons")
@CrossOrigin(origins = "https://pokemons-orcin-phi.vercel.app")
public class PokemonUserController {
	@Autowired
	private PokemonService pokemonservice;
	@Autowired
	private PokemonUserRepo repo;
	@Autowired
	private PokemonOwnerRepo ownerrepo;


	  @GetMapping
	    public List<PokemonUserDTO> getAllPokemonUsers() {
	        List<PokemonUser> pokemonUsers = repo.findAll();
	        return pokemonUsers.stream()
	            .map(pokemonUser -> {
	                int pokemonCount = pokemonUser.getOwner() != null ? pokemonUser.getOwner().getPokemons().size() : 0;
	                return new PokemonUserDTO(
	                    pokemonUser.getId(),
	                    pokemonUser.getPokemonName(),
	                    pokemonUser.getPokemonAbility(),
	                    pokemonUser.getOwner() != null ? pokemonUser.getOwner().getName() : null,
	                    pokemonCount
	                );
	            })
	            .collect(Collectors.toList());
	    }
	/*  @GetMapping("/owner/{id}")
	    public List<PokemonDTO> getPokemonsByOwner(@PathVariable Long id) {
	      
		  return pokemonservice.findByOwnerId(id).stream()
	            
	        		.map(pokemon1 -> new PokemonDTO(
	            		
	                pokemon1.getPokemonName(),
	                pokemon1.getPokemonAbility(),
	                pokemon1.getDirection(),
	                pokemon1.getSpeed()
	                pokemon1.getOwner() != null ? pokemon1.getOwner().getPokemons().size() : 0
	            ))
	            .collect(Collectors.toList());
	    }
*/
	  @GetMapping("/owner/{id}")
	  public List<PokemonDTO> getPokemonsByOwner(@PathVariable Long id) {
	      return pokemonservice.findByOwnerId(id).stream()
	          .map(pokemon1 -> new PokemonDTO(
	              pokemon1.getPokemonName(),
	              pokemon1.getPokemonAbility(),
	              pokemon1.getInitialPositionX(),
	              pokemon1.getInitialPositionY(),
	               pokemon1.getDirection(),
	              pokemon1.getSpeed(),
	              pokemon1.getOwner() != null ? pokemon1.getOwner().getPokemons().size() : 0
	          ))
	          .collect(Collectors.toList());
	  }
	  @PostMapping
	  public PokemonUser addPokemon(@RequestBody PokemonUserRequestDTO request) {
		
		  PokemonOwner owner = ownerrepo.findByName(request.getPokemonOwnerName())
				  .orElseGet(()->{
					  PokemonOwner newowner = new PokemonOwner();
					  newowner.setName(request.getPokemonOwnerName());
					  return ownerrepo.save(newowner);
				  });
		  PokemonUser pokemonuser = new PokemonUser();
		  pokemonuser.setPokemonName(request.getPokemonName());
		  pokemonuser.setPokemonAbility(request.getPokemonAbility());
		  pokemonuser.setInitialPositionX(request.getInitialPositionX());
		  pokemonuser.setInitialPositionY(request.getInitialPositionY());
		  pokemonuser.setSpeed(request.getSpeed());
		  pokemonuser.setDirection(request.getDirection());
		  pokemonuser.setOwner(owner);
		  
		  return repo.save(pokemonuser);
		  
	  }

	 @GetMapping("/name/{pokemonName}")
	    public PokemonUser findByName(@PathVariable String pokemonName) {
	       return pokemonservice.findByName(pokemonName);
		
	      
	 }
	

		@GetMapping("/pokemon-owner-names")
	    public List<PokemonUser> getPokemonOwnerNames() {
	        return pokemonservice.getAllPokemonOwnerNames();
	    }
	
	@DeleteMapping("/{id}")
	public void deletePokemon(@PathVariable Long id) {
		
		 pokemonservice.deletePokemon(id);
	}
	

	
	
	

}
