package fr.diginamic.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import fr.diginamic.entites.Acteur;

@Repository
@EnableJpaRepositories // Pour scanner les Repo si placés en dehors du package du Main
public interface iRepoActeur extends JpaRepository<Acteur, Integer> {
	public Optional<Acteur> findByNomAndPrenom(String nom, String prenom);
}
