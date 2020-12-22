package fr.diginamic.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Film {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String titre;

	private String anneeSortie;

	@ManyToOne
	@JoinColumn(name = "id_categ")
	private Categorie categorie;

	@ManyToMany
	@JoinTable(name = "film_intervenant", joinColumns = @JoinColumn(name = "id_film", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_intervenant", referencedColumnName = "id"))
	private List<Intervenant> intervenants;

	public Film(String titre, String anneeSortie) {
		this.titre = titre;
		this.anneeSortie = anneeSortie;
		this.intervenants = new ArrayList<Intervenant>();
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", annee_sortie=" + anneeSortie + ", categorie=" + categorie
				 + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAnnee_sortie() {
		return anneeSortie;
	}

	public void setAnnee_sortie(String annee_sortie) {
		this.anneeSortie = annee_sortie;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public List<Intervenant> getIntervenants() {
		return intervenants;
	}

	public void setIntervenants(List<Intervenant> intervenants) {
		this.intervenants = intervenants;
	}
	
	public void addIntervenant(Intervenant intervenant) {
		this.getIntervenants().add(intervenant);
	}

}
