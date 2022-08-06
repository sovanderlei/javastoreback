package com.api.javastoreback.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.javastoreback.modal.Tbseller;
 
 
@Repository
public interface  TbsellerRepository extends CrudRepository<Tbseller, Integer>  {
 
	@Query(value = "SELECT max(id) as total FROM Tbseller  ", nativeQuery = true)
	Integer findMaxIdNQ();
	 
} 
