package main;

import javax.persistence.EntityManager;

import dominio.Produto;

public class ProgramaCadastrar{
	

	public static void main(String[] args) {

		Produto produto1 = new Produto("Computador", 35);
		Produto produto2 = new Produto("Mouse", 100);
		
		EntityManager em = Conexao.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(produto1);
		em.persist(produto2);
		em.getTransaction().commit();
		
		em.close();
		Conexao.emf.close();
		
	}

}
