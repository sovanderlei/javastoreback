package com.api.javastoreback.dto;

import java.math.BigDecimal;

public class DtoSafe {

	private String roof;
	private BigDecimal deductibleAmount;
	
	public DtoSafe(String roof,BigDecimal deductibleAmount ) {
		this.roof = roof;
		this.deductibleAmount = deductibleAmount;
	}
	
	public String getRoof() {
		return roof;
	}
	public void setRoof(String roof) {
		this.roof = roof;
	}
	public BigDecimal getDeductibleAmount() {
		return deductibleAmount;
	}
	public void setDeductibleAmount(BigDecimal deductibleAmount) {
		this.deductibleAmount = deductibleAmount;
	}
	
	
	
}
