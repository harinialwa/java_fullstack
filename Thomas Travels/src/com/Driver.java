package com;

public class Driver {
	private int id;
	private String name;
	private String category;
	private double totalDistance;

	public Driver(int id, String name, String category, double totalDistance) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.totalDistance = totalDistance;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getTotalDistance() {
		return totalDistance;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}
}
