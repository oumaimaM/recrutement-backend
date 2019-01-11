package tn.sesame.service;

import java.util.List;
import java.util.Optional;


import tn.sesame.domain.TypeContrat;

public interface ITypeservice {
	
	public List <TypeContrat> findAll();
	public  Optional<TypeContrat> findById(int id);
	public void save(TypeContrat o);
	public void delete(TypeContrat o);

}
