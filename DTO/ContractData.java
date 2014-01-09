package DTO;

import java.io.Serializable;

public class ContractData implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int contractId;
	private Requirements requirements;
	private InsuranceContract insuranceContract;
	private InsuranceContractStructured insuranceContractStructured;
	
	public ContractData(){
		
	}
	
	public ContractData(int a, Requirements b, InsuranceContract c, InsuranceContractStructured d){
		this.contractId = a;
		this.requirements = b;
		this.insuranceContract = c;
		this.insuranceContractStructured = d;
	}

	public int getContractId() {
		return contractId;
	}

	public void setContractId(int contractId) {
		this.contractId = contractId;
	}

	public Requirements getRequirements() {
		return requirements;
	}

	public void setRequirements(Requirements requirements) {
		this.requirements = requirements;
	}

	public InsuranceContract getInsuranceContract() {
		return insuranceContract;
	}

	public void setInsuranceContract(InsuranceContract insuranceContract) {
		this.insuranceContract = insuranceContract;
	}

	public InsuranceContractStructured getInsuranceContractStructured() {
		return insuranceContractStructured;
	}

	public void setInsuranceContractStructured(
			InsuranceContractStructured insuranceContractStructured) {
		this.insuranceContractStructured = insuranceContractStructured;
	}

}
