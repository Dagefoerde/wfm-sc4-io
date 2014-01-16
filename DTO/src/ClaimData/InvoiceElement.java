package ClaimData;
/**
 * represents an invoice element
 * got description and an amount
 * @author ben
 *
 */
public class InvoiceElement {
	
	private static final long serialVersionUID = 1L;
	
	private String description;
	private int amount;
	
	public InvoiceElement(){
		
	}
	
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
