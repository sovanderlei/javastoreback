package com.api.javastoreback.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api.javastoreback.modal.Tbproductimg;


@Repository
public interface  TbproductimgRepository extends CrudRepository<Tbproductimg, Integer>  {
 
	@Query(value = "SELECT max(id) as total FROM Tbproductimg  ", nativeQuery = true)
	Integer findMaxIdNQ();
	 
} 
 
