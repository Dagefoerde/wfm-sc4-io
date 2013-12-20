package ContractData;

import java.io.Serializable;

public class Car implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String licensePlate;
	private String colour;
	private String type;
	private double value;
	
	public Car(){
		
	}
	
	public Car(String a, String b, String c, float d){
		this.licensePlate = a;
		this.colour = b;
		this.type = c;
		this.value = d;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
