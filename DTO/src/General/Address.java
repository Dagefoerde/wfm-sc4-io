package General;

import java.io.Serializable;

public class Address implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int streetNumber;
	private String street;
	private String postalCode;
	private String city;
	
	public Address(){
		
	}
	
	public Address(int streetNumber, String street, String postalCode, String city){
		this.streetNumber = streetNumber;
		this.street = street;
		this.postalCode = postalCode;
		this.city = city;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

}
