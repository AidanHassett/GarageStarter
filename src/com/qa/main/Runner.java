package com.qa.main;

import com.qa.people.*;
import com.qa.vehicle.*;

public class Runner {
  public static void main(String[] args) {
  	Owner bill = new Owner();
  	bill.earnMoney(1000000);
  	Vehicle superCar = new Car(850000, 5.2, "petrol", 720, 550, 1350, 7, false, 2, 2, 50);
  	bill.buyVehicle(superCar);
  	bill.drive(0, 500);
  	Mechanic steve = new Mechanic();
  	bill.serviceVehicle(steve, 0);
  }
}
