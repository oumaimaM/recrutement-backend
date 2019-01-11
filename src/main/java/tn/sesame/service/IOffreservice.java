package tn.sesame.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.sesame.domain.Offre;




public interface IOffreservice {
	
	public List <Offre> findAll();
	public  Optional<Offre> findById(int id);
	public void save(Offre o);
	public void delete(Offre o);
	
	

	                  
	
	
	

}
