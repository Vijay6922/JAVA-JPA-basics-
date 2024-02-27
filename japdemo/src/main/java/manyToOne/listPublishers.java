package manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class listPublishers {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_ddl");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from manyToOne.Publishers", Publishers.class);
		var publishers = query.getResultList();

		for (var publisher : publishers) {
			System.out.printf("Publisher: %-30s%n", publisher.getName());

			for (var title : publisher.getTitle()) {
				System.out.printf("  Title: %-80s Price: %.2f%n", title.getTitle(), title.getPrice());
			}
		}

		em.close();
		emf.close();
	}
}