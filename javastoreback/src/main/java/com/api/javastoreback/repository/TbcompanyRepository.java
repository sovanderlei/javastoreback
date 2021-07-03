package com.api.javastoreback.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api.javastoreback.modal.Tbcompany;


@Repository
public interface  TbcompanyRepository extends CrudRepository<Tbcompany, Integer>  {
 
	@Query(value = "SELECT max(id) as total FROM Tbcompany  ", nativeQuery = true)
	Integer findMaxIdNQ();
	 
} 
 