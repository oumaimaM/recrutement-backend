package tn.sesame.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import tn.sesame.domain.CompteCondidat;



public interface IComptecondidat extends JpaRepository<CompteCondidat,Integer> {
    CompteCondidat findByemail(String email);
    

    boolean existsByEmail(String email);

}
