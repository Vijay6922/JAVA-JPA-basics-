package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class removeProducts {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		var p = em.find(products.class, 103);
		if (p != null) {
			em.getTransaction().begin();
			em.remove(p);
			em.getTransaction().commit();
		} else {
			System.out.println("entered value is not present");
			em.close();
			emf.close();
		}

	}
}
