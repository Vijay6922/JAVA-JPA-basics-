package composition;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddCustomer {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_ddl");
		EntityManager em = emf.createEntityManager();

		customers c = new customers();
		c.setName("vijay");
		Address a = new Address();
		a.setAddress("kk road");
		a.setCity("narasaraopet");
		officeAddress o = new officeAddress();
		o.setAddress("beach road");
		o.setCity("vizaag");
		ContactInfo ci = new ContactInfo();
		ci.setEmail("123@gmail.com");
		ci.setPhone(12345);

		//c.setHome(a);
		c.setOffice(o);
		c.setContact(ci);

		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}
