package com.cts.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.cts.model.Employee;
import com.cts.util.JPAUtil;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Employee e= new Employee();
		System.out.print("Empid" );
		e.setEmpid(sc.nextInt());
		System.out.print("Ename" );
		e.setEmpname(sc.next());
		System.out.print("basic" );
		e.setBasic(sc.nextDouble());
		EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Emp saved");
		JPAUtil.shutdown();
		sc.close();
		
		
		
		
	}

}
