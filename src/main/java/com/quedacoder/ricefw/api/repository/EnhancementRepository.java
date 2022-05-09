package com.quedacoder.ricefw.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.quedacoder.ricefw.api.model.Enhancement;

public interface EnhancementRepository extends CrudRepository<Enhancement, Long> {
	
	@Query( nativeQuery = true, value ="SELECT ricefw_Id FROM Enhancement e WHERE e.region=:region ORDER BY ricefw_Id DESC limit 1")
	String findLastRicefwId(@Param("region") String region);

}
