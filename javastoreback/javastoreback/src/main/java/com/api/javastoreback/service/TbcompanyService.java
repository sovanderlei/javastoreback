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
import com.api.javastoreback.repository.TbcompanyRepository; 
import com.api.javastoreback.modal.Tbcompany;

@Service
public interface TbcompanyService extends TbcompanyRepository {

	static final Logger loggers = LoggerFactory.getLogger(TbcompanyRepository.class);

	public default Tbcompany GetDataById(int codigo) {

		Tbcompany datareturn = new Tbcompany();
		datareturn.setId(0); 

		Optional<Tbcompany> datafind = this.findById(codigo);

		try {

			if (datafind.isPresent()) {
				datareturn = datafind.get();
			}

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return datareturn;

	}

	public default List<Tbcompany> ListAll() {
		List<Tbcompany> ListReturn = new ArrayList<Tbcompany>();

		try {

			ListReturn = (List<Tbcompany>) this.findAll();

		} catch (Exception e) {
			loggers.error("Erro:" + e.getMessage());
		}

		return ListReturn;
	}

	public default String Save(Tbcompany pdata) {
		try {
			
			if(pdata.getId() == 0)
				pdata.setId(this.findMaxIdNQ());
			
			this.save(pdata);

			return "Recorded the data correctly.";

		} catch (Exception e) {

			loggers.error("Erro:" + e.getMessage());
		}
		
		return "Not recorded the data correctly.";
		
	}

	public default String Delete(int codigo) {

		Optional<Tbcompany> datafind = this.findById(codigo);

		try {

			Tbcompany datas = new Tbcompany();
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

	public default List<Tbcompany> GetSqlNative(String pName) {

		List<Tbcompany> ListData = new ArrayList<Tbcompany>();

		 
		return ListData;

	}

	
	
	
}

 