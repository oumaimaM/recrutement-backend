package tn.sesame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.sesame.domain.OffreCondidat;



public interface IOffreCondidat extends JpaRepository<OffreCondidat,Integer>  {

}
