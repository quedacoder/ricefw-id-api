package com.quedacoder.ricefw.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quedacoder.ricefw.api.model.Master;
import com.quedacoder.ricefw.api.repository.RicefwRepository;

@Service
public class RicefwService {
	
	@Autowired
	private RicefwRepository repository;
	
	public List<Master> getAllRicefwId() {
		return repository.findAll();
	}
	
	public List<Master> getAllDomesticRicefwId(String region) {
		return repository.findAllByRegion(region);
	}
	
	public Master getMasterRicefwItem(String region, String ricefwId) {
		return repository.findOneByRegionAndRicefwId(region, ricefwId);
	}
	
	public Master save(Master master) {
		return repository.save(master);
	}

}
