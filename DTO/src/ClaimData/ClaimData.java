package ClaimData;

import java.io.Serializable;

public class ClaimData implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private ClaimReport claimReport;
	private ProceduralInstructions instructions;
	private DamageReport damageReport;
	private String statusReport;
	private Invoice invoice;
	private PaymentReminder paymentReminder;
	
	public ClaimData() {}
	
	public ClaimData(int a, ClaimReport b, ProceduralInstructions c, DamageReport d, String e, Invoice f, PaymentReminder g){
		this.setId(a);
		this.claimReport = b;
		this.instructions = c;
		this.damageReport = d;
		this.statusReport = e;
		this.invoice = f;
		this.paymentReminder = g;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public ClaimReport getClaimReport() {
		return claimReport;
	}

	public void setClaimReport(ClaimReport claimReport) {
		this.claimReport = claimReport;
	}

	public ProceduralInstructions getInstructions() {
		return instructions;
	}

	public void setInstructions(ProceduralInstructions instructions) {
		this.instructions = instructions;
	}

	public DamageReport getDamageReport() {
		return damageReport;
	}

	public void setDamageReport(DamageReport damageReport) {
		this.damageReport = damageReport;
	}

	public String getStatusReport() {
		return statusReport;
	}

	public void setStatusReport(String statusReport) {
		this.statusReport = statusReport;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public PaymentReminder getPaymentReminder() {
		return paymentReminder;
	}

	public void setPaymentReminder(PaymentReminder paymentReminder) {
		this.paymentReminder = paymentReminder;
	}

	

}
