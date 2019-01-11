package tn.sesame.domain;

import javax.persistence.EmbeddedId;

import org.springframework.web.multipart.MultipartFile;

import java.sql.Blob;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity

@Table(name="offre_condidat")
public class OffreCondidat {
	@EmbeddedId
	private OffreCondidatID candidatID;
	@ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idoffre")
	private Offre offre;
	@ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idcondidat")
	private CompteCondidat compteCondidat;
	private String etat;
	
	

	 
	public OffreCondidat() {
		
	}
	
	public OffreCondidat(Offre offre, CompteCondidat compteCondidat, String etat) {
		super();
		this.offre = offre;
		this.compteCondidat = compteCondidat;
		this.etat = etat;
		
		
	
	}
	
	

}
