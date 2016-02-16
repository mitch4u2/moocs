package edu.esprit.mooc.domain.Entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Messsage
 *
 */
@Entity

public class Messsage implements Serializable {

	
	private Integer id_Message;
	private String body;
	private String subject;
	private String date_Message;
	private Integer state_Message;
	private static final long serialVersionUID = 1L;

	public Messsage() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Message() {
		return this.id_Message;
	}

	public void setId_Message(Integer id_Message) {
		this.id_Message = id_Message;
	}   
	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}   
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}   
	public String getDate_Message() {
		return this.date_Message;
	}

	public void setDate_Message(String date_Message) {
		this.date_Message = date_Message;
	}   
	public Integer getState_Message() {
		return this.state_Message;
	}

	public void setState_Message(Integer state_Message) {
		this.state_Message = state_Message;
	}
   
}
