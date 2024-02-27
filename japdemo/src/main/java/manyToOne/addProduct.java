package manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class addProduct {
	public static void main(String[] args)throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_ddl");
		EntityManager em = emf.createEntityManager();

		Product p = new Product();
		p.setCatCode("1");
		
		p.setName("vijay");
		p.setQoh(2);
		Sales s = new Sales();
		
		s.setAmount(100);
		s.setDate("12-2-2001");
		s.setQunatity(2);
		p.getSales().add(s);
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}