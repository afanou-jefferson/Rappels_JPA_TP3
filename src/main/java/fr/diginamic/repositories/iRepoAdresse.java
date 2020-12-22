package fr.diginamic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import fr.diginamic.entites.Adresse;


@Repository
@EnableJpaRepositories // Pour scanner les Repo si placés en dehors du package du Main
public interface iRepoAdresse extends JpaRepository<Adresse, Integer> {

}
