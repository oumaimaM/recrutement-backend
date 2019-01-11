package tn.sesame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.sesame.domain.Categories;


public interface ICategories extends JpaRepository<Categories,Integer> {

}
