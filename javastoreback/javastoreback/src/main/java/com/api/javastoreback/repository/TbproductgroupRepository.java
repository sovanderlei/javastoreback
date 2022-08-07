package com.api.javastoreback.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api.javastoreback.modal.Tbproductgroup;


@Repository
public interface  TbproductgroupRepository extends CrudRepository<Tbproductgroup, Integer>  {
 
	@Query(value = "SELECT max(id) as total FROM Tbproductgroup  ", nativeQuery = true)
	Integer findMaxIdNQ();
	 
} 
 
