package ClaimData;

import java.io.Serializable;
import java.util.ArrayList;

public class DamageReport implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private ArrayList<Entry> damageList = new ArrayList<Entry>();
	private String contactPerson;
	private ServiceStation serviceStation;
	
	public DamageReport()
	{
	}
	
	public DamageReport(ArrayList<Entry> a, String b, ServiceStation c){
		this.damageList = a;
		this.contactPerson = b;
		this.serviceStation = c;
		
	}

	public ArrayList<Entry> getDamageList() {
		return damageList;
	}

	public void setDamageList(ArrayList<Entry> damageList) {
		this.damageList = damageList;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public ServiceStation getServiceStation() {
		return serviceStation;
	}

	public void setServiceStation(ServiceStation serviceStation) {
		this.serviceStation = serviceStation;
	}
	

}
