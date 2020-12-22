package fr.diginamic.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import fr.diginamic.entites.Acteur;
import fr.diginamic.entites.Adresse;
import fr.diginamic.entites.Categorie;
import fr.diginamic.entites.Film;
import fr.diginamic.entites.Producteur;
import fr.diginamic.entites.Realisateur;
import fr.diginamic.entites.Tache;
import fr.diginamic.entites.TacheDatee;
import fr.diginamic.factories.ActeurFactory;
import fr.diginamic.factories.ProducteurFactory;
import fr.diginamic.factories.RealisateurFactory;
import fr.diginamic.repositories.iRepoActeur;
import fr.diginamic.repositories.iRepoAdresse;
import fr.diginamic.repositories.iRepoCategorie;
import fr.diginamic.repositories.iRepoFilm;
import fr.diginamic.repositories.iRepoProducteur;
import fr.diginamic.repositories.iRepoRealisateur;
import fr.diginamic.repositories.iRepoTache;

@Service
@EnableJpaRepositories(basePackages = "fr.diginamic.repositories") // Autorise et active le scan de Repo si les repo ne sont pas dans le même package que la classe qui les emploie. ici package services != repositories.
public class FilmService extends AbstractService {

	@Autowired
	private ActeurFactory acteurFactory;

	@Autowired
	private ProducteurFactory producteurFactory;

	@Autowired
	private RealisateurFactory realisateurFactory;

	@Autowired
	private iRepoAdresse repoAdresse;

	@Autowired
	private iRepoFilm repoFilm;

	@Autowired
	private iRepoCategorie repoCategorie;

	@Autowired
	private iRepoActeur repoActeur;

	@Autowired
	private iRepoRealisateur repoRealisateur;

	@Autowired
	private iRepoProducteur repoProducteur;

	@Autowired
	private iRepoTache repoTache;

	public FilmService() {
		super();
	}

	public void insertTp3() {
		Categorie categorieTest = new Categorie("CategorieDeDrive", new Date());
		this.repoCategorie.save(categorieTest);

		Film film = new Film("Drive", "2011");
		film.setCategorie(categorieTest);

		Adresse adresse1 = new Adresse(1, "libelle1", "ville1", 34001);
		Adresse adresse2 = new Adresse(2, "libelle2", "ville2", 34002);
		Adresse adresse3 = new Adresse(3, "libelle3", "ville3", 34003);
		Adresse adresse4 = new Adresse(4, "libelle4", "ville4", 34004);
		Adresse adresse5 = new Adresse(7, "libelle5", "ville5", 34005);
		this.repoAdresse.save(adresse1);
		this.repoAdresse.save(adresse2);
		this.repoAdresse.save(adresse3);
		this.repoAdresse.save(adresse4);
		this.repoAdresse.save(adresse5);

		Acteur acteur1 = this.acteurFactory.build("Ninja", "XXX", "Agende des Ninja", 4000.0, adresse1);
		Acteur acteur2 = this.acteurFactory.build("De la Montagne", "Bao", "Ases", 1000.0, adresse2);
		Acteur acteur3 = this.acteurFactory.build("Mescudy", "Scott", "G.O.O.D", 3000.0, adresse3);
		Realisateur realisateur = this.realisateurFactory.build("Cameron", "James", 10.0, adresse4);
		Producteur producteur = this.producteurFactory.build("Je connais pas", "de Producteur", 200_000.0, adresse5);

		this.repoActeur.save(acteur1);
		this.repoActeur.save(acteur2);
		this.repoActeur.save(acteur3);
		this.repoRealisateur.save(realisateur);
		this.repoProducteur.save(producteur);

		Tache tache1 = new Tache("descirption1", new Date());
		Tache tache2 = new TacheDatee("descirption1", new Date(), new Date());
		tache1.setIntervenant(producteur);
		tache2.setIntervenant(producteur);

		this.repoTache.save(tache1);
		this.repoTache.save(tache2);

		film.addIntervenant(acteur1);
		film.addIntervenant(acteur2);
		film.addIntervenant(acteur3);
		film.addIntervenant(realisateur);
		film.addIntervenant(producteur);
		this.repoFilm.save(film); 
	}
}
