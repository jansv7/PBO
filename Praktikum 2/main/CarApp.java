package main;

import models.Car;

public class CarApp {
	public static void main(String[] args) {
		Car car1 = new Car();
		
	System.out.println("Car Brand: " + car1.getBrand());
	System.out.println("Car Color: " + car1.getColor());
	System.out.println("Car NoPlate: " + car1.getNoPlate());
	System.out.println("Car Dimension: " + car1.getWidht() + "m x " + car1.getHeight() + "m");
	
	car1.startEngine();
	car1.throttle();
	car1.brake();
	car1.turnOnHeadLamp();
	car1.turnOffHeadLamp();
	}
}