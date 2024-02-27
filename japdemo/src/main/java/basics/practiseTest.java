package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class practiseTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		
		var query = em.createQuery("from basics.titles",titles.class);
		var titles = query.getResultList();
		
		for (var v : titles)
		{
			System.out.printf("%s" ,v.getName());
		}

		em.close();
		emf.close();
	}

}
