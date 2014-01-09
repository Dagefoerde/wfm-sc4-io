package ClaimData;

import java.io.Serializable;

public class Invoice implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private byte[] invoice;
	
	public Invoice(byte[] a){
		this.invoice = a;
	}

	public byte[] getInvoice() {
		return invoice;
	}

	public void setInvoice(byte[] invoice) {
		this.invoice = invoice;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

}
