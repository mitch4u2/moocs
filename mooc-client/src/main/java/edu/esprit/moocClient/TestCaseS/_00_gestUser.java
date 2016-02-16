package edu.esprit.moocClient.TestCaseS;

import static org.junit.Assert.*;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.Test;

import edu.esprit.mooc.domain.Entity.User;
import edu.esprit.mooc.services.SessionBean.GestionUserSbRemote;



public class _00_gestUser {

	@Test
	public void test() {


		 
		try {
			Context ctx=new InitialContext();
			
			GestionUserSbRemote gestion=(GestionUserSbRemote) ctx.lookup("/mooc-ejb/usersb!"+GestionUserSbRemote.class.getCanonicalName());
			User user=new User();
			user.setName_User("Mohamed");
			user.setLastname_User("Hajjej");
			
			//user.setNom_User("Hajjej");
			//user.setPrenom_User("Mohamed");
			gestion.persistUser(user);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
