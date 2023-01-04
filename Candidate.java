package com.springframework.dependencychecking.all.applicationcontext;

/* 3. All :
          If you want to make the primitive’s types as well as secondary types setter method compulsory then you should go for this type.
                        Program for dependency checking using all. */

public class Candidate {

	// Declare

	private String firstName;
	private Address address;

	// Use Getter & Setter

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// Use toString Method

	@Override
	public String toString() {
		return "Candidate [firstName=" + firstName + ", address=" + address + "]";
	}

	// Create Method
	public void getCandidate() {

		System.out.println("First Name > " + firstName);
		System.out.println("Address > " + address.getAddressLine());

	}

}
