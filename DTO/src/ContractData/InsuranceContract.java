package ContractData;

import java.io.Serializable;


public class InsuranceContract implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private byte[] pdf;
	
	public InsuranceContract(byte[] a){
		this.pdf = a;
	}

}
