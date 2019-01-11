package tn.sesame.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.sesame.domain.Categories;
import tn.sesame.domain.Societe;
import tn.sesame.service.ICategoriservice;
import tn.sesame.service.ISocieteservice;




@CrossOrigin(origins = "*" )
@RestController
@RequestMapping(path="/categori")
public class CategoriRestController {
	
	
private ICategoriservice catsociete;
	
	public CategoriRestController(ICategoriservice catsociete) {
		this.catsociete=catsociete;
		
	}
	
//affiche la liste societes
	
	@GetMapping
	 public List<Categories> touslescategories()  {
		return  catsociete.findAll();}
	

}
