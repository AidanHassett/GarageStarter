package com.qa.vehicle;

public class Car extends Vehicle {
  private static final int SERVICE_COST = 1000;

  private int seats;
  private int doors;
  private double bootSize;

  public Car(int cost, double displacement, String fuelType, int power, int torque, int weight, int gears, boolean automatic, int seats, int doors, double bootSize) {
  	super(cost, displacement, fuelType, power, torque, weight, gears, automatic);
  	this.seats = seats;
  	this.doors = doors;
  	this.bootSize = bootSize;
  }

  public int getSeats() {
    return seats;
  }

  public int getDoors() {
    return doors;
  }

  public double getBootSize() {
    return bootSize;
  }

  public int getServiceCost() {
    int dist = odom - lastService;
    return (int) Math.pow(dist, 2) * SERVICE_COST;
  }

  public int service() {
    int cost = getServiceCost();
    lastService = odom;
    return cost;
  }

  public void drive(int dist) {
    drive(dist, 0);
  }

  public void drive(int dist, int load) {
    if (load > 1000) {
      System.out.println("You can't carry that much!");
    } else {
      odom += dist;
    }
  }
}
