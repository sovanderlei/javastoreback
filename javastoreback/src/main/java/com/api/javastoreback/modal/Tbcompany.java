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
@Table(name="tbcompany")
public class Tbcompany  implements Serializable { 
   
	private static final long serialVersionUID = 1L;
	
	@Id  
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy = "native")	
	@Column(name="id")  
	private int id; 
	@Column(name="namecompany") 
	private String namecompany;
	@Column(name="document") 
	private String document;
	@Column(name="email") 
	private String email;
	@Column(name="imagelogo") 
	private String imagelogo;
	@Column(name="address") 
	private String address;
	@Column(name="number")  
	private int number;
	@Column(name="city") 
	private String city;
	@Column(name="complement") 
	private String complement;
	@Column(name="district") 
	private String district;
	@Column(name="region") 
	private String region;
	@Column(name="site") 
	private String site;
	@Column(name="telephone") 
	private String telephone;
	@Column(name="dtregister", nullable=false)  
	private Date dtregister; 
	@Column(name="active") 
	private String active;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamecompany() {
		return namecompany;
	}
	public void setNamecompany(String namecompany) {
		this.namecompany = namecompany;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImagelogo() {
		return imagelogo;
	}
	public void setImagelogo(String imagelogo) {
		this.imagelogo = imagelogo;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	 
	
	

}
