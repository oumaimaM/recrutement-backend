package tn.sesame.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="comptecondidat")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompteCondidat {
	
	 @Id
	   
	    @GeneratedValue(strategy = GenerationType.AUTO, generator = "user_seq")
	    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
	private Integer idcondidat;
	private String nom;
	private String prenom;
	private String email;
	private String mdp;
	
	
	
	
	@OneToMany(
	        mappedBy = "compteCondidat",
	        cascade = CascadeType.ALL
	     
	    )
	    private List<OffreCondidat> comptes = new ArrayList<>();


	
	
	

}
