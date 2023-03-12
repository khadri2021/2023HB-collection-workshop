package com.khadri.hibernate.session;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BasicOperationSession {

	public static Session getSession() {
		Configuration cfg = new Configuration();
		
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();

		return factory.openSession();

	}
}
