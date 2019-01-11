package tn.sesame.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable

public class OffreCondidatID implements Serializable{
	
	private Integer idcondidat;
	private Integer idoffre;
	public Integer getIdcondidat() {
		return idcondidat;
	}
	public void setIdcondidat(Integer idcondidat) {
		this.idcondidat = idcondidat;
	}
	public Integer getIdoffre() {
		return idoffre;
	}
	public void setIdoffre(Integer idoffre) {
		this.idoffre = idoffre;
	}
	

	
	
	
	

}
