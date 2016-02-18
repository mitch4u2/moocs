package edu.esprit.mooc.domain.Entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Survey_quest
 *
 */
@Entity

public class Survey_quest implements Serializable {

	
	private Integer id_Survey_Quest;
	private Integer id_Survey;
	private String question;
	private static final long serialVersionUID = 1L;

	public Survey_quest() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Survey_Quest() {
		return this.id_Survey_Quest;
	}

	public void setId_Survey_Quest(Integer id_Survey_Quest) {
		this.id_Survey_Quest = id_Survey_Quest;
	}   
	public Integer getId_Survey() {
		return this.id_Survey;
	}

	public void setId_Survey(Integer id_Survey) {
		this.id_Survey = id_Survey;
	}   
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
   
}
