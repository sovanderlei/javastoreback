package com.api.javastoreback.example;

//substituição de método

class PetAnimal {
	public void move() {
		System.out.println("class from PetAnimal - move");
	}
}

class PetDog extends PetAnimal {
	@Override
	public void move() {
		System.out.println("class from PetDog heritage from PetAnimal ");
	}
}

public class MethodOverride {
	public static void main(String args[]) {
		PetAnimal a = new PetAnimal(); // PetAnimal reference and object
		PetAnimal b = new PetDog(); // PetAnimal reference but PetDog object

		a.move(); // runs the method in PetAnimal class
		b.move(); // runs the method in PetDog class
	}
}
