package com.api.javastoreback.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api.javastoreback.modal.Tbuser;


@Repository
public interface  TbuserRepository extends CrudRepository<Tbuser, Integer>  {
 
	@Query(value = "SELECT max(id) as total FROM Tbuser  ", nativeQuery = true)
	Integer findMaxIdNQ();
	 
} 

 