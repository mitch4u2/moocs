package edu.esprit.mooc.services.SessionBean;

import javax.ejb.Remote;

import edu.esprit.mooc.domain.Entity.Message;

@Remote
public interface GestionMessageSbRemote {
	
	public void persistMessage(Message message);
	public void updateMessage(Message message);
	public void removeMessage(Message message);
	public Message findMessageById(int id);

}
