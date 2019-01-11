package tn.sesame.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.sesame.domain.Categories;
import tn.sesame.repository.ICategories;

@Service
public class ICategoriserviceimpl implements ICategoriservice 
{
	
	
	@Autowired
	private ICategories catrepo;

	
	@Override
	public List<Categories> findAll() {
	
		
		return catrepo.findAll();
	}

	@Override
	public Optional<Categories> findById(int id) {
		// TODO Auto-generated method stub
		return catrepo.findById(id);
	}

	@Override
	public void save(Categories o) {
		catrepo.save(o);
		
	}

	@Override
	public void delete(Categories o) {
		catrepo.delete(o);
		
	}

}
