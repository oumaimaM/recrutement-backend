package tn.sesame.service;

import java.util.List;
import java.util.Optional;

import tn.sesame.domain.Categories;



public interface ICategoriservice {
	
	
	public List <Categories> findAll();
	public  Optional<Categories> findById(int id);
	public void save(Categories o);
	public void delete(Categories o);

}
