package ClaimData;

public class Entry {
	
	private int iD;
	private String description;
	private int costEstimation;
	private String coverageDecision;
	
	public Entry(int a, String b, int c, String d){
		this.iD = a;
		this.description = b;
		this.costEstimation = c;
		this.coverageDecision = d;
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

	public String getCoverageDecision() {
		return coverageDecision;
	}

	public void setCoverageDecision(String coverageDecision) {
		this.coverageDecision = coverageDecision;
	}

}
