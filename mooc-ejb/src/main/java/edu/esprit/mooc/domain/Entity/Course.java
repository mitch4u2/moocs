package edu.esprit.mooc.domain.Entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Course
 *
 */
@Entity

public class Course implements Serializable {

	
	private Integer id_Course;
	private String nom_Course;
	private Date date_debut;
	private Integer duree;
	private String video;
	private String photo;
	private String pre_requis;
	private String objectif;
	private String statut;
	private static final long serialVersionUID = 1L;

	public Course() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Course() {
		return this.id_Course;
	}

	public void setId_Course(Integer id_Course) {
		this.id_Course = id_Course;
	}   
	public String getNom_Course() {
		return this.nom_Course;
	}

	public void setNom_Course(String nom_Course) {
		this.nom_Course = nom_Course;
	}   
	public Date getDate_debut() {
		return this.date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}   
	public Integer getDuree() {
		return this.duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}   
	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}   
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}   
	public String getPre_requis() {
		return this.pre_requis;
	}

	public void setPre_requis(String pre_requis) {
		this.pre_requis = pre_requis;
	}   
	public String getObjectif() {
		return this.objectif;
	}

	public void setObjectif(String objectif) {
		this.objectif = objectif;
	}   
	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}
   
}
