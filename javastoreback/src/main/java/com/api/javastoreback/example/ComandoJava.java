package com.api.javastoreback.example;

public class ComandoJava {

	public static void main(String[] args) {

		
		mathExemple(); 
		ifelseExemple();
		switchExemple();
		whileLoopExemple();
		forLoopExemple();
		
	}

	public static void mathExemple() {

		System.out.println(Math.max(5, 10));
		System.out.println(Math.min(5, 10));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.abs(-4.7));
		System.out.println(Math.random());
		int randomNum = (int) (Math.random() * 101); // 0 to 100
		System.out.println(randomNum);
		randomNum = (int) (Math.random() * 101); // 0 to 100
		System.out.println(randomNum);

	}
	
	public static void ifelseExemple() {
		
		if (20 > 18) {
			  System.out.println("20 is greater than 18");
			}
		
		//=============================================================
		
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
		//============================================================
		
		 time = 22;
		if (time < 10) {
		  System.out.println("Good morning.");
		} else if (time < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
		
		
		
		
	}
	
	public static void switchExemple() {
		
		int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		  default:
			    System.out.println("Looking forward to the Weekend");
		}
		
	}
	
	public static void whileLoopExemple() {
		
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}
		
		//==========================================
		
		i = 0;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i < 5);
		 
		
	}
	
	public static void forLoopExemple() {
		
		for (int i = 0; i < 5; i++) {
			  System.out.println(i);
			}
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}
		
		int i = 0;
		while (i < 10) {
		  System.out.println(i);
		  i++;
		  if (i == 4) {
		    break;
		  }
		}
		
		  i = 0;
		while (i < 10) {
		  if (i == 4) {
		    i++;
		    continue;
		  }
		  System.out.println(i);
		  i++;
		}
		 
		
	}
	
 public static void arraysExemple() {
	 
	 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	 //int[] myNum = {10, 20, 30, 40};
	 System.out.println(cars[0]);
	 System.out.println(cars.length);
	 for (int i = 0; i < cars.length; i++) {
		  System.out.println(cars[i]);
		}
	 
	 for (String i : cars) {
		  System.out.println(i);
		}
	 
	 
	 
	 int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < myNumbers.length; ++i) {
	      for(int j = 0; j < myNumbers[i].length; ++j) {
	        System.out.println(myNumbers[i][j]);
	      }
	    }
	    
	 
 }
	
	
	
	
	
	
	
	
	

}
