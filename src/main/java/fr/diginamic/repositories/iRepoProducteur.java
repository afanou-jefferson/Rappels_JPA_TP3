package fr.diginamic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.entites.Producteur;

@Repository
public interface iRepoProducteur extends JpaRepository<Producteur, Integer> {

}
