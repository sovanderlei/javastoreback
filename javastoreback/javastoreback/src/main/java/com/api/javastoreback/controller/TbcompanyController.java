package com.api.javastoreback.controller;
 
/**Here I put the description of the class and control methods, variables tec...
* @author Vanderlei Oliveira
* @version 0.01
* @since Release 1 ad appliques
* date:02/07/2021  
*/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController; 
import com.api.javastoreback.modal.Tbcompany;
import com.api.javastoreback.modal.Tbuser;
import com.api.javastoreback.security.JwtRequest;
import com.api.javastoreback.security.JwtRespose;
import com.api.javastoreback.security.TokenAuthenticationService;
import com.api.javastoreback.service.TbcompanyService;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
  
/**
 * 
 * @author voliveira
 * @date 2021-07-02
 * @file TbcompanyController.java
 */
@RestController
public class TbcompanyController {

	@Autowired
	private TbcompanyService services;

	static final Logger loggers = LoggerFactory.getLogger(TbcompanyController.class);
 
	/***
	 * Description of the method to use in javadoc
	 * @author Vanderlei Soares de Oliveira
	 * @param model
	 * @return List of the ...
	 */
	@RequestMapping("/companysGetAll")
	@ResponseBody
	public ResponseEntity<List<Tbcompany>> companysGetAll(Model model) {

		//loggers.debug("getallusers: start get data");
		
		List<Tbcompany> ListReturn = new ArrayList<Tbcompany>();
		ListReturn = services.ListAll();
		return ResponseEntity.ok(ListReturn);
	}

	//{{URL_STORE}}/companyGetId/1
	@RequestMapping(value = "/companyGetId/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> companyGetId(@PathVariable int id) throws Exception { 
		Tbcompany data = new Tbcompany();
		try {
			
			 System.out.println("========================================= ");
			 System.out.println("buscando os dados companyGetId ");
			 System.out.println("========================================= ");
			 
			 
			if(id > 0) {
				Optional<Tbcompany> datatemp =  services.findById(id);
				if(!datatemp.isEmpty()) {
					data = datatemp.get();
				}
			} 
			
		} catch (Exception ex) {
			loggers.error("Error: " + ex.getMessage()); 
			JwtRespose jwtResponse = new JwtRespose().AddData(0,0,"","",HttpStatus.UNAUTHORIZED.value(),"",ex.getMessage(),"");
			return ResponseEntity.ok(jwtResponse); 
		}

		return ResponseEntity.ok(data);
	}
	
	@RequestMapping(value = "/companyCreate", method = RequestMethod.POST)
	public ResponseEntity<?> companyCreate(@RequestBody Tbcompany tbdata) throws Exception { 
		Tbcompany data = new Tbcompany();
		try {
			
			
			data.setId(tbdata.getId());
			data.setNamecompany(tbdata.getNamecompany()); 
			data.setDocument(tbdata.getDocument());
			data.setEmail(tbdata.getEmail()); 
			data.setImagelogo(tbdata.getImagelogo());
			data.setAddress(tbdata.getAddress()); 
			data.setNumber(tbdata.getNumber());
			data.setCity(tbdata.getCity());
			data.setComplement(tbdata.getComplement()); 
			data.setDistrict(tbdata.getDistrict());
			data.setRegion(tbdata.getRegion()); 
			data.setSite(tbdata.getSite());  
			data.setTelephone(tbdata.getTelephone()); 
			data.setActive(tbdata.getActive()); 
			data.setDtregister(tbdata.getDtregister());
			//data.setDtregister(new Date(System.currentTimeMillis()));
			services.save(data);
			 
		} catch (Exception ex) {
			loggers.error("Error: " + ex.getMessage()); 
			JwtRespose jwtResponse = new JwtRespose().AddData(0,0,"","",HttpStatus.UNAUTHORIZED.value(),"",ex.getMessage(),"");
			return ResponseEntity.ok(jwtResponse); 
		}

		return ResponseEntity.ok(data);
	}
	 
	@RequestMapping(value = "/companySave", method = RequestMethod.POST)
	public ResponseEntity<?> companySave(@RequestBody Tbcompany tbdata) throws Exception { 
		Tbcompany data = new Tbcompany();
		try {
			
			
			data.setId(tbdata.getId());
			data.setNamecompany(tbdata.getNamecompany()); 
			data.setDocument(tbdata.getDocument());
			data.setEmail(tbdata.getEmail()); 
			data.setImagelogo(tbdata.getImagelogo());
			data.setAddress(tbdata.getAddress()); 
			data.setNumber(tbdata.getNumber());
			data.setCity(tbdata.getCity());
			data.setComplement(tbdata.getComplement()); 
			data.setDistrict(tbdata.getDistrict());
			data.setRegion(tbdata.getRegion()); 
			data.setSite(tbdata.getSite());  
			data.setTelephone(tbdata.getTelephone()); 
			data.setActive(tbdata.getActive()); 
			data.setDtregister(tbdata.getDtregister()); 
			services.save(data);
			 
		} catch (Exception ex) {
			loggers.error("Error: " + ex.getMessage()); 
			JwtRespose jwtResponse = new JwtRespose().AddData(0,0,"","",HttpStatus.UNAUTHORIZED.value(),"",ex.getMessage(),"");
			return ResponseEntity.ok(jwtResponse); 
		}

		return ResponseEntity.ok(data);
	}
	 
	
	@RequestMapping("/companysGetJson")
	@ResponseBody
	public ResponseEntity<Tbcompany> companysGetJson() {
		Tbcompany objeto = new Tbcompany(); 
		return new ResponseEntity<Tbcompany>(objeto, HttpStatus.OK);
	}
	

	/*
	 
	  {
	    "id": 0,
	    "namecompany": "NEW COMPANY",
	    "document": "999990000",
	    "email": "sovanderlei@hotmail.com",
	    "imagelogo": "",
	    "address": "address",
	    "number": 55,
	    "city": "city",
	    "complement": "complement",
	    "district": "district",
	    "region": "region",
	    "site": "site",
	    "telephone": "000000000",
	    "dtregister":"2021-06-19",
	    "active": "YES"
		} 
	  
	  */
	
}

