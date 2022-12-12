package ej3Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import ej3Hibernate.Employee;

@SuppressWarnings("unused")
public class Ej3Hibernate {

	public static void main(String[] args) {
			   
		      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ejsHibernate" );
		      
		      EntityManager entitymanager = emfactory.createEntityManager( );
		      entitymanager.getTransaction( ).begin( );

		      Employee employee = new Employee( ); 
		      employee.setId( 1201 );
		      employee.setName( "Pepe" );
		      entitymanager.persist( employee );
		      entitymanager.getTransaction( ).commit( );

		      entitymanager.close( );
		      emfactory.close( );
	}

}
