package tn.sesame.service;


import java.sql.Blob;
import java.util.List;
import java.util.Optional;

import tn.sesame.domain.OffreCondidat;



public interface IOffreCondidatservice {
	
	
	public List <OffreCondidat> findAll();
	public  Optional<OffreCondidat> findById(int id);
	public void save(OffreCondidat a);
	public void delete(OffreCondidat a);
	public boolean addChallengeToUser(int idcondidat, int idoffre, String etat);

}
