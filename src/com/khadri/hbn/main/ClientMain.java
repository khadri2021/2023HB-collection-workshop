package com.khadri.hbn.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.khadri.hbn.restaturant.Restaturant;
import com.khadri.hbn.session.BasicOperations;

public class ClientMain {
	public static void main(String[] args) {

		Session sess = BasicOperations.getSession();

		Transaction txn = sess.beginTransaction();

		Set<String> set = new HashSet<>();

		set.add("BIRYANI'S");
		set.add("FRIED RICE");
		set.add("STATERRES");
		set.add("SOFT DRINKS");

		List<String> list = new ArrayList<>();

		list.add("CHICKEN BIRYANI");
		list.add("GOBI FRIED RICE");
		list.add("CHICKEN 65");
		list.add("SPIRITE");

		List<String> list1 = new ArrayList<>();

		list1.add("MUTTON BIRYANI");
		list1.add("CHICKEN MANDHI");
		list1.add("CHICKEN FRIED RICE");
		list1.add("CHICKEN 555");
		list1.add("PEPSI");

		Set<String> set1 = new HashSet<>();

		set1.add("BIRYANI'S");
		set1.add("MANDHI'S");
		set1.add("FRIED RICE");
		set1.add("STATERRES");
		set1.add("SOFT DRINKS");
		Restaturant restaturant = new Restaturant();
		restaturant.setRestName("SRI KRISHNA GRAND");
		restaturant.setMenu(set);
		restaturant.setOrders(list);

		Restaturant restaturant1 = new Restaturant();

		restaturant1.setRestName("SANNDHI");
		restaturant1.setMenu(set1);
		restaturant1.setOrders(list1);

		sess.save(restaturant);
		sess.save(restaturant1);

		txn.commit();
		sess.close();

	}

}
