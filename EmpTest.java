package com.cts.model;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpTest {
public static void main(String []args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("JHPU");
	EntityManager em= emf.createEntityManager();
	em.getTransaction().begin();
	Emp e=new Emp();
	e.setEmpname("yammu");
	em.persist(e);
	em.getTransaction().commit();
	em.close();
	emf.close();
	System.out.println("Inserted.....");
	
}
}
