package entities.concretes;

import entities.abstracts.Entity;

public class Users implements Entity{
	private String name;
	private String surname;
	private String email;
	private String pw;
	private boolean emailValidation;
	public Users(String name, String surname, String email, String pw,Boolean emailValidation) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.pw = pw;
		this.emailValidation=emailValidation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Boolean getemailValidation() {
		return emailValidation;
	}
	public void setemailValidation(Boolean emailValidation) {
		this.emailValidation = emailValidation;
	}
	

}
