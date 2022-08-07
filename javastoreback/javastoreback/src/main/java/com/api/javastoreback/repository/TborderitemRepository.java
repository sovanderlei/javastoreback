package com.api.javastoreback.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api.javastoreback.modal.Tborderitem;


@Repository
public interface  TborderitemRepository extends CrudRepository<Tborderitem, Integer>  {
 
	@Query(value = "SELECT max(id) as total FROM Tborderitem  ", nativeQuery = true)
	Integer findMaxIdNQ();
	 
} 
 