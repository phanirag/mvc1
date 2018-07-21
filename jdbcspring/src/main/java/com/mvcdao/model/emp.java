package com.mvcdao.model;

public class emp {
	private int ID;
	private String name;
	private String email;
	private String address;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "emp [ID=" + ID + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	 
}
