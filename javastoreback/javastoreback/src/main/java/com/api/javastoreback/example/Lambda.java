package com.api.javastoreback.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 

import com.api.javastoreback.dto.DtoCustomer;
//import java.util.function.Consumer;
//import java.util.function.Predicate;

public class Lambda {
 
	public static void main(String[] args) {
		// useForEach();
		// threadlambeda();
		//onlyEvenNumbers();
		lambdaWorkClass();

	}

	public static void useForEach() {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		numbers.forEach((n) -> {
			System.out.println(n);
		});

	}

	public static void threadlambeda() {

		// before java 8
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World - Normal");
			}
		}).run();

		// after java 8
		new Thread(() -> System.out.println("Hello World - Lambda")).run();

	}

	public static void onlyEvenNumbers() {
		// somente numeros pares

		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		asList.stream()
			.filter(e -> e % 2 == 0)
			.forEach(e -> System.out.println(e));

		/*
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		asList.stream()
			.filter(new Predicate<Integer>(){
				@Override
				public boolean test(Integer e) {
					return e % 2 == 0;
				}
			})
			.forEach(new Consumer<Integer>() {
				@Override
				public void accept(Integer e) {
					System.out.println(e);
				}
			});
		*/
		
		
		
	}

	public static void lambdaWorkClass() {
		DtoCustomer c1 = new DtoCustomer(1,"vanderlei", 10.0); 
		DtoCustomer c2 = new DtoCustomer(2,"vanderlei 2", 20.0); 
		DtoCustomer c3 = new DtoCustomer(3,"vanderlei 3", 30.0); 
		
		List<DtoCustomer> listCostumers = Arrays.asList(c1,c2,c3);
		//Consumer<DtoCustomer> consumidor = (DtoCustomer c) -> {System.out.println(c.getName());};
		//listCostumers.forEach(consumidor);
		listCostumers.forEach(c -> {System.out.println(c.getName());});
		
	}
	
	
}
