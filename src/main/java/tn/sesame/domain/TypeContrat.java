package tn.sesame.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Table(name="typecontrat")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TypeContrat {
	
	@Id
	private int idtype;
	private String libelle;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="type")
	
	@JsonIgnore
	private List<Offre> listeoffre;
	
	

}
