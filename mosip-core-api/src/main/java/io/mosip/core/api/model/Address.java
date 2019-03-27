package io.mosip.core.api.model;

public class Address {
	
	private long uin;
	private String country;
	private String state;
	private String dist;
	private String street;
	private String name;
	
	
	
	public Address() {}



	
	
	public Address(long uin, String country, String state, String dist, String street, String name) {
		super();
		this.uin = uin;
		this.country = country;
		this.state = state;
		this.dist = dist;
		this.street = street;
		this.name = name;
	}


	


	@Override
	public String toString() {
		return "Address [uin=" + uin + ", country=" + country + ", state=" + state + ", dist=" + dist + ", street="
				+ street + ", name=" + name + "]";
	}





	public long getUin() {
		return uin;
	}



	public void setUin(long uin) {
		this.uin = uin;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getDist() {
		return dist;
	}



	public void setDist(String dist) {
		this.dist = dist;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	

	
}
