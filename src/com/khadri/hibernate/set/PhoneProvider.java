package com.khadri.hibernate.set;
 import java.util.Set;
 public class PhoneProvider {
 	private int ppId;

	private String ppName;

	private Set<String> simNumbers;

 
	public int getPpId() {

		return ppId;

	}
 
	public void setPpId(int ppId) {

		this.ppId = ppId;

	}
 	public String getPpName() {

		return ppName;

	}

 	public void setPpName(String ppName) {

		this.ppName = ppName;

	}

 	public Set<String> getSimNumbers() {

		return simNumbers;

	}
 	public void setSimNumbers(Set<String> simNumbers) {

		this.simNumbers = simNumbers;

	}




}