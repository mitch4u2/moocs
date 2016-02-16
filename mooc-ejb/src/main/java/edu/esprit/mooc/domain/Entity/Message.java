package edu.esprit.mooc.domain.Entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Message
 *
 */
@Entity

public class Message implements Serializable {

	private Integer id_Message;
	private String body;
	private String subject;
	private String date_Message;
	private Integer state_Message;
	private User sender;
	private User receiver;
	private static final long serialVersionUID = 1L;

	public Message() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Message() {
		return id_Message;
	}

	public void setId_Message(Integer id_Message) {
		this.id_Message = id_Message;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDate_Message() {
		return date_Message;
	}
	public void setDate_Message(String date_Message) {
		this.date_Message = date_Message;
	}
	public Integer getState_Message() {
		return state_Message;
	}
	public void setState_Message(Integer state_Message) {
		this.state_Message = state_Message;
	}
	@ManyToOne
	public User getSender() {
		return sender;
	}
	public void setSender(User sender) {
		this.sender = sender;
	}
	@ManyToOne
	public User getReceiver() {
		return receiver;
	}
	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}
   
}


