package ej3Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Ej3Hibernate {

	public static void main(String[] args) {
		EntityManagerFactory managerFactory = Persistence
				.createEntityManagerFactory("ejsHibernate");
		
		EntityManager em = managerFactory.createEntityManager();
 
        Employee emp = new Employee();
		emp.setName("Emma Watson");  
        emp.setId(123);
        
        EntityTransaction tran = em.getTransaction();
        tran.begin();
        em.persist(emp);    
        tran.commit();
        em.close();
        managerFactory.close();
	}

}
