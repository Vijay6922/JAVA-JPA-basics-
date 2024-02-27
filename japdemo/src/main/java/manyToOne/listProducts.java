package manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class listProducts {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_ddl");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from manyToOne.Product", Product.class); // JPQL
		var Products = query.getResultList();

		for (var p : Products) {
			System.out.printf("%-30d", p.getId());
		}
		em.close();
		emf.close();
	}

}