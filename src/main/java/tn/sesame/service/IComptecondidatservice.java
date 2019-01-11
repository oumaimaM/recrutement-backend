package tn.sesame.service;

import java.util.List;
import java.util.Optional;

import tn.sesame.domain.CompteCondidat;

public interface IComptecondidatservice {
	
	public List <CompteCondidat> findAll();
	public  Optional<CompteCondidat> findById(int idcondidat);
	public void save(CompteCondidat o);
	public void delete(CompteCondidat o);
	

}
