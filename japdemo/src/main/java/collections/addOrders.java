package collections;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class addOrders {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_ddl");
		EntityManager em = emf.createEntityManager();

		orders o = new orders();
		o.setName("vijay");
		o.setDate("15/9/23");
		products p = new products();
		p.setCategorycode("c");
		p.setPrice(100);
		p.setProductname("h2r");
		p.setQuantity("1");
		p.setRemarks("super");
		
		o.getProductIds().add(p);

		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}