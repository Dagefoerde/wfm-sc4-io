package ClaimData;

import java.io.Serializable;
import java.util.Date;

import ContractData.Car;
import CustomerData.Customer;
import General.Address;

public class ClaimReport implements Serializable {

	private static final long serialVersionUID = 1L;
	private Address crashAddress;
	private Date date;
	private Customer customer;
	private Car car;
	private String cause;
	private String description;
	private boolean isMaintenace;
	private boolean needsTow;
	
	public ClaimReport() {}
	
	public ClaimReport(Address crashAddress, Date date, Customer customer, Car car, String cause, String description, boolean isMaintenace, boolean needsTow){
		this.crashAddress = crashAddress;
		this.date = date;
		this.customer = customer;
		this.car = car;
		this.cause = cause;
		this.description = description;
		this.isMaintenace = isMaintenace;
		this.needsTow = needsTow;
	}

	public Address getCrashAddress() {
		return crashAddress;
	}

	public void setCrashAddress(Address crashAddress) {
		this.crashAddress = crashAddress;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isMaintenace() {
		return isMaintenace;
	}

	public void setMaintenace(boolean isMaintenace) {
		this.isMaintenace = isMaintenace;
	}

	public boolean isNeedsTow() {
		return needsTow;
	}

	public void setNeedsTow(boolean needsTow) {
		this.needsTow = needsTow;
	}
	
	
	
}
