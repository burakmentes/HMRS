package Entities;

import Abtracts.Entity;

public class Customer implements Entity{
	private String NationalId;
	private String FirstName;
	private String LastName;
	private String BirthOfDate;
	public Customer(String nationalId, String firstName, String lastName, String birthOfDate) {
		super();
		NationalId = nationalId;
		FirstName = firstName;
		LastName = lastName;
		BirthOfDate = birthOfDate;
	}
	public String getNationalId() {
		return NationalId;
	}
	public void setNationalId(String nationalId) {
		NationalId = nationalId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getBirthOfDate() {
		return BirthOfDate;
	}
	public void setBirthOfDate(String birthOfDate) {
		BirthOfDate = birthOfDate;
	}
	  

}
