package com.qa.people;

import com.qa.vehicle.*;

public class Mechanic {
	private double markup;
	
	public Mechanic() {
		markup = Math.random() + 1;
	}
	
  public void service(Vehicle v) {
    v.service();
  }
  
  public int quote(Vehicle v) {
  	return (int) Math.ceil(v.getServiceCost() * markup);
  }
}
