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
import com.api.javastoreback.repository.TborderitemRepository; 
import com.api.javastoreback.modal.Tborderitem;

@Service
public interface TborderitemService extends TborderitemRepository {

	static final Logger loggers = LoggerFactory.getLogger(TborderitemRepository.class);

	public default Tborderitem GetDataById(int codigo) {

		Tborderitem datareturn = new Tborderitem();
		datareturn.setIdcompany(0);
		datareturn.setId(0); 

		Optional<Tborderitem> datafind = this.findById(codigo);

		try {

			if (datafind.isPresent()) {
				datareturn = datafind.get();
			}

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return datareturn;

	}

	public default List<Tborderitem> ListAll() {
		List<Tborderitem> ListReturn = new ArrayList<Tborderitem>();

		try {

			ListReturn = (List<Tborderitem>) this.findAll();

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return ListReturn;
	}

	public default String Save(Tborderitem pdata) {
		try {

			this.save(pdata);

			return "Recorded the data correctly.";

		} catch (Exception e) {

			loggers.error("Erro:" + e.getMessage());
		}
		
		return "Not recorded the data correctly.";
		
	}

	public default String Delete(int codigo) {

		Optional<Tborderitem> datafind = this.findById(codigo);

		try {

			Tborderitem datas = new Tborderitem();
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

	public default List<Tborderitem> GetSqlNative(String pName) {

		List<Tborderitem> ListData = new ArrayList<Tborderitem>();

		// Lista = findByNativeQuery(pName);

		return ListData;

	}

}

 
