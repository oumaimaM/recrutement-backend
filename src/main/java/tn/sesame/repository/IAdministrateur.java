package tn.sesame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.sesame.domain.Administrateur;

public interface IAdministrateur extends JpaRepository<Administrateur,Integer>  {

}
