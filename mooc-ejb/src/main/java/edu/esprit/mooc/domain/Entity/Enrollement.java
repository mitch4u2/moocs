package edu.esprit.mooc.domain.Entity;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Enrollement
 *
 */
@Entity

public class Enrollement implements Serializable {

	
	private Integer id_User;
	private Integer id_Course;
	private static final long serialVersionUID = 1L;

	public Enrollement() {
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
	public Integer getId_Course() {
		return this.id_Course;
	}

	public void setId_Course(Integer id_Course) {
		this.id_Course = id_Course;
	}
   
}
