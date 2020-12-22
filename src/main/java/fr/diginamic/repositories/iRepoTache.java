package fr.diginamic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.entites.Tache;


@Repository
public interface iRepoTache extends JpaRepository<Tache, Integer> {

}
