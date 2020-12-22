package fr.diginamic.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // Cette stratégie est opti pour le polymorphisme mais elle implique une persistence du parent en dur , ici Intervenant
//@MappedSuperclass // En utilisant cette stratégie, on ne peut pas appeler le parent dans les autres entités, ex : TacheDatee ici bug
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Intervenant {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // On ne peut pas utiliser IDENTITY avec un héritage TABLE_PER_CLASS
	private Integer id;
	
	private String nom;
	
	private String prenom;
	
	@OneToMany(mappedBy = "intervenant")
	private List<Tache> taches;
	
	@ManyToMany
	@JoinTable(name = "film_intervenant", joinColumns = @JoinColumn(name = "id_intervenant", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_film", referencedColumnName = "id"))
	private List<Film> films;
	
	@ManyToMany
	@JoinTable(name = "adresse_intervenant", joinColumns = @JoinColumn(name = "id_intervenant", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_adresse", referencedColumnName = "id"))
	private List<Adresse> adresse;

//	CONSTRUCTOR
	public Intervenant() {
		this.taches = new ArrayList<>();
		this.films = new ArrayList<>();
		this.adresse = new ArrayList<>();
	}

//	GETTERS & SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	public List<Adresse> getAdresse() {
		return adresse;
	}

	public void setAdresse(List<Adresse> adresse) {
		this.adresse = adresse;
	}
}
