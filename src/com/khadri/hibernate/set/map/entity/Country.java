package com.khadri.hibernate.set.map.entity;

import java.util.Map;
import java.util.Set;

public class Country {
	private int countryId;
	private String countryName;
	private Set<String> rivers;
	private Map<String, String> capitals;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Set<String> getRivers() {
		return rivers;
	}

	public void setRivers(Set<String> rivers) {
		this.rivers = rivers;
	}

	public Map<String, String> getCapitals() {
		return capitals;
	}

	public void setCapitals(Map<String, String> capitals) {
		this.capitals = capitals;
	}
}
