package com.qa.vehicle;

public class Motorcycle extends Vehicle {
  private static final int SERVICE_COST_2STROKE = 20;
  private static final int SERVICE_COST_4STROKE = 500;

  private String riderPosture;
  private int stroke;

  public Motorcycle(double displacement, String fuelType, int power, int torque, int weight, int gears,
	  boolean automatic, String riderPosture, int stroke) {
  	super(displacement, fuelType, power, torque, weight, gears, automatic);
  	this.riderPosture = riderPosture;
    if (stroke == 2) {
      this.stroke = 2;
    } else {
      this.stroke = 4;
    }
  }

  public String getRiderPosture() {
    return riderPosture;
  }

  public int getServiceCost() {
    int dist = odom - lastService;
    if (stroke == 2) {
      return (int) Math.pow(dist, 2) * SERVICE_COST_2STROKE;
    } else {
      return dist * SERVICE_COST_4STROKE;
    }
  }

  public int service() {
    int cost = getServiceCost();
    lastService = odom;
    return cost;
  }
}
