package com.api.javastoreback.dto;

import java.util.Optional;

public class DtoDriver {

	private String name;
	private Integer age;
	private Optional<DtoTruck> truck;

	public DtoDriver(String name, Integer age, Optional<DtoTruck> truck) {
		this.name = name;
		this.age = age;
		this.truck = truck;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Optional<DtoTruck> getTruck() {
		return truck;
	}

	public void setTruck(DtoTruck truck) {
		this.truck = Optional.ofNullable(truck);
	}

}
