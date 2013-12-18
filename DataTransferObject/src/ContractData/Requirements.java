package ContractData;
import java.util.ArrayList;

public class Requirements {
	
	private String status;
	private boolean naturalInsured;
	private boolean humanInsured;
	private boolean pickUpService;
	private ArrayList<Car> Cars = new ArrayList<Car>();
	
	public Requirements(String a, boolean b, boolean c, boolean d, ArrayList<Car> e){
		this.status = a;
		this.naturalInsured = b;
		this.humanInsured = c;
		this.pickUpService = d;
		this.Cars = e;
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isNaturalInsured() {
		return naturalInsured;
	}

	public void setNaturalInsured(boolean naturalInsured) {
		this.naturalInsured = naturalInsured;
	}

	public boolean isHumanInsured() {
		return humanInsured;
	}

	public void setHumanInsured(boolean humanInsured) {
		this.humanInsured = humanInsured;
	}

	public boolean isPickUpService() {
		return pickUpService;
	}

	public void setPickUpService(boolean pickUpService) {
		this.pickUpService = pickUpService;
	}

	public ArrayList<Car> getCars() {
		return Cars;
	}

	public void setCars(ArrayList<Car> cars) {
		Cars = cars;
	}

}
