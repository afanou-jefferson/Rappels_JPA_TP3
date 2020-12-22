package fr.diginamic.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer numeroRue;
	
	private String libelleRue;
	
	private String ville;
	
	private Integer codePostal;
	
	@ManyToMany
	@JoinTable(name = "adresse_intervenant", joinColumns = @JoinColumn(name = "id_adresse", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_intervenant", referencedColumnName = "id"))
	private List<Intervenant> intervenants;


	public Adresse(Integer numeroRue, String libelleRue, String ville, Integer codePostal) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.ville = ville;
		this.codePostal = codePostal;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(Integer numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Integer getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	public List<Intervenant> getIntervenants() {
		return intervenants;
	}

	public void setIntervenants(List<Intervenant> intervenants) {
		this.intervenants = intervenants;
	}

}
