package edu.esprit.mooc.services.SessionBean;

import javax.annotation.security.PermitAll;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.mooc.domain.Entity.Message;

/**
 * Session Bean implementation class GestionMessageSb
 */
@Stateless(name="messagesb")
@LocalBean
public class GestionMessageSb implements GestionMessageSbRemote {
 
	
	@PersistenceContext
	EntityManager em;
    /**
     * Default constructor. 
     */
    public GestionMessageSb() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void persistMessage(Message message) {
		em.persist(message);
	}

	@Override
	public void updateMessage(Message message) {
		em.merge(message);
		
	}

	@Override
	public void removeMessage(Message message) {
		em.remove(em.merge(message));
		
	}

	@Override
	public Message findMessageById(int id) {
		
		Message message=em.find(Message.class, id);
		if(message!=null)
		{
			return message;
		}
		return null;	
		
	}

}
