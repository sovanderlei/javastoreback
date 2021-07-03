package com.api.javastoreback.controller;
 
/**Here I put the description of the class and control methods, variables tec...
* @author Vanderlei Oliveira
* @version 0.01
* @since Release 1 ad appliques
* @file TbuserController.java
* date:02/07/2021  
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController; 
import com.api.javastoreback.modal.Tbuser; 
import com.api.javastoreback.service.TbuserService; 
import java.util.ArrayList; 
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  

 
@RestController
public class TbuserController {

	@Autowired
	private TbuserService services;

	static final Logger loggers = LoggerFactory.getLogger(TbuserController.class);
 
	/***
	 * Description of the method to use in javadoc
	 * @author Vanderlei Soares de Oliveira
	 * @param model
	 * @return List of the ...
	 */
	@RequestMapping("/users")
	@ResponseBody
	public ResponseEntity<List<Tbuser>> getallusers(Model model) {

		loggers.debug("getallusers: start get data");
		
		List<Tbuser> ListReturn = new ArrayList<Tbuser>();
		ListReturn = services.ListAll();
		return ResponseEntity.ok(ListReturn);
	}

	
	
	
}
