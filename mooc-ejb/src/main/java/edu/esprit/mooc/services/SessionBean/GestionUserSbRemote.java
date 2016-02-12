package edu.esprit.mooc.services.SessionBean;

import javax.ejb.Remote;

import edu.esprit.mooc.domain.Entity.User;

@Remote
public interface GestionUserSbRemote {

	public void persistUser(User user);
	public void updateUser(User user);
	public void removetUser(User user);
	public User findUserById(int id);


	
}
