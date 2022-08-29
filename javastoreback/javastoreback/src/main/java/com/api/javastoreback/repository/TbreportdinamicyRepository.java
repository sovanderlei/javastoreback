package com.api.javastoreback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository; 
import org.springframework.stereotype.Repository;
import com.api.javastoreback.modal.Tbreportdinamicy; 
 
@Repository
public interface  TbreportdinamicyRepository  extends CrudRepository<Tbreportdinamicy, Integer>  {

	boolean existsById(int id);
	 
	List<Tbreportdinamicy> findBynameReport(String nameReport);
	List<Tbreportdinamicy> findByativo(String ativo);
  
	@Query(value = "SELECT max(id) as total FROM Tbreportdinamicy  ", nativeQuery = true)
	Integer findMaxIdNQ();
	
 	
	
}
