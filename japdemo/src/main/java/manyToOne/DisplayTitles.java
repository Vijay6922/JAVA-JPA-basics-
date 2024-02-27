package manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DisplayTitles {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_ddl");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from manyToOne.Title", Title.class); // JPQL
		var titles = query.getResultList();

		for (var t : titles) {
			System.out.printf("%-80s\n", t.getTitle());
		}

		em.close();
		emf.close();
	}
}