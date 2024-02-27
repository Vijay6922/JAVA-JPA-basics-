package inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class addDoctors {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_ddl");

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		residentalDoctors residentDoctor = new residentalDoctors();
		residentDoctor.setName("Dr. Smith");
		residentDoctor.setSalary(60000);

		em.persist(residentDoctor);

		consultants consultant = new consultants();
		consultant.setName("Dr. Johnson");
		consultant.setNoOfVisits(50);
		consultant.setCharge(100);

		em.persist(consultant);

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
