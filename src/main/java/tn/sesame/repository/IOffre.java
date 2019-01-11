package tn.sesame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.sesame.domain.Offre;

public interface IOffre extends JpaRepository<Offre,Integer> {
	
	
	 @Query("select o from Offre o where o.categorie.idcat = :cat and o.ville.idville = :vill and o.societe.idsociete = :soc")
	  public List<Offre> findBySocieteVC(@Param("cat") Integer id1,
	                                 @Param("vill") Integer id2,
	                                 @Param("soc") Integer id3);

	 @Query("select o from Offre o where  o.ville.idville = :vill ")
	  public List<Offre> findByVille(
	                                 @Param("vill") Integer id2
	                                 );
	 @Query("select o from Offre o where  o.societe.idsociete = :societe ")
	  public List<Offre> findBySociete(
	                                 @Param("societe") Integer id3
	                                 );
	 @Query("select o from Offre o where  o.categorie.idcat = :categorie ")
	  public List<Offre> findByCategorie(
	                                 @Param("categorie") Integer id3
	                                 );
	 
	 
	 
	 

}
