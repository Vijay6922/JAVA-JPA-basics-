package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class listSales {

	public static void main(String[] args) throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_");
		EntityManager em = emf.createEntityManager();
		var query = em.createQuery("from basics.Sales1", Sales1.class);
		var sales = query.getResultList();
		for (var s : sales) {
			System.out.printf("%d %d %-30s %d  %8.2f\n", s.getInvno(), s.getId(), s.getDate(), s.getQty(),
					s.getAmount());
		}

		em.close();
		emf.close();

	}

}