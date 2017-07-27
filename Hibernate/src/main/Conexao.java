package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

	public static EntityManagerFactory emf;
	
	public static EntityManager getEntityManager(){
		if(emf == null){
			emf = Persistence.createEntityManagerFactory("mydb");
		}
		return emf.createEntityManager();
	}

}