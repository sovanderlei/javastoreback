package com.api.javastoreback.controller;

/**Here I put the description of the class and control methods, variables tec...
* @author Vanderlei Oliveira
* @version 0.01
* @since Release 1 ad appliques
* date:02/07/2021  
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.api.javastoreback.modal.Tbseller;
import com.api.javastoreback.service.TbsellerService; 
import java.util.ArrayList; 
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  

/**
 * 
 * @author voliveira
 * @date 2021-07-02
 * @file TbsellerController.java
 */
@RestController
public class TbsellerController {

	@Autowired
	private TbsellerService services;

	static final Logger loggers = LoggerFactory.getLogger(TbsellerController.class);

	/***
	 * Description of the method to use in javadoc
	 * @author Vanderlei Soares de Oliveira
	 * @param model
	 * @return List of the ...
	 */
	@RequestMapping("/sellers")
	@ResponseBody
	public ResponseEntity<List<Tbseller>> getallseller(Model model) {

		loggers.debug("getallseller: start get data");
		
		List<Tbseller> ListReturn = new ArrayList<Tbseller>();
		ListReturn = services.ListAll();
		return ResponseEntity.ok(ListReturn);
	}

	
	
	
}
