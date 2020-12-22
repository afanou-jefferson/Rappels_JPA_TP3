package fr.diginamic.entites;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nom;

	@Column(name = "date_maj")
	private Date dateMaj;

	@OneToMany(mappedBy = "categorie")
	private List<Film> films;

	public Categorie(String nom, Date dateMaj) {
		this.nom = nom;
		this.dateMaj = dateMaj;
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", nom=" + nom + ", date_maj=" + dateMaj + "]";
	}

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

	public Date getDate_maj() {
		return dateMaj;
	}

	public void setDate_maj(Date date_maj) {
		this.dateMaj = date_maj;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}
}
