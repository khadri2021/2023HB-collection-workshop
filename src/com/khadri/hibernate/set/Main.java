package com.khadri.hibernate.set;

 import java.util.HashSet;

import java.util.Set;




import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

 public class Main {

 	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure();
 		SessionFactory factory = cfg.buildSessionFactory();
 		Session session = factory.openSession();

		Transaction txn = session.beginTransaction();
 		Set<String> set = new HashSet<>();

		set.add("8790606070");

		set.add("8688102109");

		set.add("9999999999");

		set.add("8888888888");
 
		PhoneProvider provider1 = new PhoneProvider();

		provider1.setPpName("JIO");

		provider1.setSimNumbers(set);

 		Set<String> set2 = new HashSet<>();

		set2.add("9440877757");

		set2.add("9889988988");

		set2.add("9848066882");

		set2.add("9333777999");
 		PhoneProvider provider2 = new PhoneProvider();

		provider2.setPpName("AIRTEL");

		provider2.setSimNumbers(set2);
		
 		session.save(provider1);
 		session.save(provider2);
 		txn.commit();
		session.close();

	}

}