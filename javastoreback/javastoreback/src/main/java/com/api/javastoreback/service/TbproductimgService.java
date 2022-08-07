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
import com.api.javastoreback.repository.TbproductimgRepository; 
import com.api.javastoreback.modal.Tbproductimg;

@Service
public interface TbproductimgService extends TbproductimgRepository {

	static final Logger loggers = LoggerFactory.getLogger(TbproductimgRepository.class);

	public default Tbproductimg GetDataById(int codigo) {

		Tbproductimg datareturn = new Tbproductimg();
		 
		Optional<Tbproductimg> datafind = this.findById(codigo);

		try {

			if (datafind.isPresent()) {
				datareturn = datafind.get();
			}

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return datareturn;

	}

	public default List<Tbproductimg> ListAll() {
		List<Tbproductimg> ListReturn = new ArrayList<Tbproductimg>();

		try {

			ListReturn = (List<Tbproductimg>) this.findAll();

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return ListReturn;
	}

	public default String Save(Tbproductimg pdata) {
		try {

			this.save(pdata);

			return "Recorded the data correctly.";

		} catch (Exception e) {

			loggers.error("Erro:" + e.getMessage());
		}
		
		return "Not recorded the data correctly.";
		
	}

	public default String Delete(int codigo) {

		Optional<Tbproductimg> datafind = this.findById(codigo);

		try {

			Tbproductimg datas = new Tbproductimg();
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

	public default List<Tbproductimg> GetSqlNative(String pName) {

		List<Tbproductimg> ListData = new ArrayList<Tbproductimg>();

		// Lista = findByNativeQuery(pName);

		return ListData;

	}

}
