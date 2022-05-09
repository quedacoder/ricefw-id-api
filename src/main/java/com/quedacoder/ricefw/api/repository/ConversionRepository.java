package com.quedacoder.ricefw.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.quedacoder.ricefw.api.model.Conversion;

public interface ConversionRepository extends CrudRepository<Conversion, Long> {
	
	@Query( nativeQuery = true, value ="SELECT ricefw_Id FROM Conversion c WHERE c.region=:region ORDER BY ricefw_Id DESC limit 1")
	String findLastRicefwId(@Param("region") String region);

}
