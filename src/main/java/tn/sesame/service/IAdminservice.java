package tn.sesame.service;

import java.util.List;
import java.util.Optional;

import tn.sesame.domain.Administrateur;

public interface IAdminservice {
	

	public List <Administrateur> findAll();
	public  Optional<Administrateur> findById(int id);
	public void save(Administrateur a);
	public void delete(Administrateur a);

}
