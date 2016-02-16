package edu.esprit.mooc.domain.Entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	
	private Integer id_User;
	private String name_User;
	private String lastname_User;
 	private List<Message> list_message=new ArrayList<Message>();
	
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_User() {
		return this.id_User;
	}

	public void setId_User(Integer id_User) {
		this.id_User = id_User;
	}   
	public String getName_User() {
		return this.name_User;
	}

	public void setName_User(String name_User) {
		this.name_User = name_User;
	}   
	public String getLastname_User() {
		return this.lastname_User;
	}

	public void setLastname_User(String lastname_User) {
		this.lastname_User = lastname_User;
	}
	@OneToMany
	public List<Message> getList_message() {
		return list_message;
	}
	public void setList_message(List<Message> list_message) {
		this.list_message = list_message;
	}

	
   
}
