package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class displayProducts {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_ddl");
		EntityManager em = emf.createEntityManager();

		var qry = em.createQuery("from basics.products", products.class);
		var products = qry.getResultList();
		for (var prod : products) {
			System.out.printf("%d %s %double  %s %s %s\n", prod.getProdid(), prod.getName(), prod.getPrice(),
					prod.getQty(), prod.getRemarks(), prod.getCatCode());
		}
		em.close();
		emf.close();

	}

}
