package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class addTitles {

	public static void main(String[] args) throws Exception{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		titles t = new titles();
		t.setId(1);
		t.setName("vijay");
		t.setType("ok");
		em.persist(t);
		em.getTransaction().commit();
		System.out.println(t);
		
		
		em.close();
		emf.close();
	}

}
