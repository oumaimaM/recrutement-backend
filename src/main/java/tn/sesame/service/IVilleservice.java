package tn.sesame.service;

import java.util.List;
import java.util.Optional;

import tn.sesame.domain.Ville;




public interface IVilleservice {
	
	
	public List <Ville> findAll();
	public  Optional<Ville> findById(int id);
	public void save(Ville o);
	public void delete(Ville o);
	
	
	
	
	
	
	

}
