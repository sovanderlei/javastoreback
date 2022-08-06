package com.api.javastoreback.example;

public class MethodOverload {

	// sobrecarga de método
	
	public int calculator(int a, int b) {
		return a + b;
	}

	public double calculator(double a, double b) {
		return a + b;
	}

	public String calculator(String a, String b) {
		return a + b;
	}

	public static void main(String args[]) {
		MethodOverload calc = new MethodOverload();
		System.out.println(calc.calculator(1, 1));
		System.out.println(calc.calculator(2.0, 6.1));
		System.out.println(calc.calculator("vi", "ram?"));
	}

}
