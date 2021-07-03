package com.api.javastoreback.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api.javastoreback.modal.Tbproduct;


@Repository
public interface  TbproductRepository extends CrudRepository<Tbproduct, Integer>  {
 
	@Query(value = "SELECT max(id) as total FROM Tbproduct  ", nativeQuery = true)
	Integer findMaxIdNQ();
	 
} 
 
