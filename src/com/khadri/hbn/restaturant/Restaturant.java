package com.khadri.hbn.restaturant;

import java.util.List;
import java.util.Set;

public class Restaturant {
	private String restName;
	private int restId;
	private List<String> orders;
	private Set<String> menu;

	public String getRestName() {
		return restName;
	}

	public void setRestName(String restName) {
		this.restName = restName;
	}

	public int getRestId() {
		return restId;
	}

	public void setRestId(int restId) {
		this.restId = restId;
	}

	public List<String> getOrders() {
		return orders;
	}

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}

	public Set<String> getMenu() {
		return menu;
	}

	public void setMenu(Set<String> menu) {
		this.menu = menu;
	}

}
