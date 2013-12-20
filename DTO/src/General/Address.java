package General;

public class Address {
	
	private int streetNumber;
	private String street;
	private String postalCode;
	
	public Address(int a, String b, String c){
		this.streetNumber = a;
		this.street = b;
		this.postalCode = c;
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

}
