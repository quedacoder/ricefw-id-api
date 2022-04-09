package com.quedacoder.ricefw.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quedacoder.ricefw.api.model.Master;
import com.quedacoder.ricefw.api.service.RicefwService;

@RestController
public class RicefwController {
	
	@Autowired
	private RicefwService ricefwService;
	
	@GetMapping("/ricefw/api/domestic/masters")
	public List<Master> getAllRicefwId() {
		
		return ricefwService.getAllDomesticRicefwId("Domestic");
		
	}

}
