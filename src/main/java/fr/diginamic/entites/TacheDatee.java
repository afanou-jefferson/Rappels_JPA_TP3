package fr.diginamic.entites;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import fr.diginamic.entites.Tache;

@Entity
//@DiscriminatorValue("D") // Ajoute une colonne discriminante afin de distinguer les "types" de Tache
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class TacheDatee extends Tache {
	
	@Temporal(TemporalType.DATE)
	private Date dateEcheance;

	public TacheDatee(String description, Date date, Date dateEcheance) {
		super(description, date);
		this.dateEcheance = dateEcheance;
	}
	
	public TacheDatee() {
		// TODO Auto-generated constructor stub
	}

	public Date getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	
	
}
