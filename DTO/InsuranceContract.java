package DTO;

import java.io.Serializable;


public class InsuranceContract implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private byte[] contract;
	
	public InsuranceContract(byte[] a){
		this.contract = a;
	}

	public byte[] getContract() {
		return contract;
	}

	public void setContract(byte[] pdf) {
		this.contract = pdf;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

}
