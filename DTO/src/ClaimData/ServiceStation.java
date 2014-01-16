package ClaimData;

import java.io.Serializable;

import General.Address;

public class ServiceStation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String phone;
	private Address address;
	
	public ServiceStation(String phone, Address address){
		this.phone = phone;
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
