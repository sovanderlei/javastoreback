package com.api.javastoreback.example;

import java.util.Optional;

import com.api.javastoreback.dto.DtoDriver;
import com.api.javastoreback.dto.DtoSafe;
import com.api.javastoreback.dto.DtoTruck;

public class OptionalTest {

	public static void main(String[] args) {

		
		String s = "1";
		Integer number = convertInNumber(s)
				.orElseThrow(() -> new NullPointerException("value empty."));
		System.out.println(number);
		
		OptionalDrivers driver = new OptionalDrivers(); 
		Optional<DtoTruck> driverOpcional = driver.porName("João")
			      .flatMap(DtoDriver::getTruck);
		
		if(driverOpcional.isPresent()) {
			System.out.println(driverOpcional.get().getModel());
			System.out.println(driverOpcional.get().getSafe().get().getDeductibleAmount());
		}
		
		String cobertura = driver.porName("João")
			      .flatMap(DtoDriver::getTruck)
			      .flatMap(DtoTruck::getSafe)
			      .map(DtoSafe::getRoof)
			      .orElse("Sem seguro"); 
		System.out.println(cobertura);
		 
		driverOpcional.ifPresent(p -> { 
		  System.out.println(p.getModel());
		});
		
		
	}

	public static Optional<Integer> convertInNumber(String namberStr) {

		try {
			Integer integer = Integer.valueOf(namberStr);
			return Optional.of(integer);
		} catch (Exception e) {
			return Optional.empty();
		}

	}

}
