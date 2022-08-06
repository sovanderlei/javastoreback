package com.api.javastoreback.example;

public class Inheritance {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.main("");
		
		
	}

}

class Vehicle {
	protected String brand = "Ford"; // Vehicle attribute

	public void honk() { // Vehicle method
		System.out.println("Tuut, tuut!");
	}
}

class Car extends Vehicle {
	private String modelName = "Mustang"; // Car attribute

	public static void main(String string) {

		// Create a myCar object
		Car myCar = new Car();

		// Call the honk() method (from the Vehicle class) on the myCar object
		myCar.honk();

		// Display the value of the brand attribute (from the Vehicle class) and the
		// value of the modelName from the Car class
		System.out.println(myCar.brand + " " + myCar.modelName);
	}
}
