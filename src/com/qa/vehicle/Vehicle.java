package com.qa.vehicle;

public abstract class Vehicle {
	protected int cost;
  protected int odom;
  protected int lastService;
  protected double displacement;
  protected String fuelType;
  protected int power;
  protected int torque;
  protected int weight;
  protected int gears;
  protected boolean automatic;

  public Vehicle(int cost, double displacement, String fuelType, int power, int torque, int weight, int gears, boolean automatic) {
    this.displacement = displacement;
    this.fuelType = fuelType;
    this.power = power;
    this.torque = torque;
    this.power = power;
    this.torque = torque;
    this.weight = weight;
    this.gears = gears;
    this.automatic = automatic;
    this.odom = 0;
    this.lastService = 0;
  }
  
  public int getCost() {
  	return cost;
  }

  public double getDisplacement() {
  	return displacement;
  }

  public String getFuelType() {
  	return fuelType;
  }

  public int getPower() {
  	return power;
  }

  public int getTorque() {
  	return torque;
  }

  public int getWeight() {
  	return weight;
  }

  public int getGears() {
  	return gears;
  }

  public boolean isAutomatic() {
  	return automatic;
  }
  
  

  public abstract int getServiceCost();

  public abstract int service();

  public void drive(int distance) {
  	drive(distance, 0);
  }

  public abstract void drive(int distance, int load);
}
