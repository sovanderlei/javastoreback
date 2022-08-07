package com.api.javastoreback.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.api.javastoreback.repository.TbuserRepository; 
import com.api.javastoreback.modal.Tbuser;

/**
 * @author voliveira
 * @date 2021-07-02
 * @file TbuserService.java
 */
@Service
public interface TbuserService extends TbuserRepository {

	static final Logger loggers = LoggerFactory.getLogger(TbuserRepository.class);

	
	public default Tbuser GetUserByUsernamePassword(String Username, String Password) {  
		return findByForenameAndSurname(Username, Password).get(0);
	}
	
	public default boolean ValidUser(String Username, String Password) {  
		return findByForenameAndSurname(Username, Password).size() > 0;
	}
	
	
	/**
	 * GetDataById - contents of the methods
	 * @param codigo
	 * @return Tbuser
	 */
	public default Tbuser GetDataById(int codigo) {

		Tbuser datareturn = new Tbuser();
		datareturn.setIdcompany(0);
		datareturn.setId(0);
		datareturn.setName("");
		datareturn.setUsername("");
		datareturn.setPassword("");
		datareturn.setStatus("");
		datareturn.setImage("");
		datareturn.setToken("");
		java.sql.Date sqlDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		datareturn.setDtlogin(sqlDate);
		datareturn.setDtregister(sqlDate);
		datareturn.setAtivo("YES");

		Optional<Tbuser> datafind = this.findById(codigo);

		try {

			if (datafind.isPresent()) {
				datareturn = datafind.get();
			}

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return datareturn;

	}

	/**
	 * ListAll - contents of the methods
	 * @return List<Tbuser>
	 */
	public default List<Tbuser> ListAll() {
		List<Tbuser> ListReturn = new ArrayList<Tbuser>();

		try {

			ListReturn = (List<Tbuser>) this.findAll();

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return ListReturn;
	}

	/**
	 * Save 
	 * @param pdata
	 * @return String
	 */
	public default String Save(Tbuser pdata) {
		try {

			this.save(pdata);

			return "Recorded the data correctly.";

		} catch (Exception e) {

			loggers.error("Erro:" + e.getMessage());
		}
		
		return "Not recorded the data correctly.";
		
	}

	/**
	 * Delete - contents of the methods
	 * @param codigo
	 * @return String
	 */
	public default String Delete(int codigo) {

		Optional<Tbuser> datafind = this.findById(codigo);

		try {

			Tbuser datas = new Tbuser();
			if (datafind.isPresent()) {
				datas = datafind.get();
			}

			this.delete(datas);

			return "Record deleted successfully!";

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}
		
		return "Not record deleted successfully!";
		
	}

	/**
	 * GetSqlNative - contents of the methods
	 * @param pName
	 * @return List<Tbuser>
	 */
	public default List<Tbuser> GetSqlNative(String pName) {

		List<Tbuser> ListData = new ArrayList<Tbuser>();

		// Lista = findByNativeQuery(pName);

		return ListData;

	}

}