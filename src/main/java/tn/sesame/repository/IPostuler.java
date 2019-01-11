package tn.sesame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.sesame.domain.Postuler;

public interface IPostuler extends JpaRepository<Postuler,Integer> {

}
