package tn.sesame.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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


import tn.sesame.domain.CompteCondidat;
import tn.sesame.domain.Offre;

import tn.sesame.service.IComptecondidatservice;

@CrossOrigin(origins = "*" )
@RestController
@RequestMapping(path="/compte-condidat")

public class ComptecondidatRestController {
	
	
	 private IComptecondidatservice servicecondidat;
	 
	 
	 
	 public ComptecondidatRestController(IComptecondidatservice servicecondidat) {
		 this.servicecondidat=servicecondidat;
	 }
	 
	//affiche liste des comptes condidats

		@GetMapping(path="/affichecompte")

		 public List<CompteCondidat> touslescomptes()  {
			return  servicecondidat.findAll();
		 }
		
		//affiche un compte selon id
		 
		@GetMapping(path="/{idcondidat}")
		
		public  ResponseEntity<CompteCondidat> findById(@PathVariable("idcondidat") Integer id) {
			Optional<CompteCondidat> resultat =  servicecondidat.findById(id);
			if (resultat.isPresent())
				return new ResponseEntity<>(resultat.get(), HttpStatus.OK);
			else
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
     //ajout compte
		
		@PostMapping(path="/ajoutcondidat")
		
	
		public  ResponseEntity<CompteCondidat> create( @RequestBody CompteCondidat c){
			
		
			servicecondidat.save(c);
				return new ResponseEntity<CompteCondidat>(c, HttpStatus.CREATED);
		
			
		
		}
		//delete condidat
		
		@DeleteMapping(path= "/{id}" )
	
		public  ResponseEntity<CompteCondidat> deleteById(@PathVariable("id") Integer id) {
			Optional<CompteCondidat> resultat =  servicecondidat.findById(id);
			if (resultat.isPresent()) {
				servicecondidat.delete(resultat.get());
				 return new ResponseEntity<>(HttpStatus.ACCEPTED);
			}
				
			else
				return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
		//update condidat
		
		@PutMapping
		public  ResponseEntity<CompteCondidat> update(@RequestBody CompteCondidat c){
			 
			 try {
				 servicecondidat.save(c);
					return new ResponseEntity<CompteCondidat>(c, HttpStatus.ACCEPTED);
				} catch (Exception e) {
					return new ResponseEntity<CompteCondidat>(HttpStatus.NOT_ACCEPTABLE);
				}
			
		}
		
}
