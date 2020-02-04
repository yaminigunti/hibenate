package com.cts.ui;

import javax.persistence.EntityManager;
import com.cts.model1.ContractEmp;
import com.cts.model1.Employee1;
import com.cts.model1.ManagerEmp;
import com.cts.util.JPAUtil;

public class Employee2 {
 public static void main(String args[]) {
	 Employee1 e = new Employee1(101,"yami",23000);
	 ManagerEmp m=new ManagerEmp(102,"rani",23900,3400);
	 ContractEmp ce=new ContractEmp(103,"bunny",43000,11);
	 
	 EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();

		em.getTransaction().begin();
		em.persist(e);
		em.persist(m);
		em.persist(ce);
		em.getTransaction().commit();
		System.out.println("emp saved"); 
		JPAUtil.shutdown();
	 
 }
}
