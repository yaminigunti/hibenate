package com.cts.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cts.model.composition.BankAccount;
import com.cts.model.composition.Customer;
import com.cts.util.JPAUtil;

public class Example3 {
	public static void main(String[]args) {
		
		BankAccount ba=new BankAccount();
		Customer cs=new Customer("888833345","Sundar",ba);
		ba.setAccno("SBN001");
		ba.setCustomer(cs);
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(cs);
		txn.commit();
		JPAUtil.shutdown();
		
	}
	

}
