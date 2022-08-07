package com.api.javastoreback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.api.javastoreback.modal.Tbuser;


@Repository
public interface  TbuserRepository extends CrudRepository<Tbuser, Integer>  {
 
	
	boolean existsById(int id);
	 
	List<Tbuser> findByativo(String ativo);
  
	@Query(value = "SELECT max(id) as total FROM Tbuser  ", nativeQuery = true)
	Integer findMaxIdNQ();
	
	@Query(value = " select * from Tbuser t1 where t1.username = :username and t1.password = :password ", nativeQuery = true)
	List<Tbuser>  findByForenameAndSurname(@Param("username") String username,
	                                @Param("password") String password);
	
  
} 

 