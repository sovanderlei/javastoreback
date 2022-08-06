package com.api.javastoreback.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.api.javastoreback.dto.DtoDriver;
import com.api.javastoreback.dto.DtoSafe;
import com.api.javastoreback.dto.DtoTruck;

public class OptionalDrivers {

	private Map<String, Optional<DtoDriver>> drivers = new HashMap<String, Optional<DtoDriver>>();

	public OptionalDrivers() {
		DtoSafe seguro = new DtoSafe("Parcial - não cobre roubo", new BigDecimal("5000"));
		DtoTruck driver = new DtoTruck("Mercedes Atron", Optional.ofNullable(seguro));
		Optional<DtoDriver> driverJoao = Optional.of(new DtoDriver("João", 40, Optional.ofNullable(driver)));
		Optional<DtoDriver> driverJose = Optional.of(new DtoDriver("José", 25, Optional.ofNullable(null)));

		drivers.put("João", driverJoao);
		drivers.put("José", driverJose);
	}

	public Optional<DtoDriver> porName(String name) {
		return drivers.get(name);
	}

}
