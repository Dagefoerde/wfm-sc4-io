package ContractData;
import java.io.Serializable;
import java.sql.Date;


public class InsuranceContractStructured implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String description;
	private Date startdate;
	private Date enddate;
	
	public InsuranceContractStructured()
	{
	}
	
	public InsuranceContractStructured(String a, Date b, Date c){
		this.description = a;
		this.startdate = b;
		this.enddate = c;
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

}
