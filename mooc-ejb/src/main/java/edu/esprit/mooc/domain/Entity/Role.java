package edu.esprit.mooc.domain.Entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Role
 *
 */
@Entity

public class Role implements Serializable {

	
	private Integer id_Role;
	private Integer id_User;
	private String role;
	private static final long serialVersionUID = 1L;

	public Role() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Role() {
		return this.id_Role;
	}

	public void setId_Role(Integer id_Role) {
		this.id_Role = id_Role;
	}   
	public Integer getId_User() {
		return this.id_User;
	}

	public void setId_User(Integer id_User) {
		this.id_User = id_User;
	}   
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}
   
}
