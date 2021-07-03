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
import com.api.javastoreback.repository.TbproductgroupRepository; 
import com.api.javastoreback.modal.Tbproductgroup;

@Service
public interface TbproductgroupService extends TbproductgroupRepository {

	static final Logger loggers = LoggerFactory.getLogger(TbproductgroupRepository.class);

	public default Tbproductgroup GetDataById(int codigo) {

		Tbproductgroup datareturn = new Tbproductgroup();
		datareturn.setIdcompany(0);
		datareturn.setId(0); 

		Optional<Tbproductgroup> datafind = this.findById(codigo);

		try {

			if (datafind.isPresent()) {
				datareturn = datafind.get();
			}

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return datareturn;

	}

	public default List<Tbproductgroup> ListAll() {
		List<Tbproductgroup> ListReturn = new ArrayList<Tbproductgroup>();

		try {

			ListReturn = (List<Tbproductgroup>) this.findAll();

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return ListReturn;
	}

	public default String Save(Tbproductgroup pdata) {
		try {

			this.save(pdata);

			return "Recorded the data correctly.";

		} catch (Exception e) {

			loggers.error("Erro:" + e.getMessage());
		}
		
		return "Not recorded the data correctly.";
		
	}

	public default String Delete(int codigo) {

		Optional<Tbproductgroup> datafind = this.findById(codigo);

		try {

			Tbproductgroup datas = new Tbproductgroup();
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

	public default List<Tbproductgroup> GetSqlNative(String pName) {

		List<Tbproductgroup> ListData = new ArrayList<Tbproductgroup>();

		// Lista = findByNativeQuery(pName);

		return ListData;

	}

}
 
