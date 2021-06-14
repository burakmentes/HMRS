package Entities;

import Abstracts.Entity;

public class Games implements Entity{
	private String Name;
	private double Price;
	
	public Games(String name, double price) {
		super();
		Name = name;
		Price = price;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}

}
