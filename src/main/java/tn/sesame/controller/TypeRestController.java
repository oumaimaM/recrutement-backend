package tn.sesame.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import tn.sesame.service.ITypeservice;
import tn.sesame.domain.TypeContrat;


@CrossOrigin(origins = "*" )
@RestController
@RequestMapping(path="/typecontrat")
public class TypeRestController {

	
	private ITypeservice servicetype;
	
	
	public TypeRestController(ITypeservice servicetype) {
		this.servicetype=servicetype;
	}
	
	
	@GetMapping(path="/affiche")
	 public List<TypeContrat> touslestypes() 
	{
		return  servicetype.findAll();
				}
	
	


}

