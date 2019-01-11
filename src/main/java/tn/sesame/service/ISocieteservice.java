package tn.sesame.service;

import java.util.List;
import java.util.Optional;

import tn.sesame.domain.Societe;



public interface ISocieteservice {
	
	public List <Societe> findAll();
	public  Optional<Societe> findById(int id);
	public void save(Societe o);
	public void delete(Societe o);

}
