package tn.sesame.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.primefaces.event.FileUploadEvent;


import tn.sesame.domain.OffreCondidat;
import tn.sesame.service.IOffreCondidatservice;
import java.nio.file.Files;

@CrossOrigin(origins = "*" )
@RestController
@RequestMapping(path="/postuler")
public class OffreCandidatRestController {


	private IOffreCondidatservice servicepostule;
	
	public OffreCandidatRestController (IOffreCondidatservice servicepostule) {
		this.servicepostule = servicepostule;
	}
	

	
	@GetMapping(path="/affiche")
	 public List<OffreCondidat> touslespostules()  {
		return  servicepostule.findAll();
		}
	
	
	@PostMapping(path="/add")
	public ResponseEntity<Boolean> addChallengeToUse (@RequestBody ObjectNode json)
	{

	int idoffre;
	int idcondidat;
	String etat;
String cv;
	
	try {
		
		idcondidat = new ObjectMapper().treeToValue(json.get("idcondidat"), Integer.class);
		System.out.println(idcondidat);
		idoffre = new ObjectMapper().treeToValue(json.get("idoffre"), Integer.class);
		System.out.println(idoffre);
		etat = new ObjectMapper().treeToValue(json.get("etat"), String.class);
		
		System.out.println(etat);
		
		boolean res= servicepostule.addChallengeToUser(idcondidat, idoffre, etat);
		return new ResponseEntity<Boolean>(res,HttpStatus.OK);
	} catch (JsonProcessingException e) {
		System.out.println("Parsing Exception!!");
		e.printStackTrace();
		return new ResponseEntity<Boolean>(HttpStatus.NOT_ACCEPTABLE);

	}

		

	
	
	}
}
