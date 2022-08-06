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
@Table(name="tbuser")
public class Tbuser  implements Serializable { 
   
	private static final long serialVersionUID = 1L;
	
	@Id  
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy = "native")	
	@Column(name="id")  
	private int id;
	@Column(name="idcompany")  
	private int idcompany;	  
	@Column(name="username") 
	private String username;
	@Column(name="name") 
	private String name;
	@Column(name="email") 
	private String email; 
	@Column(name="password") 
	private String password;
	@Column(name="status") 
	private String status;
	@Column(name="Image") 
	private String Image;
	@Column(name="token") 
	private String token; 
	@Column(name="dtregister", nullable=false)  
	private Date dtregister;	
	@Column(name="dtlogin", nullable=false)  
	private Date dtlogin;	
	@Column(name="ativo") 
	private String ativo;
	
	
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Date getDtregister() {
		return dtregister;
	}
	public void setDtregister(Date dtregister) {
		this.dtregister = dtregister;
	}
	public Date getDtlogin() {
		return dtlogin;
	}
	public void setDtlogin(Date dtlogin) {
		this.dtlogin = dtlogin;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	 

}
