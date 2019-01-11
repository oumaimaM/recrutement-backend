package tn.sesame.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.sesame.domain.Offre;
import tn.sesame.repository.IOffre;



@Service
public class IOffreserviceImpl  implements IOffreservice {
	
	
	@Autowired
	private IOffre repooffre;
	
	

	@Override
	public List<Offre> findAll() {
		
		return repooffre.findAll();
	}

	@Override
	public Optional<Offre> findById(int id) {
		
		return repooffre.findById(id);
	}

	@Override
	public void save(Offre o) {
		
		repooffre.save(o);
		
	}

	@Override
	public void delete(Offre o) {
		repooffre.delete(o);
		
	}

	
	
	
	

}
