package tn.sesame.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.sesame.domain.Postuler;
import tn.sesame.repository.IPostuler;

@Service
public class IPostulerImpl implements IPostulerservice {
	
	
	@Autowired
	private IPostuler repopostule;
	

	@Override
	public List<Postuler> findAll() {
		// TODO Auto-generated method stub
		return repopostule.findAll();
	}

	@Override
	public Optional<Postuler> findById(int id) {
		// TODO Auto-generated method stub
		return repopostule.findById(id);
	}

	@Override
	public void save(Postuler a) {
		repopostule.save(a);
		
	}

	@Override
	public void delete(Postuler a) {
		repopostule.delete(a);
		
	}
	
	
	
	

}
