package tn.sesame.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.sesame.domain.Administrateur;
import tn.sesame.repository.IAdministrateur;


@Service
public class IAdminserviceimpl implements IAdminservice {

	
	@Autowired
	private IAdministrateur repoadmin;
	
	
	@Override
	public List<Administrateur> findAll() {
	
		return repoadmin.findAll();
	}

	@Override
	public Optional<Administrateur> findById(int id) {
	
		return repoadmin.findById(id);
	}

	@Override
	public void save(Administrateur a) {
repoadmin.save(a);
		
	}

	@Override
	public void delete(Administrateur a) {
		repoadmin.delete(a);
		
	}

}
