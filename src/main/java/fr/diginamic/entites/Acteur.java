package fr.diginamic.entites;

import javax.persistence.Entity;

@Entity
public class Acteur extends Intervenant {
	
	private String agence;
	
	private Double salaire;

	public Acteur() {
		super();
	}

	public Acteur(String nom, String prenom, String agence2, Double salaire2) {
		// TODO Auto-generated constructor stub
	}

	public String getAgence() {
		return agence;
	}

	public void setAgence(String agence) {
		this.agence = agence;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
}
