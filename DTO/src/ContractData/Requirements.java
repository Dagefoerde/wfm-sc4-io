package ContractData;
import java.io.Serializable;
import java.util.ArrayList;

public class Requirements implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String status;
	private double naturalInsured;
	private double humanInsured;
	private boolean pickUpService;
	private ArrayList<Car> cars = new ArrayList<Car>();
	
	public Requirements(){
		
	}
	
	public Requirements(String a, double b, double c, boolean d, ArrayList<Car> e){
		this.status = a;
		this.naturalInsured = b;
		this.humanInsured = c;
		this.pickUpService = d;
		this.setCars(e);
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double isNaturalInsured() {
		return naturalInsured;
	}

	public void setNaturalInsured(double naturalInsured) {
		this.naturalInsured = naturalInsured;
	}

	public double isHumanInsured() {
		return humanInsured;
	}

	public void setHumanInsured(double humanInsured) {
		this.humanInsured = humanInsured;
	}

	public boolean isPickUpService() {
		return pickUpService;
	}

	public void setPickUpService(boolean pickUpService) {
		this.pickUpService = pickUpService;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

	public ArrayList<Car> getCars() {
		return cars;
	}



}
