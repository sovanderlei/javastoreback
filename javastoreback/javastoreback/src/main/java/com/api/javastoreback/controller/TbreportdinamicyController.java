package com.api.javastoreback.controller;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController; 
import com.api.javastoreback.modal.Tbreportdinamicy; 
import com.api.javastoreback.service.TbreportdinamicyService; 

/**Here I put the description of the class and control methods, variables tec...
* @author Vanderlei Oliveira
* @version 0.01
* @since Release 1 ad appliques
* @file TbreportdinamicyController.java
* date:02/07/2021  
*/

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TbreportdinamicyController {

	@Autowired
	private TbreportdinamicyService services;

	static final Logger loggers = LoggerFactory.getLogger(TbreportdinamicyController.class);
	
	/***
	 * Description of the method to use in javadoc
	 * 
	 * @author Vanderlei Soares de Oliveira
	 * @param model
	 * @return List of the ...
	 */
	@RequestMapping("/getallreportdinamicy")
	@ResponseBody
	public ResponseEntity<List<Tbreportdinamicy>> getallreportdinamicy(Model model) {

		loggers.debug("getallreportdinamicy: start get data");

		List<Tbreportdinamicy> ListReturn = new ArrayList<Tbreportdinamicy>();
		ListReturn = services.ListAll();
		return ResponseEntity.ok(ListReturn);
	}

	
	
	
	
	
}
