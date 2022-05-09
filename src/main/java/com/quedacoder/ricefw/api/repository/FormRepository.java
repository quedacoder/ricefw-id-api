package com.quedacoder.ricefw.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.quedacoder.ricefw.api.model.Form;

public interface FormRepository extends CrudRepository<Form, Long> {
	
	@Query( nativeQuery = true, value ="SELECT ricefw_Id FROM Form f WHERE f.region=:region ORDER BY ricefw_Id DESC limit 1")
	String findLastRicefwId(@Param("region") String region);
	
}
