package tn.sesame.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.sesame.domain.Administrateur;

import tn.sesame.service.IAdminservice;

@CrossOrigin(origins = "*" )
@RestController
@RequestMapping(path="/admine")
public class AdminRestController {
	
	private IAdminservice  adminsociete;
	
	public AdminRestController(IAdminservice  adminsociete) {
		this.adminsociete= adminsociete;
	}
	
	//affiche la liste admins
	
		@GetMapping
		 public List<Administrateur> touslesadmin()  {
			return  adminsociete.findAll();
			}
		

	}
	
	


