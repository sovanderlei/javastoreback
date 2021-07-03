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
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController; 
import com.api.javastoreback.modal.Tbcustomer; 
import com.api.javastoreback.service.TbcustomerService; 
import java.util.ArrayList; 
import java.util.List;
 
/**
 * 
 * @author voliveira
 * @date 2021-07-02
 * @file TbcustomerController.java
 */
@RestController
public class TbcustomerController {

	@Autowired
	private TbcustomerService services;

	static final Logger loggers = LoggerFactory.getLogger(TbcustomerController.class);

	/***
	 * Description of the method to use in javadoc
	 * @author Vanderlei Soares de Oliveira
	 * @param model
	 * @return List of the ...
	 */
	@RequestMapping("/customers")
	@ResponseBody
	public ResponseEntity<List<Tbcustomer>> getallcustomers(Model model) {

		loggers.debug("getallusers: start get data");
		
		List<Tbcustomer> ListReturn = new ArrayList<Tbcustomer>();
		ListReturn = services.ListAll();
		return ResponseEntity.ok(ListReturn);
	}

	
	
	
}

 