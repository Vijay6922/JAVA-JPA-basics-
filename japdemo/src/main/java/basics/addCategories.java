package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class addCategories {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		categories c = new categories();
		c.setCatCode("vijay");
		c.setCatDesc("good boy");

		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}
