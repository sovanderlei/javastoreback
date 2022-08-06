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
@Table(name="tbseller")
public class Tbseller  implements Serializable { 
   
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
	@Column(name="image") 
	private String image;
	@Column(name="document") 
	private String document;
	@Column(name="email") 
	private String email;
	@Column(name="cell") 
	private String cell;
	@Column(name="barcode") 
	private String barcode;	
	@Column(name="qrcode") 
	private String qrcode;			
	@Column(name="goal") 
	private Double goal;	
	@Column(name="goalachieved") 
	private Double goalachieved;		
	@Column(name="goalvalue") 
	private Double goalvalue;		
	@Column(name="soldvalue") 
	private Double soldvalue;		
	@Column(name="createddate", nullable=false) 
	private Date createddate;
	@Column(name="updateddate", nullable=false)  
	private Date updateddate;
	@Column(name="active") 
	private String active;	
			
	
}
