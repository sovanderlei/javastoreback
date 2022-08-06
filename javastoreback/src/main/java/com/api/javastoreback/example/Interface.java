package com.api.javastoreback.example;

public class Interface {

	public static void main(String[] args) { 
		MainInterface.main(args);
	}

}

//Interface
interface AnimalInterface {
public void animalSound(); // interface method (does not have a body)
public void sleep(); // interface method (does not have a body)
}

//Pig "implements" the Animal interface
class PigInterface implements AnimalInterface {
public void animalSound() {
 // The body of animalSound() is provided here
 System.out.println("The pig says: wee wee");
}
public void sleepInterface() {
 // The body of sleep() is provided here
 System.out.println("Zzz");
}
@Override
public void sleep() {
	// TODO Auto-generated method stub
	
}
}

class MainInterface {
public static void main(String[] args) {
 PigInterface myPig = new PigInterface();  // Create a Pig object
 myPig.animalSound();
 myPig.sleep();
}
}