package com.khadri.hibernate.set.map.client;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.khadri.hibernate.session.BasicOperationSession;
import com.khadri.hibernate.set.map.entity.Country;

public class ClientMain {
	public static void main(String[] args) {

		Session session = BasicOperationSession.getSession();
		Transaction txn = session.beginTransaction();

		Country country = new Country();
		Set<String> rivers = new HashSet<>();
		rivers.add("Ganges");
		rivers.add("Indus River");
		rivers.add("Brahmaputra");
		rivers.add("Godavari River");
		rivers.add("Kaveri River");

		Map<String, String> capitals = new HashMap<>();

		capitals.put("Andhra Pradesh", "Amaravati");
		capitals.put("Arunachal Pradesh", "Itanagar");
		capitals.put("Assam", "Dispur");
		capitals.put("Bihar", "Patna");
		capitals.put("Chhattisgarh", "Raipur");
		capitals.put("Goa", "Panaji");

		country.setCountryName("India");
		country.setCapitals(capitals);
		country.setRivers(rivers);
		session.save(country);
		txn.commit();
		session.close();
	}
}
