package tn.sesame.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.sesame.domain.Administrateur;
import tn.sesame.domain.Postuler;
import tn.sesame.service.IPostulerservice;

@CrossOrigin(origins = "*" )
@RestController
@RequestMapping(path="/postulee")
public  class PostulerRestController {

	private IPostulerservice service1;
	
	
	public PostulerRestController(IPostulerservice service1) {
		this.service1= service1;
	}
	
	@GetMapping
	 public List<Postuler> touslesadmin()  {
		return  service1.findAll();
		}
	
	
	
	
	
	
}
