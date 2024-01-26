package fr.fms.entities;

public class Person {

	private String name;
	private String firstName;
	private String address;
	
	public Person(String name, String firstName, String address) {
		this.name = name;
		this.firstName = firstName;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", firstName=" + firstName + ", address=" + address + "]";
	}
}
