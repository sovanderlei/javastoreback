package com.api.javastoreback.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api.javastoreback.modal.Tbcustomer;


@Repository
public interface  TbcustomerRepository extends CrudRepository<Tbcustomer, Integer>  {
 
	@Query(value = "SELECT max(id) as total FROM Tbcustomer  ", nativeQuery = true)
	Integer findMaxIdNQ();
	 
} 
