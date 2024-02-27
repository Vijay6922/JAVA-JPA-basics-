package inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class listDoctors {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory
				 ("mssqlserver_pubs_ddl");
		EntityManager em = emf.createEntityManager();

		var Doctors = em.createQuery("from inheritance.Doctors", Doctors.class).getResultList();

		for (var p : Doctors) {
			System.out.println(p.getClass());
			System.out.printf("%s\n", p.toString());
		}
		
	    em.close();
	    emf.close();
	}
}