package edu.esprit.mooc.client.BuisnessDeligator;

import java.util.List;

import edu.esprit.mooc.client.ServiceLocator.ServiceLocator;
import edu.esprit.mooc.domain.Entity.User;
import edu.esprit.mooc.services.SessionBean.GestionUserSbRemote;

public class GestUserBD {
	
private static final String jndiname="/mooc-ejb/usersb!edu.esprit.mooc.services.SessionBean.GestionUserSbRemote";
	
	
	private static  GestionUserSbRemote getProxy()
	{
		
	return (GestionUserSbRemote)ServiceLocator.getInstance().getProxy(jndiname);
		
	}
	
	public static void createUser(User user)
	{
		getProxy().persistUser(user);
		
	}
	
	
	public static User authenticateUser(String login,String password)
	{
		return null;
		//getProxy().authenticateUser(login, password);
	}
	
	public static List<User> getAllUser()
	{
		return null; 
				//getProxy().getAllUsers();
	}
	public static  User getUserById(int id_user)
	{
		return getProxy().findUserById(id_user);
	}

//	public static List<Bug> getBugByUser_Join(String nom)
//	{
//		return getProxy().JoinBugUser(nom);
//	}
	
	
	public static void remove(User user)
	{
		//getProxy().removeUser(user);
	}
	

}
