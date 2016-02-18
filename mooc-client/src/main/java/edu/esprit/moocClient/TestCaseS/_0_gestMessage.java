package edu.esprit.moocClient.TestCaseS;

import static org.junit.Assert.*;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.Test;

import edu.esprit.mooc.domain.Entity.Message;
import edu.esprit.mooc.domain.Entity.User;
import edu.esprit.mooc.services.SessionBean.GestionMessageSbRemote;
import edu.esprit.mooc.services.SessionBean.GestionUserSbRemote;

public class _0_gestMessage {

	@Test
	public void test() {



		 
		try {
			Context ctx=new InitialContext();
			
			GestionMessageSbRemote gestion=(GestionMessageSbRemote) ctx.lookup("/mooc-ejb/messagesb!"+GestionMessageSbRemote.class.getCanonicalName());
			Message message=new Message();
			
			message.setBody("Welcome Back");
			message.setDate_Message("21/05/2009");
			message.setState_Message(0);
			message.setSubject("test");
			
			
			gestion.persistMessage(message);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
		
		
	}

