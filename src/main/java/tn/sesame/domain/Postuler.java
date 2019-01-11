package tn.sesame.domain;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="postuler")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Postuler {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idoffre;
	private int idcondidat;
	private String etat;
	
}
