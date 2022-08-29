package com.api.javastoreback.controller;

/**Here I put the description of the class and control methods, variables tec...
* @author Vanderlei Oliveira
* @version 0.01
* @since Release 1 ad appliques
* @file TbuserController.java
* date:02/07/2021  
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.api.javastoreback.modal.Tbuser;
import com.api.javastoreback.security.JwtRequest;
import com.api.javastoreback.security.JwtRespose;
import com.api.javastoreback.security.TokenAuthenticationService;
import com.api.javastoreback.service.TbuserService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TbuserController {

	@Autowired
	private TbuserService services;

	static final Logger loggers = LoggerFactory.getLogger(TbuserController.class);

	/***
	 * createAuthenticationToken - vanderlei
	 * @author Vanderlei Soares de Oliveira
	 * @param jwtReques - data about User
	 * @return List of the ... ResponseEntity - Tbuser -  json
	 * @throws Exception - HttpStatus.UNAUTHORIZED
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest jwtReques) throws Exception {
		JwtRespose jwtResponse = new JwtRespose();
		try { 
			Tbuser data = services.GetUserByUsernamePassword(jwtReques.getUsername(), jwtReques.getPassword());
			if (data != null) {
				
				final String token = TokenAuthenticationService.getToken(jwtReques.getUsername()); 
				jwtResponse = jwtResponse.AddData(data.getId(),data.getIdcompany(),data.getName(),data.getEmail(),HttpStatus.OK.value(),token,"","");

			} else {
				loggers.error("Login: did not find the user "); 
				jwtResponse = jwtResponse.AddData(0,0,"","",HttpStatus.UNAUTHORIZED.value(),"","Login: did not find the user ","");
				return ResponseEntity.ok(jwtReques);
			}

		} catch (Exception ex) {
			loggers.error("Error: " + ex.getMessage()); 
			jwtResponse = jwtResponse.AddData(0,0,"","",HttpStatus.UNAUTHORIZED.value(),"",ex.getMessage(),"");
			return ResponseEntity.ok(jwtReques);
			// return new ResponseEntity<>("Not Authorized!", HttpStatus.UNAUTHORIZED);
		}
		return ResponseEntity.ok(jwtResponse);
	}
 
	/***
	 * loginvalid - vanderlei
	 * @author Vanderlei Soares de Oliveira
	 * @param username
	 * @param password
	 * @return List of the ... ResponseEntity - Tbuser -  json
	 * @throws Exception - HttpStatus.UNAUTHORIZED
	 */
	@RequestMapping(value = "/loginvalid/{username}/{password}", method = RequestMethod.GET)
	public ResponseEntity<?> loginvalid(@PathVariable String username, @PathVariable String password) throws Exception {
		JwtRespose jwtResponse = new JwtRespose();
		try { 
			System.out.println("vanderlei "+username);
			System.out.println("vanderlei "+password);
			Tbuser data = services.GetUserByUsernamePassword(username, password);
			if (data != null) {
				
				final String token = TokenAuthenticationService.getToken(username); 
				jwtResponse = jwtResponse.AddData(data.getId(),data.getIdcompany(),data.getName(),data.getEmail(),HttpStatus.OK.value(),token,"","");

			} else {
				loggers.error("Login: did not find the user "); 
				jwtResponse = jwtResponse.AddData(0,0,"","",HttpStatus.UNAUTHORIZED.value(),"","Login: did not find the user ","");
				return ResponseEntity.ok(jwtResponse);
			}

		} catch (Exception ex) {
			loggers.error("Error: " + ex.getMessage()); 
			jwtResponse = jwtResponse.AddData(0,0,"","",HttpStatus.UNAUTHORIZED.value(),"",ex.getMessage(),"");
			return ResponseEntity.ok(jwtResponse);
			// return new ResponseEntity<>("Not Authorized!", HttpStatus.UNAUTHORIZED);
		}
		return ResponseEntity.ok(jwtResponse);
	}
	
	/***
	 * createAccount - vanderlei
	 * @author Vanderlei Soares de Oliveira
	 * @param jwtReques - String  username; / String password; 
	 * @return List of the ... ResponseEntity - Tbuser -  json
	 * @throws Exception - HttpStatus.UNAUTHORIZED
	 */	
	@RequestMapping(value = "/createaccount", method = RequestMethod.POST)
	public ResponseEntity<?> createAccount(@RequestBody JwtRequest jwtReques) throws Exception {
		JwtRespose jwtResponse = new JwtRespose();
		try {
			
			Tbuser datareturn = new Tbuser();
			datareturn.setIdcompany(0);
			datareturn.setId(1);
			datareturn.setName(jwtReques.getUsername());
			datareturn.setUsername(jwtReques.getUsername());
			datareturn.setPassword(jwtReques.getPassword());
			datareturn.setEmail("");
			datareturn.setStatus("");
			datareturn.setImage("");
			final String token = TokenAuthenticationService.getToken(jwtReques.getUsername());  
			datareturn.setToken(token);
			java.sql.Date sqlDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
			datareturn.setDtlogin(sqlDate);
			datareturn.setDtregister(sqlDate);
			datareturn.setAtivo("YES");
			
			services.save(datareturn); 
			jwtResponse = jwtResponse.AddData(datareturn.getId(),datareturn.getIdcompany(),datareturn.getName(),datareturn.getEmail(),HttpStatus.OK.value(),"","Created a new account!","");

		} catch (Exception ex) {
			loggers.error("Error: " + ex.getMessage()); 
			jwtResponse = jwtResponse.AddData(0,0,"","",HttpStatus.UNAUTHORIZED.value(),"",ex.getMessage(),"");
			return ResponseEntity.ok(jwtReques); 
		}

		return ResponseEntity.ok(jwtResponse);
	}
 
	/***
	 * saveUser - vanderlei
	 * @author Vanderlei Soares de Oliveira
	 * @param request - Tbuser
	 * @return List of the ... ResponseEntity - Tbuser -  json
	 * @throws Exception - HttpStatus.INTERNAL_SERVER_ERROR
	 */
	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody Tbuser request) throws Exception {
		Tbuser datareturn = new Tbuser();
		try {
			
			datareturn.setId(request.getId());
			datareturn.setIdcompany(request.getIdcompany()); 
			datareturn.setName(request.getName());
			datareturn.setUsername(request.getUsername());
			datareturn.setPassword(request.getPassword());
			datareturn.setEmail(request.getEmail());
			datareturn.setStatus(request.getStatus());
			datareturn.setImage(request.getImage());
			final String token = TokenAuthenticationService.getToken(request.getUsername());  
			datareturn.setToken(token);
			java.sql.Date sqlDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
			datareturn.setDtlogin(sqlDate);
			datareturn.setDtregister(sqlDate);
			datareturn.setAtivo(request.getAtivo());
			
			services.save(datareturn); 
			 
		} catch (Exception ex) {
			loggers.error("Error: " + ex.getMessage());  
			 return new ResponseEntity<String>("Error:"+ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return ResponseEntity.ok(datareturn);
	}
	
	//{{URL_STORE}}/deleteuser/1  
	/***
	 * deleteUser - vanderlei
	 * @author Vanderlei Soares de Oliveira
	 * @param id - int
	 * @return List of the ... ResponseEntity - Tbuser -  json
	 * @throws Exception - HttpStatus.INSUFFICIENT_STORAGE  or INTERNAL_SERVER_ERROR
	 */
	@RequestMapping(value = "/deleteuser/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> deleteUser(@PathVariable int id) throws Exception {
		Tbuser datareturn = new Tbuser();
		try {
			 
			datareturn = services.GetDataById(id);
			if(datareturn != null && datareturn.getId() > 0) {
				services.delete(datareturn);
				return new ResponseEntity<String>("Deleted the User.", HttpStatus.OK);
			}else {
				 loggers.debug("Not find the User.");  
				 return new ResponseEntity<String>("Not find the User.", HttpStatus.INSUFFICIENT_STORAGE);
			}
			 
		} catch (Exception ex) {
			 loggers.error("Error: " + ex.getMessage());  
			 return new ResponseEntity<String>("Error:"+ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
 
	}
	 
	//{{URL_STORE}}/getuser/1 
	/***
	 * getUser - vanderlei
	 * @author Vanderlei Soares de Oliveira
	 * @param id - int 
	 * @return List of the ... ResponseEntity - Tbuser -  json
	 * @throws Exception - HttpStatus.INSUFFICIENT_STORAGE  or INTERNAL_SERVER_ERROR
	 */
	@RequestMapping(value = "/getuser/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getUser(@PathVariable int id) throws Exception {
		Tbuser datareturn = new Tbuser();
		try {
			 
			datareturn = services.GetDataById(id);
			if(datareturn != null) {
				return ResponseEntity.ok(datareturn);
			}else {
				 loggers.debug("Not find the User.");  
				 return new ResponseEntity<String>("Alert: Not find the User.", HttpStatus.INSUFFICIENT_STORAGE);
			}
			 
		} catch (Exception ex) {
			 loggers.error("Error: " + ex.getMessage());  
			 return new ResponseEntity<String>("Error:"+ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
 
	}
	
	
	/***
	 * Description of the method to use in javadoc
	 * 
	 * @author Vanderlei Soares de Oliveira
	 * @param model - Model
	 * @return List of the ... ResponseEntity - Tbuser -  json
	 */
	@RequestMapping("/usersall")
	@ResponseBody
	public ResponseEntity<List<Tbuser>> getallusers(Model model) {

		loggers.debug("getallusers: start get data");

		List<Tbuser> ListReturn = new ArrayList<Tbuser>();
		ListReturn = services.ListAll();
		return ResponseEntity.ok(ListReturn);
	}

	// http://localhost:8089/login
	// no body
	// {"username":"admin","password":"password"}

	
	
	
	
	

}
