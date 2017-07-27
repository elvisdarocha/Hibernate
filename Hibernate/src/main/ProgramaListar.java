package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dominio.Produto;

public class ProgramaListar {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManager em = Conexao.getEntityManager();
		
		Query query = em.createQuery("from Produto", Produto.class);
		List<Produto> produtoList = query.getResultList();
		
		produtoList.forEach(System.out::println);
	}

}
