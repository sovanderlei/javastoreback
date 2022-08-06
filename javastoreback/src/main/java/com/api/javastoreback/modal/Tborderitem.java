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
@Table(name="tborderitem")
public class Tborderitem  implements Serializable { 
   
	private static final long serialVersionUID = 1L;
	
	@Id  
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy = "native")	
	@Column(name="id")  
	private int id;
	@Column(name="idcompany")  
	private int idcompany;	 
	@Column(name="idorder")  
	private int idorder;	 
	@Column(name="idproduct")  
	private int idproduct; 
	@Column(name="idcustomer")  
	private int idcustomer;
	@Column(name="unit") 
	private String unit;
	@Column(name="qty")  
	private double qty;  
	@Column(name="saleunit")  
	private double saleunit;  
	@Column(name="salevalue")  
	private double salevalue;  
	@Column(name="totsale")  
	private double totsale; 
	@Column(name="dtsale", nullable=false)  
	private Date dtsale;	 
	@Column(name="status") 
	private String status;
	
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
	public int getIdproduct() {
		return idproduct;
	}
	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}
	public int getIdcustomer() {
		return idcustomer;
	}
	public void setIdcustomer(int idcustomer) {
		this.idcustomer = idcustomer;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public double getSaleunit() {
		return saleunit;
	}
	public void setSaleunit(double saleunit) {
		this.saleunit = saleunit;
	}
	public double getSalevalue() {
		return salevalue;
	}
	public void setSalevalue(double salevalue) {
		this.salevalue = salevalue;
	}
	public double getTotsale() {
		return totsale;
	}
	public void setTotsale(double totsale) {
		this.totsale = totsale;
	}
	public Date getDtsale() {
		return dtsale;
	}
	public void setDtsale(Date dtsale) {
		this.dtsale = dtsale;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	} 
	
 
	
	
	
	
	
	
}
