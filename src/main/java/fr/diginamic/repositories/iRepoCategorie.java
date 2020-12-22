package fr.diginamic.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.entites.Categorie;


@Repository
public interface iRepoCategorie extends JpaRepository<Categorie, Integer> {
	public Optional<List<Categorie>> findByDateMaj(Date date);
}
