package com.qa.garage;

import java.util.ArrayList;
import java.util.List;
import com.qa.vehicle.*;

import com.qa.vehicle.Vehicle;

public class Garage {

	private List<Vehicle> garage;

	public Garage() {
		garage = new ArrayList<>();
	}

	public void addVehicle(Vehicle v) {
		garage.add(v);
	}

	public Vehicle removeVehicle(int i) throws IndexOutOfBoundsException {
		return garage.remove(i);
	}

	public void driveVehicle(int i, int dist) {
		garage.get(i).drive(dist);
	}

	public void driveVehicle(int i, int dist, int load) {
		if (garage.get(i).getClass().getCanonicalName().equals("com.qa.vehicle.Truck")) {
			Truck tr = (Truck) garage.get(i);
			tr.drive(dist, load);
		} else {
			garage.get(i).drive(dist);
		}
	}
}
