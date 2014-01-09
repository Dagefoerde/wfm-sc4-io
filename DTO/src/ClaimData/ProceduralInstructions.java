package ClaimData;

import java.io.Serializable;

public class ProceduralInstructions implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String description;
	private ServiceStation serviceStation;
	
	public ProceduralInstructions(String a, ServiceStation b){
		this.description = a;
		this.serviceStation = b;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ServiceStation getServiceStation() {
		return serviceStation;
	}

	public void setServiceStation(ServiceStation serviceStation) {
		this.serviceStation = serviceStation;
	}
	
}
