package tn.sesame.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.sesame.domain.Societe;
import tn.sesame.repository.ISociete;



@Service
public class ISocieteserviceimpl implements ISocieteservice {

	
	@Autowired
	private ISociete reposociete;
	
	
	
	
	@Override
	public List<Societe> findAll() {
		
		return reposociete.findAll();
	}

	@Override
	public Optional<Societe> findById(int id) {
		
		return reposociete.findById(id);
	}

	@Override
	public void save(Societe o) {
		reposociete.save(o);
		
	}

	@Override
	public void delete(Societe o) {
		reposociete.delete(o);
		
	}
	
	
	
	
	
	
	

}
