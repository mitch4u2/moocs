package edu.esprit.mooc.domain.Entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PropositionSurvey
 *
 */
@Entity

public class PropositionSurvey implements Serializable {

	
	private Integer id_Survey_Prop;
	private Integer id_Survey_Quest;
	private String proposition;
	private static final long serialVersionUID = 1L;

	public PropositionSurvey() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Survey_Prop() {
		return this.id_Survey_Prop;
	}

	public void setId_Survey_Prop(Integer id_Survey_Prop) {
		this.id_Survey_Prop = id_Survey_Prop;
	}   
	public Integer getId_Survey_Quest() {
		return this.id_Survey_Quest;
	}

	public void setId_Survey_Quest(Integer id_Survey_Quest) {
		this.id_Survey_Quest = id_Survey_Quest;
	}   
	public String getProposition() {
		return this.proposition;
	}

	public void setProposition(String proposition) {
		this.proposition = proposition;
	}
   
}
