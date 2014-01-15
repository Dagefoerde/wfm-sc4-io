package ClaimData;

import java.io.Serializable;
import java.util.Date;

public class Invoice implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private byte[] invoice;
	
	private Date date;
	private String pointOfContact;
	private double dueSum;
	private int invoiceNumber;
	private String invoiceText;
	private Date paymentTerm;
	private String bankAccount;
	private String bankName;
	private String bankCode;
	private String bankAccountHolder;
	
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPointOfContact() {
		return pointOfContact;
	}

	public void setPointOfContact(String pointOfContact) {
		this.pointOfContact = pointOfContact;
	}

	public double getDueSum() {
		return dueSum;
	}

	public void setDueSum(double dueSum) {
		this.dueSum = dueSum;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getInvoiceText() {
		return invoiceText;
	}

	public void setInvoiceText(String invoiceText) {
		this.invoiceText = invoiceText;
	}

	public Date getPaymentTerm() {
		return paymentTerm;
	}

	public void setPaymentTerm(Date paymentTerm) {
		this.paymentTerm = paymentTerm;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankAccountHolder() {
		return bankAccountHolder;
	}

	public void setBankAccountHolder(String bankAccountHolder) {
		this.bankAccountHolder = bankAccountHolder;
	}

}
