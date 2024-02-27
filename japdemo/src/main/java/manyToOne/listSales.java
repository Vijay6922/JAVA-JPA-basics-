package manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class listSales {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_ddl");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from manytoone.Sales", Sales.class); // JPQL
		var sales = query.getResultList();

		for (var s : sales)
			System.out.printf("%-10d  %-8.2f %-15d %-10d\n", s.getNo(), s.getAmount(), s.getQunatity(),
					s.getProduct().getId());

	}

}