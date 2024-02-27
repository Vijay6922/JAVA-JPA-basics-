package practise;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddDoctor {

	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_ddl");
		EntityManager em = emf.createEntityManager();

		ResidentDoctor rd = new ResidentDoctor();
		rd.setName("murali");
		rd.setDepartment("Internal Medicine");
		rd.setSalary(50000);

		Consultant cd = new Consultant();
		cd.setName("Dr. Johnson");
		cd.setPhno(998935763);
		cd.setDepartment("cardiology");
		cd.setVisits(5);
		cd.setChargePerVisit(200);

		em.getTransaction().begin();
		em.persist(rd);
		em.persist(cd);
		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}