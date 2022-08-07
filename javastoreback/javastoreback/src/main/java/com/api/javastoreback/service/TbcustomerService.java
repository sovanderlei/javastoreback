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
import com.api.javastoreback.repository.TbcustomerRepository; 
import com.api.javastoreback.modal.Tbcustomer;

@Service
public interface TbcustomerService extends TbcustomerRepository {

	static final Logger loggers = LoggerFactory.getLogger(TbcustomerRepository.class);

	public default Tbcustomer GetDataById(int codigo) {

		Tbcustomer datareturn = new Tbcustomer();
		datareturn.setIdcompany(0);
		datareturn.setId(0); 

		Optional<Tbcustomer> datafind = this.findById(codigo);

		try {

			if (datafind.isPresent()) {
				datareturn = datafind.get();
			}

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return datareturn;

	}

	public default List<Tbcustomer> ListAll() {
		List<Tbcustomer> ListReturn = new ArrayList<Tbcustomer>();

		try {

			ListReturn = (List<Tbcustomer>) this.findAll();

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return ListReturn;
	}

	public default String Save(Tbcustomer pdata) {
		try {

			this.save(pdata);

			return "Recorded the data correctly.";

		} catch (Exception e) {

			loggers.error("Erro:" + e.getMessage());
		}
		
		return "Not recorded the data correctly.";
		
	}

	public default String Delete(int codigo) {

		Optional<Tbcustomer> datafind = this.findById(codigo);

		try {

			Tbcustomer datas = new Tbcustomer();
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

	public default List<Tbcustomer> GetSqlNative(String pName) {

		List<Tbcustomer> ListData = new ArrayList<Tbcustomer>();

		// Lista = findByNativeQuery(pName);

		return ListData;

	}

}

 
