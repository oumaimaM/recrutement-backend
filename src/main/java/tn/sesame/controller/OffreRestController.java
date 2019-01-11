package tn.sesame.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import tn.sesame.domain.Offre;
import tn.sesame.repository.IOffre;
import tn.sesame.service.IOffreservice;

@CrossOrigin(origins = "*" )
@RestController
@RequestMapping(path="/offre")
public class OffreRestController {
	
	private IOffreservice serviceoffre;
	private IOffre repooffre;
	
	public OffreRestController(IOffreservice serviceoffre, IOffre repooffre) {
		this.serviceoffre = serviceoffre;
		this.repooffre=repooffre;
	}
	
	//affiche la liste offres
	
		@GetMapping(path="/afficheoffre")
		 public List<Offre> touslesoffres()  {
			return  serviceoffre.findAll();
		 }
		
		 
		 
		 //affiche par id
		
		@RequestMapping(value = "/{idoffre}", method = RequestMethod.GET)
			public  ResponseEntity<Offre> findById(@PathVariable("idoffre") Integer id) {
				Optional<Offre> resultat =  serviceoffre.findById(id);
				if (resultat.isPresent())
					return new ResponseEntity<>(resultat.get(), HttpStatus.OK);
				else
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		
	
		
		//ajoutoffre
		
			
			@PostMapping(path="/ajoutoffre")
			
		
			public  ResponseEntity<Offre> create( @RequestBody Offre c){
				
			
				serviceoffre.save(c);
					return new ResponseEntity<Offre>(c, HttpStatus.CREATED);
			
				
			
			}
			
			@PutMapping
			public  ResponseEntity<Offre> update(@RequestBody Offre c){
				 
				 try {
					 serviceoffre.save(c);
						return new ResponseEntity<Offre>(c, HttpStatus.ACCEPTED);
					} catch (Exception e) {
						return new ResponseEntity<Offre>(HttpStatus.NOT_ACCEPTABLE);
					}
				
			}
			@DeleteMapping(path= "/{id}" )
			public  ResponseEntity<Offre> deleteById(@PathVariable("id") Integer id) {
				Optional<Offre> resultat =  serviceoffre.findById(id);
				if (resultat.isPresent()) {
					serviceoffre.delete(resultat.get());
					 return new ResponseEntity<>(HttpStatus.ACCEPTED);
				}
					
				else
					return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
			}
		
		
		
			@GetMapping(path="/getbyid/{idcat}/{idville}/{idsociete}" )
			public  List<Offre> filtre(@PathVariable("idcat") Integer id1,
					@PathVariable("idville") Integer id2,@PathVariable("idsociete") Integer id3) {
				
				List<Offre> resultat = repooffre.findBySocieteVC(id1, id2, id3); 
				return resultat;
			
				
			}	
		
			@GetMapping(path="getbyville/{idville}" )
			public  List<Offre> filtre(@PathVariable("idville") Integer id3) {
				
				List<Offre> resultat = repooffre.findByVille(id3); 
				return resultat;
			
				
			}	
			@GetMapping(path="getbysociete/{idsociete}" )
			public  List<Offre> filtresociete(@PathVariable("idsociete") Integer id3) {
				
				List<Offre> resultat = repooffre.findBySociete(id3); 
				return resultat;
			
				
			}	
			
			@GetMapping(path="getbycategorie/{idcategorie}" )
			public  List<Offre> filtrecategorie(@PathVariable("idcategorie") Integer id3) {
				
				List<Offre> resultat = repooffre.findByCategorie(id3); 
				return resultat;
			
				
			}	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

