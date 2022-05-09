package com.quedacoder.ricefw.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.quedacoder.ricefw.api.model.Report;

public interface ReportRepository extends CrudRepository<Report, Long> {
	
	@Query( nativeQuery = true, value ="SELECT ricefw_Id FROM Report r WHERE r.region=:region ORDER BY ricefw_Id DESC limit 1")
	String findLastRicefwId(@Param("region") String region);

}
