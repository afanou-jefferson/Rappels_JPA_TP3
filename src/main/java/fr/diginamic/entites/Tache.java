package fr.diginamic.entites;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@Entity
//@DiscriminatorColumn(name = "TYPE")

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Tache {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String description;
	
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "id_intervenant")
	private Intervenant intervenant;

	public Tache(String string, Date date2) {
		this.description = string;
		this.date = date2;
	}
	
	public Tache() {}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Intervenant getIntervenant() {
		return intervenant;
	}

	public void setIntervenant(Intervenant intervenant) {
		this.intervenant = intervenant;
	}
}
