package tn.sesame.service;

import java.util.List;
import java.util.Optional;

import tn.sesame.domain.Postuler;

public interface IPostulerservice {
	
	

	public List <Postuler> findAll();
	public  Optional<Postuler> findById(int id);
	public void save(Postuler a);
	public void delete(Postuler a);

}
