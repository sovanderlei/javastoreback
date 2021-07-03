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
@Table(name="tbproduct")
public class Tbproduct  implements Serializable { 
   
	private static final long serialVersionUID = 1L;
	 
	@Id  
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy = "native")	
	@Column(name="id")  
	private int id;
	@Column(name="idcompany")  
	private int idcompany;	
	@Column(name="idgroups") 
	private int idgroups; 
	@Column(name="name") 
	private String name;
	@Column(name="shortdescription") 
	private String shortdescription;
	@Column(name="fulldescription") 
	private String fulldescription; 
	@Column(name="image") 
	private String image;
	@Column(name="barcode") 
	private String barcode;
	@Column(name="brand") 
	private String brand;
	@Column(name="discount")  
	private double discount;   
	@Column(name="productclassif") 
	private String productclassif;
	@Column(name="producttype") 
	private String producttype;
	@Column(name="purchaseprice")  
	private double purchaseprice;
	@Column(name="qty")  
	private int qty;
	@Column(name="qtymaximun")  
	private int qtymaximun;
	@Column(name="qtyminum")  
	private int qtyminum;
	@Column(name="saleunit")  
	private double sale_unit; 
	@Column(name="salevalue")  
	private double salevalue; 
	@Column(name="taxes")  
	private double taxes; 
	@Column(name="unit") 
	private String unit;	
	@Column(name="weightss")  
	private double weightss; 
	@Column(name="dtregister", nullable=false)  
	private Date dtregister; 
	@Column(name="status") 
	private String status;
	@Column(name="active") 
	private String active;
	
	


	
	
	
}
