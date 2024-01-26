package fr.fms.entities;

public class Customer extends Person {

	private String contactNumber;

	public Customer(String name, String firstName, String address, String contactNumber) {
		super(name, firstName, address);
		this.contactNumber = contactNumber;
	}
	
	public Customer() {
		super("unknown", "unknown", "unknown");
		this.contactNumber = "unknown";
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Customer [contactNumber=" + contactNumber + ", toString()=" + super.toString() + "]";
	}
}
