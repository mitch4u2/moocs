package edu.esprit.mooc.domain.Entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Survey
 *
 */
@Entity

public class Survey implements Serializable {

	
	private Integer id_Survey;
	private Integer nbre_question;
	private String nom_survey;
	private static final long serialVersionUID = 1L;

	public Survey() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Survey() {
		return this.id_Survey;
	}

	public void setId_Survey(Integer id_Survey) {
		this.id_Survey = id_Survey;
	}   
	public Integer getNbre_question() {
		return this.nbre_question;
	}

	public void setNbre_question(Integer nbre_question) {
		this.nbre_question = nbre_question;
	}   
	public String getNom_survey() {
		return this.nom_survey;
	}

	public void setNom_survey(String nom_survey) {
		this.nom_survey = nom_survey;
	}
   
}
