package edu.esprit.mooc.services.SessionBean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.mooc.domain.Entity.User;

/**
 * Session Bean implementation class GestionUserSb
 */
@Stateless(name="usersb")
@LocalBean
public class GestionUserSb implements GestionUserSbRemote {

	@PersistenceContext
	EntityManager em;
	
	
    /**
     * Default constructor. 
     */
    public GestionUserSb() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void persistUser(User user) {
		em.persist(user);
		
	}

	@Override
	public void updateUser(User user) {
		em.merge(user);
		
	}

	@Override
	public void removetUser(User user) {
		em.remove(em.merge(user));
		
	}

	@Override
	public User findUserById(int id) {
	
		User user=em.find(User.class, id);
		if(user != null)
		{
			return user;
		}
		return null;
		
	}

}
