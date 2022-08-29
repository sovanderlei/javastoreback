package com.api.javastoreback.service;

import java.util.ArrayList; 
import java.util.List;
import java.util.Optional; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service; 
import com.api.javastoreback.modal.Tbreportdinamicy; 
import com.api.javastoreback.repository.TbreportdinamicyRepository; 

/**
 * @author voliveira
 * @date 2021-07-02
 * @file TbuserService.java
 */
@Service
public interface TbreportdinamicyService  extends  TbreportdinamicyRepository{

	static final Logger loggers = LoggerFactory.getLogger(TbreportdinamicyRepository.class);
	 
	/**
	 * GetDataById - contents of the methods vanderlei
	 * @param id
	 * @return Tbreportdinamicy
	 */
	public default Tbreportdinamicy GetDataById(int id) {

		Tbreportdinamicy datareturn = new Tbreportdinamicy();
		 
		Optional<Tbreportdinamicy> datafind = this.findById(id);

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
	 * @return List<Tbreportdinamicy>
	 */
	public default List<Tbreportdinamicy> ListAll() {
		List<Tbreportdinamicy> ListReturn = new ArrayList<Tbreportdinamicy>();

		try { 
			
			ListReturn = (List<Tbreportdinamicy>) this.findAll();

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
	public default String Save(Tbreportdinamicy pdata) {
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

		Optional<Tbreportdinamicy> datafind = this.findById(codigo);

		try {

			Tbreportdinamicy datas = new Tbreportdinamicy();
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

	 
	
	
	
}
