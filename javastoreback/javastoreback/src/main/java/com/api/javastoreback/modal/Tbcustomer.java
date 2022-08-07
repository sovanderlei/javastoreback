package com.api.javastoreback.modal;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity 
@Table(name="tbcustomer")
public class Tbcustomer  implements Serializable { 
   
	private static final long serialVersionUID = 1L;
	
	@Id  
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy = "native")	
	@Column(name="id")  
	private int id;
	@Column(name="idcompany")  
	private int idcompany;	
	@Column(name="name") 
	private String name; 
	@Column(name="surname")  
	private String surname;
	@Column(name="birthday") 
	private String birthday;
	@Column(name="document") 
	private String document;
	@Column(name="city") 
	private String city;
	@Column(name="district") 
	private String district;
	@Column(name="address") 
	private String address;
	@Column(name="number")  
	private int number;	
	@Column(name="cell") 
	private String cell;
	@Column(name="complement") 
	private String complement;
	@Column(name="email") 
	private String email; 
	@Column(name="image") 
	private String image;	
	@Column(name="region")   
	private String region;	
	@Column(name="telephone")  
	private String telephone;	
	@Column(name="production")  
	private double production;  
	@Column(name="dtregister", nullable=false)  
	private Date dtregister; 
	@Column(name="status") 
	private String status;	
	@Column(name="active") 
	private String active;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdcompany() {
		return idcompany;
	}
	public void setIdcompany(int idcompany) {
		this.idcompany = idcompany;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public double getYield() {
		return production;
	}
	public void setYield(double yield) {
		this.production = yield;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public Date getDtregister() {
		return dtregister;
	}
	public void setDtregister(Date dtregister) {
		this.dtregister = dtregister;
	}
	
			 
			  
			  
	
}
