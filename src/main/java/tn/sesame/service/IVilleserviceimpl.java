package tn.sesame.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.sesame.domain.Ville;
import tn.sesame.repository.IOffre;
import tn.sesame.repository.IVille;



@Service
public class IVilleserviceimpl implements IVilleservice {
	
	
	@Autowired
	private IVille villerepo;
	
	

	@Override
	public List<Ville> findAll() {
	
		return villerepo.findAll();
	}

	@Override
	public Optional<Ville> findById(int id) {
		
		return villerepo.findById(id);
	}

	@Override
	public void save(Ville o) {
		villerepo.save(o);

		
	}

	@Override
	public void delete(Ville o) {
		villerepo.delete(o);
		
	}
	

}
