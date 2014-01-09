package ClaimData;

import java.io.Serializable;

public class Entry implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int iD;
	private String description;
	private int costEstimation;
	private Boolean coverageDecision;
	
	public Entry(int a, String b, int c, Boolean d){
		this.iD = a;
		this.description = b;
		this.costEstimation = c;
		this.coverageDecision = d;
	}
	
	public Entry(int a, String b, int c){
		this(a, b, c, null);
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCostEstimation() {
		return costEstimation;
	}

	public void setCostEstimation(int costEstimation) {
		this.costEstimation = costEstimation;
	}

	public Boolean getCoverageDecision() {
		return coverageDecision;
	}

	public void setCoverageDecision(Boolean coverageDecision) {
		this.coverageDecision = coverageDecision;
	}

}
