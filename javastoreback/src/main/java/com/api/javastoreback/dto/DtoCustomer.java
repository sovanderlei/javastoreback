package com.api.javastoreback.dto;
 
public class DtoCustomer {
	
	public DtoCustomer(	Integer Id,	String Name,  Double Value) {
		this.setId(Id);
		this.setName(Name); 
		this.setValue(Value);
	}
	
	private Integer Id;
	private String Name; 
	private Double Value;
	
	// abaixo vem todos os métodos construtores get e set...
	// Encapsulamento
	// encapsulation
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	} 
	public Double getValue() {
		return Value;
	}
	public void setValue(Double value) {
		Value = value;
	}
	
	

}
