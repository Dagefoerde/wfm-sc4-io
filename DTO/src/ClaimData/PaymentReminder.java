package ClaimData;

import java.sql.Date;

public class PaymentReminder {

	private Date date;
	private String pointOfContact;
	private int dueSum;
	private int invoiceNumber;
	private String invoiceText;
	private Date paymentTerm;
	private int bankAccount;
	private int bankCode;
	private String bankName;
	private String accHolder;
	
	public PaymentReminder(Date a, String b, int c, int d, String e, Date f, int g, int h, String i, String j) {
		this.date = a;
		this.pointOfContact = b;
		this.dueSum = c;
		this.invoiceNumber = d;
		this.invoiceText = e;
		this.paymentTerm = f;
		this.bankAccount = g;
		this.bankCode = h;
		this.bankName = i;
		this.accHolder = j;
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

	public int getDueSum() {
		return dueSum;
	}

	public void setDueSum(int dueSum) {
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

	public int getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}

	public int getBankCode() {
		return bankCode;
	}

	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	
}
