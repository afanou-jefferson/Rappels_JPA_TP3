package fr.diginamic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.entites.Film;

@Repository
public interface iRepoFilm extends JpaRepository<Film, Integer> {

}
