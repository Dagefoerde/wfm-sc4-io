package DTO;

import java.io.Serializable;


public class ServiceStation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int phone;
	private Address address;
	
	public ServiceStation(int a, Address b){
		this.phone = a;
		this.address = b;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
