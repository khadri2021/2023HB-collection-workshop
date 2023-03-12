package com.khadri.hbn.restaturant;

import java.util.List;
import java.util.Set;

public class Restaturant {
	private String rName;
	private int rId;
	private List<String> orders;
	private Set<String> menu;
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
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
