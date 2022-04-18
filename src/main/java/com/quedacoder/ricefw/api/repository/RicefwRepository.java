package com.quedacoder.ricefw.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quedacoder.ricefw.api.model.Master;

@Repository
public interface RicefwRepository extends CrudRepository<Master, Long> {
	
	List<Master> findAll();
	
	List<Master> findAllByRegion(String region);
	
	Master findOneByRegionAndRicefwId(String region, String ricefwId);

}
