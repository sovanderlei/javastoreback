package com.api.javastoreback.example;

import com.api.javastoreback.dto.DtoAnimal;
import com.api.javastoreback.dto.DtoDog;
import com.api.javastoreback.dto.DtoTiger;

public class Polymorphism {
	
	  public void makeAnimalEat( DtoAnimal animal ) {
	       animal.eat();
	  }

	  public static void main( String[] args ) {
		  Polymorphism t = new Polymorphism();
	        t.makeAnimalEat( new DtoAnimal() );
	        t.makeAnimalEat( new DtoDog() );
	        t.makeAnimalEat( new DtoTiger() );
	   }
}
