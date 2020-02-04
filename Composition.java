package com.cts.ui;

import javax.persistence.EntityManager;

import com.cts.model.composition.Address;
import com.cts.model.composition.Faculty;
import com.cts.util.JPAUtil;

public class Composition {
	public static void main(String[] a) {
		Faculty f=new Faculty("vamsi",
				new Address("A201","brookside","banglore,karnataka."));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
		System.out.println("Faculty Saved!");
		JPAUtil.shutdown();
	}
	
}
