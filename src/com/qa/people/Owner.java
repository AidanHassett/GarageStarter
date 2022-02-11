package com.qa.people;

import com.qa.garage.*;
import com.qa.vehicle.Vehicle;

public class Owner {
  private Garage gar;
  private int wallet;

  public Owner() {
    gar = new Garage();
    wallet = 0;
  }

  public Owner(Garage initialGarage, int initWallet) {
    gar = initialGarage;
    this.wallet = initWallet;
  }

  public void drive(int vehicle, int dist) {
    gar.getVehicle(vehicle).drive(dist);
  }

  public void drive(int vehicle, int dist, int load) {
    gar.getVehicle(vehicle).drive(dist, load);
  }

  public void earnMoney(int pay) {
    wallet += pay;
  }

  public int getWallet() {
    return wallet;
  }
  
  public boolean buyVehicle(Vehicle v) {
  	if (wallet >= v.getCost()) {
  		wallet -= v.getCost();
  		gar.addVehicle(v);
  		return true;
  	} else {
  		System.out.println("I can't affort that");
  		return false;
  	}
  }

  public void serviceVehicle(Mechanic m, int vehicle) {
  	int cost = m.quote(gar.getVehicle(vehicle));
  	if (wallet >= cost) {
  		m.service(gar.getVehicle(vehicle));
  		wallet -= cost;
  	} else {
  		System.out.println("I can't afford this sevice");
  	}
  }
}
