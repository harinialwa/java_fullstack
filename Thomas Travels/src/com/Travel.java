package com;

public class Travel {
	public static boolean isCarDriver(Driver driver) {
		return "Car".equalsIgnoreCase(driver.getCategory());
	}

	public static String RetrivebyDriverId(Driver[] drivers, int driverId) {
		for (Driver d : drivers) {
			if (d != null && d.getId() == driverId) {
				return "Driver name is " + d.getName() + " belonging to the category " + d.getCategory() + " traveled "
						+ d.getTotalDistance() + " KM so far.";
			}
		}
		return "Driver not found";
	}

	public static int RetriveCountOfDriver(Driver[] drivers, String category) {
		int count = 0;
		for (Driver d : drivers) {
			if (d != null && category.equalsIgnoreCase(d.getCategory())) {
				count++;
			}
		}
		return count;
	}

	public static Driver[] retriveDriver(Driver[] drivers, String category) {
		int count = RetriveCountOfDriver(drivers, category);
		Driver[] result = new Driver[count];
		int index = 0;
		for (Driver d : drivers) {
			if (d != null && category.equalsIgnoreCase(d.getCategory())) {
				result[index++] = d;
			}
		}
		return result;
	}

	public static Driver RetriveMaximumDistanceTravelledDriver(Driver[] drivers) {
		if (drivers.length == 0)
			return null;

		Driver maxDriver = drivers[0];
		for (int i = 1; i < drivers.length; i++) {
			if (drivers[i] != null && drivers[i].getTotalDistance() > maxDriver.getTotalDistance()) {
				maxDriver = drivers[i];
			}
		}
		return maxDriver;
	}

}
