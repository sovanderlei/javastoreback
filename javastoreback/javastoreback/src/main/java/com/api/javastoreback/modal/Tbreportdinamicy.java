package com.api.javastoreback.modal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity 
@Table(name="Tbreportdinamicy")
public class Tbreportdinamicy  implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	
	@Id  
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy = "native")	
	@Column(name="id")  
	private int id;
	@Column(name="idcompany")  
	private int idcompany;
	@Column(name="label") 
	private String label;
	@Column(name="fild") 
	private String fild;
	@Column(name="valueDefalt") 
	private String valueDefalt;
	@Column(name="typeFild") 
	private String typeFild;
	@Column(name="nameReport") 
	private String nameReport;
	@Column(name="ativo")  
	private int ativo;
	@Column(name="pseudonym") 
	private String pseudonym;
	

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
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getFild() {
		return fild;
	}
	public void setFild(String fild) {
		this.fild = fild;
	}
	public String getValueDefalt() {
		return valueDefalt;
	}
	public void setValueDefalt(String valueDefalt) {
		this.valueDefalt = valueDefalt;
	}
	public String getTypeFild() {
		return typeFild;
	}
	public void setTypeFild(String typeFild) {
		this.typeFild = typeFild;
	}
	public String getNameReport() {
		return nameReport;
	}
	public void setNameReport(String nameReport) {
		this.nameReport = nameReport;
	}
	public int getAtivo() {
		return ativo;
	}
	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}
	 
	public String getPseudonym() {
		return pseudonym;
	}
	public void setPseudonym(String pseudonym) {
		this.pseudonym = pseudonym;
	}
	
	
	

}
