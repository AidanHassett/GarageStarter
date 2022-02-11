package com.qa.garage;

import java.util.ArrayList;
import java.util.List;
import com.qa.vehicle.*;

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

	public Vehicle getVehicle(int i) {
		return garage.get(i);
	}
}
