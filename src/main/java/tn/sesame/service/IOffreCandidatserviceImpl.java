package tn.sesame.service;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.sql.Blob;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.primefaces.event.FileUploadEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.sesame.domain.CompteCondidat;
import tn.sesame.domain.Offre;

import tn.sesame.domain.OffreCondidat;
import tn.sesame.domain.OffreCondidatID;
import tn.sesame.repository.IComptecondidat;
import tn.sesame.repository.IOffre;
import tn.sesame.repository.IOffreCondidat;


@Service
@Transactional
public class IOffreCandidatserviceImpl implements IOffreCondidatservice {
	

	
	@Autowired
	private IComptecondidat repocondidat;
	@Autowired
	private IOffre repooffre;
	
	@Autowired
	private IOffreCondidat repo;
	

	@Override
	public List<OffreCondidat> findAll() {
	
		return repo.findAll();
	}

	@Override
	public Optional<OffreCondidat> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(OffreCondidat a) {
		repo.save(a);
		
	}


	@Override
	public void delete(OffreCondidat a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addChallengeToUser(int idcondidat, int idoffre, String etat) {
	
		CompteCondidat condidat;
		Offre offre;
		boolean res = false;
		condidat =  this.repocondidat.findById(idcondidat).get();
		System.out.println(condidat.getNom());
		offre =  this.repooffre.findById(idoffre).get();
		System.out.println(offre.getTitre());
		System.out.println(res);
		OffreCondidatID  candidatID=new OffreCondidatID();
		candidatID.setIdcondidat(idcondidat);
		candidatID.setIdoffre(idoffre);
		OffreCondidat offrecondidat = new OffreCondidat();
		
		offrecondidat.setCandidatID(candidatID);
	offrecondidat.setCompteCondidat(condidat);
		System.out.println(offrecondidat.getCompteCondidat().getEmail());
		System.out.println(offrecondidat.getCandidatID().getIdoffre());
		offrecondidat.setOffre(offre);
		offrecondidat.setEtat(etat);
	
		this.save(offrecondidat);
		
		res=true;
	
		System.out.println(res);
		return res;
	}

}
