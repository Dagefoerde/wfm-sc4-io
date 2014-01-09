package ContractData;

import java.io.Serializable;


public class InsuranceContract implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private byte[] contractCapitol;
	private byte[] contractBVIS;
	
	
	public InsuranceContract(){
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public byte[] getContractCapitol() {
		return contractCapitol;
	}

	public void setContractCapitol(byte[] contractCapitol) {
		this.contractCapitol = contractCapitol;
	}

	public byte[] getContractBVIS() {
		return contractBVIS;
	}

	public void setContractBVIS(byte[] contractBVIS) {
		this.contractBVIS = contractBVIS;
	}

}
