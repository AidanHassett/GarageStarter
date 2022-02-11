package com.qa.vehicle;

public class Truck extends Vehicle {
  private static final int SERVICE_COST_WEIGHTED = 200;

  private int loadCapacity;
  private double height;
  private boolean sleeper;
  private int odomWeighted;
  private int lastServiceWeighted;

  public Truck(int cost, double displacement, String fuelType, int power, int torque, int weight, int gears, boolean automatic, int loadCapacity, double height, boolean sleeper) {
  	super(cost, displacement, fuelType, power, torque, weight, gears, automatic);
  	this.loadCapacity = loadCapacity;
  	this.height = height;
  	this.sleeper = sleeper;
  }

  public int getLoadCapacity() {
    return loadCapacity;
  }

  public double getHeight() {
    return height;
  }

  public boolean isSleeper() {
    return sleeper;
  }

  public void drive(int dist) {
    drive(dist, 0);
  }

  public void drive(int dist, int load) {
    odom += dist;
    if (load <= loadCapacity) {
      odomWeighted += dist * (weight + load);
    } else {
      odomWeighted += (int) Math.ceil(dist * (weight + load) * Math.pow((load / loadCapacity), 2));
      System.out.println("Warning: Over Load Capacity!");
    }
  }

  public int getServiceCost() {
    int distWeighted = odomWeighted - lastServiceWeighted;
    return SERVICE_COST_WEIGHTED * distWeighted;
  }

  public int service() {
    int cost = getServiceCost();
    lastServiceWeighted = odomWeighted;
    lastService = odom;
    return cost;
  }
}
