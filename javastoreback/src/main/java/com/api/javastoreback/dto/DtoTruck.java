package com.api.javastoreback.dto;

import java.util.Optional;

public class DtoTruck {

	private String model;
	private Optional<DtoSafe> safe;
	
	public DtoTruck(String model, Optional<DtoSafe>  safe) {
	    this.model = model;
	    this.safe = safe;
	  }
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Optional<DtoSafe> getSafe() {
		return this.safe;
	}
	public void setSafe(DtoSafe safe) {
		this.safe = Optional.ofNullable(safe);
	}
	
	
	
	
}
