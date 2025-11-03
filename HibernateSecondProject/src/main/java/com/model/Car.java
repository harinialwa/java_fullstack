package com.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Car {
	
	@EmbeddedId
	private CarId CarId;
	
	private String companyName;
	
	private double price;
	
	public Car() {
		
	}

	public Car(com.model.CarId carId, String companyName, double price) {
		super();
		CarId = carId;
		this.companyName = companyName;
		this.price = price;
	}

	public CarId getCarId() {
		return CarId;
	}

	public void setCarId(CarId carId) {
		CarId = carId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [CarId=" + CarId + ", companyName=" + companyName + ", price=" + price + "]";
	}
	

}
