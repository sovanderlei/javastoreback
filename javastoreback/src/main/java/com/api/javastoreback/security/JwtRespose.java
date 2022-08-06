package com.api.javastoreback.security;

import java.io.Serializable;
 
  
public class JwtRespose  implements Serializable{
   
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private int idcompany;
	
	private String name;
  
	private String email;

	private int status;
 
	private String token;
	
	private String message;
	
	private String data;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public JwtRespose AddData(
			int id,
			int idcompany,
			String username,			 
			String email,
			int status,
			String token,
			String message,
			String data
			) {
		JwtRespose add = new JwtRespose();
		add.setId(id);
		add.setIdcompany(idcompany);
		add.setName(username);
		add.setEmail(email);
		add.setMessage(message);
		add.setStatus(status);
		add.setToken(token);
		add.setData(data);
		return add;
	}
	
	
	
}
