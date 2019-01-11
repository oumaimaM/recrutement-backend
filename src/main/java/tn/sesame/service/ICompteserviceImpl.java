package tn.sesame.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.sesame.domain.CompteCondidat;
import tn.sesame.repository.IComptecondidat;



@Service
public class ICompteserviceImpl  implements IComptecondidatservice{
	
	@Autowired
	private IComptecondidat repocondidat;

	@Override
	public List<CompteCondidat> findAll() {
	return repocondidat.findAll();
	}

	@Override
	public Optional<CompteCondidat> findById(int idcondidat) {
	return repocondidat.findById(idcondidat);
	}

	@Override
	public void save(CompteCondidat o) {
		repocondidat.save(o);
		
	}

	@Override
	public void delete(CompteCondidat o) {
repocondidat.delete(o);
		
	}


	

}
