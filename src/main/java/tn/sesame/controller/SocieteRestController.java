package tn.sesame.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.sesame.domain.CompteCondidat;
import tn.sesame.domain.Societe;
import tn.sesame.domain.Ville;
import tn.sesame.service.ISocieteservice;



@CrossOrigin(origins = "*" )
@RestController
@RequestMapping(path="/societe")

public class SocieteRestController {
	
	
	
	private ISocieteservice servicesociete;
	
	public SocieteRestController(ISocieteservice servicesociete) {
		this.servicesociete=servicesociete;
		
	}
	
//affiche la liste societes
	
	@GetMapping
	 public List<Societe> touslessocietes()  {
		return  servicesociete.findAll();
	 }
	
	  //ajout societe
	
			@PostMapping(path="/ajoutsoc")
			
			
			public  ResponseEntity<Societe> create( @RequestBody Societe c){
				
			
				servicesociete.save(c);
					return new ResponseEntity<Societe>(c, HttpStatus.CREATED);
			
				
			
			}
	
	
	
	

}
