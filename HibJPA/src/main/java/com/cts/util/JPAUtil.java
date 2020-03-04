package com.cts.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static final String persistence_unit_name="hiber";
	private static EntityManagerFactory factory;
	public static EntityManagerFactory getEntityManagerFactory( ) {
		if(factory==null) {
			factory = Persistence.createEntityManagerFactory(persistence_unit_name);
			
		}
		return factory;

			
	}
	public static void shutdown() {
		if(factory!=null) {
			factory.close();
		}
		
	}
	
	

}
