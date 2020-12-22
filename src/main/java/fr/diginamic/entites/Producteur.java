package fr.diginamic.entites;

import javax.persistence.Entity;

@Entity
public class Producteur extends Intervenant {

	private Double budget;
	
	public Producteur() {}
	
	public Producteur(String nom, String prenom, Double budget2) {
		super();
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

}
