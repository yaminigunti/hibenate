package com.cts.ui;

import java.util.List;
import javax.persistence.EntityManager;

import com.cts.model.Employee;
import com.cts.util.JPAUtil;
import javax.persistence.Query;

public class JPQLEx {
	
	
	@SuppressWarnings("unchecked")
	public static void main(String []args) {
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		Employee emp=em.find(Employee.class,101);
		
		if(emp != null) {
			System.out.println(emp); 
		}
		
		String qryString ="SELECT e FROM EMPLOYEE e";
		Query qry=em.createQuery(qryString);
		
		display(qry.getResultList());
		
		display(em.createQuery("SELECT e FROM Employee e WHERE e.basic>25000")
				.getResultList());
		
		List<String>names=em.createQuery("SELECT e.ename FROM Employee e")
				.getResultList();
		
		for(String n: names) {
			System.out.println(n);
		}
		
		em.close();
		JPAUtil.shutdown();
	}
	
   static void display(List<Employee>data) {
	   System.out.println("--------------------");
	   for(Employee e:data) {
		   System.out.println(e);
	   }
	   System.out.println("---------------------");
    }
}


