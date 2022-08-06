package com.api.javastoreback.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api.javastoreback.modal.Tborder;
 
@Repository
public interface  TborderRepository extends CrudRepository<Tborder, Integer>  {
 
	@Query(value = "SELECT max(id) as total FROM Tborder  ", nativeQuery = true)
	Integer findMaxIdNQ();
	 
} 
 