package fr.diginamic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.entites.Realisateur;

@Repository
public interface iRepoRealisateur extends JpaRepository<Realisateur, Integer> {

}
