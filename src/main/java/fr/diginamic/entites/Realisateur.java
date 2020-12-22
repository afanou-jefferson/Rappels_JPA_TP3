package fr.diginamic.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Realisateur extends Intervenant {

	private Double commission;
	
	public Realisateur() {}
	
	public Realisateur(String nom, String prenom, Double commission2) {
		super();
	}

	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

}
