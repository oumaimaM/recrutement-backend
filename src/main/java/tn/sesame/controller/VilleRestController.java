package tn.sesame.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.sesame.domain.Ville;
import tn.sesame.service.IVilleservice;





@CrossOrigin(origins = "*" )
@RestController
@RequestMapping(path="/ville")
public class VilleRestController {
	
	@Autowired
	private IVilleservice servicevillee;
	
	public VilleRestController(IVilleservice servicevillee) {
		this.servicevillee=servicevillee;
	}
	
	//affiche la liste villes
	
	@GetMapping
	 public List<Ville> touslesvilles()  {
		return  servicevillee.findAll();
	 }
	
	 
	 

	


		

	
	
	
	

}
