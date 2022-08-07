package com.api.javastoreback.service;

/**Here I put the description of the class and control methods, variables tec...
* @author Vanderlei Oliveira
* @version 0.01
* @since Release 1 ad appliques
* date:02/07/2021  
*/

import java.util.ArrayList; 
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.api.javastoreback.repository.TborderRepository; 
import com.api.javastoreback.modal.Tborder;

@Service
public interface TborderService extends TborderRepository {

	static final Logger loggers = LoggerFactory.getLogger(TborderRepository.class);

	public default Tborder GetDataById(int codigo) {

		Tborder datareturn = new Tborder();
		datareturn.setIdcompany(0);
		datareturn.setId(0); 

		Optional<Tborder> datafind = this.findById(codigo);

		try {

			if (datafind.isPresent()) {
				datareturn = datafind.get();
			}

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return datareturn;

	}

	public default List<Tborder> ListAll() {
		List<Tborder> ListReturn = new ArrayList<Tborder>();

		try {

			ListReturn = (List<Tborder>) this.findAll();

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return ListReturn;
	}

	public default String Save(Tborder pdata) {
		try {

			this.save(pdata);

			return "Recorded the data correctly.";

		} catch (Exception e) {

			loggers.error("Erro:" + e.getMessage());
		}
		
		return "Not recorded the data correctly.";
		
	}

	public default String Delete(int codigo) {

		Optional<Tborder> datafind = this.findById(codigo);

		try {

			Tborder datas = new Tborder();
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

	public default List<Tborder> GetSqlNative(String pName) {

		List<Tborder> ListData = new ArrayList<Tborder>();

		// Lista = findByNativeQuery(pName);

		return ListData;

	}

}

 
