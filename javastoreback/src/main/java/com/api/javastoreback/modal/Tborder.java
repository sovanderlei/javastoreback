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
@Table(name="tborder")
public class Tborder  implements Serializable { 
   
	private static final long serialVersionUID = 1L;
	
	@Id  
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy = "native")	
	@Column(name="id")  
	private int id;
	@Column(name="idcompany")  
	private int idcompany; 
	@Column(name="idcustomer")  
	private int idcustomer; 
	@Column(name="barcode") 
	private String barcode;
	@Column(name="qrcode") 
	private String qrcode;	
	@Column(name="codcupom") 
	private String codcupom; 
	@Column(name="qty")  
	private double qty;   
	@Column(name="salevalue")  
	private double salevalue;  
	@Column(name="totsale")  
	private double totsale; 
	@Column(name="dtsale", nullable=false)  
	private Date dtsale;	
	@Column(name="dtregister", nullable=false)  
	private Date dtregister; 
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
	public int getIdcustomer() {
		return idcustomer;
	}
	public void setIdcustomer(int idcustomer) {
		this.idcustomer = idcustomer;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getQrcode() {
		return qrcode;
	}
	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}
	public String getCodcupom() {
		return codcupom;
	}
	public void setCodcupom(String codcupom) {
		this.codcupom = codcupom;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
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
	public Date getDtregister() {
		return dtregister;
	}
	public void setDtregister(Date dtregister) {
		this.dtregister = dtregister;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	} 
	

	
	
	
	
}
