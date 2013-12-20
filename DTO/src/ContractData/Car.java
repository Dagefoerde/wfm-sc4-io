package ContractData;

public class Car {
	
	private String licensePlate;
	private String colour;
	private String type;
	private float value;
	
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

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
	
}
