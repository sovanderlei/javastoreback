package com.api.javastoreback.example;

public class InnerExemple {
	public static void main(String[] args) {
		
	 OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.y + myOuter.x); 
	    OuterClass myOuter2 = new OuterClass();
	    OuterClass.InnerClass myInner2 = myOuter2.new InnerClass();
	    System.out.println(myInner2.y + myOuter.x);
	    
	}
	
}

class OuterClass {
	  int x = 10;

	  class InnerClass {
	    int y = 5;
	  }
	}

