package tn.sesame.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.sesame.domain.TypeContrat;

@Entity
@Table(name="offre")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offre {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idoffre;
	private String titre;
	private String description;
	
	
	@ManyToOne

	private TypeContrat type;
	
@ManyToOne

private Categories categorie;

@ManyToOne

private Ville ville;

@ManyToOne

private Societe societe;

@JsonIgnore
@OneToMany(
        mappedBy = "offre",
        cascade = CascadeType.ALL

    )
    private List<OffreCondidat> offres = new ArrayList<>();
	
}
