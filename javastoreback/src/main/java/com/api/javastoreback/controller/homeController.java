package com.api.javastoreback.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

@RestController
public class homeController {


	/// http://localhost:8089/hometeste
	
	@GetMapping("hometeste")
	public String hometeste(Model model ) {
	  
		 //System.out.println("Teste exibir");
		 String expected = "{\n" +
	                "\"code\": \"1233\",\n" +
	                "\"name\": \"Demo Product\",\n" +
	                "\"price\": 123\n" +
	                "}"; 
		 Gson gson = new Gson();
		 expected = gson.toJson(expected);
		 return expected;
		
	}
	
	
	
	
	
	
	
	
	
}
