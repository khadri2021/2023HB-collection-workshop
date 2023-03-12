package com.khadri.hbn.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.khadri.hbn.restaturant.Restaturant;

public class ClientMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session sess = factory.openSession();
		Transaction txn = sess.beginTransaction();

		Set<String> st = new HashSet<>();
		
		st.add("BIRYANI'S");
		st.add("FRIED RICE");
		st.add("STATERRES");
		st.add("SOFT DRINKS");

		List<String> li = new ArrayList<>();

		li.add("CHICKEN BIRYANI");
		li.add("GOBI FRIED RICE");
		li.add("CHICKEN 65");
		li.add("SPIRITE");

		List<String> li1 = new ArrayList<>();

		li1.add("MUTTON BIRYANI");
		li1.add("CHICKEN MANDHI");
		li1.add("CHICKEN FRIED RICE");
		li1.add("CHICKEN 555");
		li1.add("PEPSI");

		Set<String> st1 = new HashSet<>();
		
		st1.add("BIRYANI'S");
		st1.add("MANDHI'S");
		st1.add("FRIED RICE");
		st1.add("STATERRES");
		st1.add("SOFT DRINKS");
		Restaturant rest = new Restaturant();

		rest.setrName("SRI KRISHNA GRAND");
		rest.setMenu(st);
		rest.setOrders(li);

		Restaturant rest1 = new Restaturant();

		rest1.setrName("SANNIDHI");
		rest1.setMenu(st1);
		rest1.setOrders(li1);

		sess.save(rest);
		sess.save(rest1);

		 txn.commit();
		sess.close();
		factory.close();

	}

}
