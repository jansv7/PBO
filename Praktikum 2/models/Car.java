package models;

import interfaces.CarInterface;

public class Car implements CarInterface {
	private String color;
	private String noPlate;
	private double widht;
	private double height;
	private String brand;

public Car() {
	this.color = "Blue";
	this.noPlate = "J 2408 NS";
	this.widht = 1.9;
	this.height = 1.4;
	this.brand = "Daihatsu";
}

public Car(String color, String noPlate, double widht, double height, String brand) {
	this.color = color;
	this.noPlate = noPlate;
	this.widht = widht;
	this.height = height;
	this.brand = brand;
}

public String getColor() { return color; }
public String getNoPlate() { return noPlate; }
public double getWidht() { return widht; }
public double getHeight() { return height; }
public String getBrand() { return brand; }

public void startEngine() {
	System.out.println("Engine started... Broomm!");
}
public void throttle() {
	System.out.println("Car is accelerating...");
}
public void brake() {
	System.out.println("Car is breaking...");
}
public void turnOnHeadLamp() {
	System.out.println("Head Lamp is On");
}
public void turnOffHeadLamp() {
	System.out.println("Head Lamp is Off");
}

}