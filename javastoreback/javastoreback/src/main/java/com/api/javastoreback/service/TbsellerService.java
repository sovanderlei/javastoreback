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
import com.api.javastoreback.repository.TbsellerRepository; 
import com.api.javastoreback.modal.Tbseller;

@Service
public interface TbsellerService extends TbsellerRepository {

	static final Logger loggers = LoggerFactory.getLogger(TbsellerRepository.class);

	public default Tbseller GetDataById(int codigo) {

		Tbseller datareturn = new Tbseller(); 

		Optional<Tbseller> datafind = this.findById(codigo);

		try {

			if (datafind.isPresent()) {
				datareturn = datafind.get();
			}

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return datareturn;

	}

	public default List<Tbseller> ListAll() {
		List<Tbseller> ListReturn = new ArrayList<Tbseller>();

		try {

			ListReturn = (List<Tbseller>) this.findAll();

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return ListReturn;
	}

	public default String Save(Tbseller pdata) {
		try {

			this.save(pdata);

			return "Recorded the data correctly.";

		} catch (Exception e) {

			loggers.error("Erro:" + e.getMessage());
		}
		
		return "Not recorded the data correctly.";
		
	}

	public default String Delete(int codigo) {

		Optional<Tbseller> datafind = this.findById(codigo);

		try {

			Tbseller datas = new Tbseller();
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

	public default List<Tbseller> GetSqlNative(String pName) {

		List<Tbseller> ListData = new ArrayList<Tbseller>();

		// Lista = findByNativeQuery(pName);

		return ListData;

	}

}