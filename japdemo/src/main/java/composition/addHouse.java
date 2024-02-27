package composition;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class addHouse {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_ddl");

		EntityManager em = emf.createEntityManager();

		house h = new house();
		h.setName("vijay");
		parking p = new parking();
		p.setParkingCode(234);
		p.setLength(10);
		p.setWidth(5);

		h.setHouses(p);

		em.getTransaction().begin();
		em.persist(h);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}