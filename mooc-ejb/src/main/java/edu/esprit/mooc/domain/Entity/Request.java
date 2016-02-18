package edu.esprit.mooc.domain.Entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Request
 *
 */
@Entity

public class Request implements Serializable {

	
	private Integer id_Request;
	private Integer id_User;
	private String statut;
	private static final long serialVersionUID = 1L;

	public Request() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Request() {
		return this.id_Request;
	}

	public void setId_Request(Integer id_Request) {
		this.id_Request = id_Request;
	}   
	public Integer getId_User() {
		return this.id_User;
	}

	public void setId_User(Integer id_User) {
		this.id_User = id_User;
	}   
	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}
   
}
