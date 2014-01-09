package ClaimData;

import java.io.Serializable;

public class Invoice implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private byte[] pdf;
	
	public Invoice(byte[] a){
		this.pdf = a;
	}

}
