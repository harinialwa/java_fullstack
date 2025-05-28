package com;

public class TestDriver {
	
	public static void main(String[] args) {
		Driver[] drivers = new Driver[4];
		drivers[0] = new Driver(101, "Sudhagar", "Car", 4200);
		drivers[1] = new Driver(102, "Rahul", "Auto", 3000);
		drivers[2] = new Driver(103, "Arun", "Lorry", 7000);
		drivers[3] = new Driver(104, "Meena", "Car", 1500);

		System.out.println("Is Car Driver: " + Travel.isCarDriver(drivers[0]));

		System.out.println(Travel.RetrivebyDriverId(drivers, 101));

		System.out.println("Count of Car drivers: " + Travel.RetriveCountOfDriver(drivers, "Car"));

		Driver[] carDrivers = Travel.retriveDriver(drivers, "Car");
		System.out.println("List of Car drivers:");
		for (Driver d : carDrivers) {
			System.out.println(d.getName());
		}

		Driver maxDriver = Travel.RetriveMaximumDistanceTravelledDriver(drivers);
		System.out.println(
				"Driver with max distance: " + maxDriver.getName() + ", Distance: " + maxDriver.getTotalDistance());
	}

}
