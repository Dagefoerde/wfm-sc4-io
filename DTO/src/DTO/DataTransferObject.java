package DTO;
import java.io.Serializable;

import ClaimData.ClaimData;
import ContractData.ContractData;
import CustomerData.Customer;

public class DataTransferObject implements Serializable {

	private static final long serialVersionUID = 42L;

	private String communicationReason;
	private Customer customer;
	private ContractData contractData;
	private ClaimData claimData;
	
	public DataTransferObject(String a, Customer b, ContractData c, ClaimData d){
		this.communicationReason = a;
		this.customer = b;
		this.contractData = c;
		this.claimData = d;
	}

	public String getCommunicationReason() {
		return communicationReason;
	}

	public void setCommunicationReason(String communicationReason) {
		this.communicationReason = communicationReason;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ContractData getContractData() {
		return contractData;
	}

	public void setContractData(ContractData contractData) {
		this.contractData = contractData;
	}

	public ClaimData getClaimData() {
		return claimData;
	}

	public void setClaimData(ClaimData claimData) {
		this.claimData = claimData;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
