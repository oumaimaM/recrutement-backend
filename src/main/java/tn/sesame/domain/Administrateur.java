package tn.sesame.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="administrateur")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Administrateur{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idadmin;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private String mdp;


}
