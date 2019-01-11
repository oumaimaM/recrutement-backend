package tn.sesame.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="societe")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Societe {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idsociete;
	
	private String emailsociete;
	private String nomsociete;
	private String tel;
	private String imagesociete;
	private String adresse;
	
	@OneToMany(mappedBy="societe")
	@JsonIgnore
	private List<Offre> lisof2;

}
