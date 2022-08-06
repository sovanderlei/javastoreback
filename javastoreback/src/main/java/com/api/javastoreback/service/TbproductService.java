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
import com.api.javastoreback.repository.TbproductRepository; 
import com.api.javastoreback.modal.Tbproduct;

@Service
public interface TbproductService extends TbproductRepository {

	static final Logger loggers = LoggerFactory.getLogger(TbproductRepository.class);

	public default Tbproduct GetDataById(int codigo) {

		Tbproduct datareturn = new Tbproduct(); 

		Optional<Tbproduct> datafind = this.findById(codigo);

		try {

			if (datafind.isPresent()) {
				datareturn = datafind.get();
			}

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return datareturn;

	}

	public default List<Tbproduct> ListAll() {
		List<Tbproduct> ListReturn = new ArrayList<Tbproduct>();

		try {

			ListReturn = (List<Tbproduct>) this.findAll();

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return ListReturn;
	}

	public default String Save(Tbproduct pdata) {
		try {

			this.save(pdata);

			return "Recorded the data correctly.";

		} catch (Exception e) {

			loggers.error("Erro:" + e.getMessage());
		}
		
		return "Not recorded the data correctly.";
		
	}

	public default String Delete(int codigo) {

		Optional<Tbproduct> datafind = this.findById(codigo);

		try {

			Tbproduct datas = new Tbproduct();
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

	public default List<Tbproduct> GetSqlNative(String pName) {

		List<Tbproduct> ListData = new ArrayList<Tbproduct>();

		// Lista = findByNativeQuery(pName);

		return ListData;

	}

}

 