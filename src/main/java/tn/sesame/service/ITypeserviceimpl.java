package tn.sesame.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.sesame.domain.TypeContrat;
import tn.sesame.repository.*;

@Service
public class ITypeserviceimpl implements ITypeservice {
	
	@Autowired
	private ITypecontrat repotype;
	

	@Override
	public List<TypeContrat> findAll() {
		// TODO Auto-generated method stub
		return repotype.findAll();
	}


	@Override
	public Optional<TypeContrat> findById(int id) {
		// TODO Auto-generated method stub
		return repotype.findById(id);
	}


	@Override
	public void save(TypeContrat o) {
		repotype.save(o);
		
	}


	@Override
	public void delete(TypeContrat o) {
		repotype.delete(o);
		
	}
	

}
