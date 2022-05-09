package com.quedacoder.ricefw.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quedacoder.ricefw.api.model.Master;
import com.quedacoder.ricefw.api.service.RicefwService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RicefwController {
	
	@Autowired
	private RicefwService ricefwService;
	
	@GetMapping("/ricefw/api/domestic/masters")
	public List<Master> getAllRicefwId() {
		return ricefwService.getAllDomesticRicefwId("Domestic");
	}
	
	@GetMapping("/ricefw/api/domestic/masters/{ricefwId}")
	public Master getMasterRicefwItem(@PathVariable String ricefwId) {
		
		Master masterToEdit = ricefwService.getMasterRicefwItem("Domestic", ricefwId);
		
		if (masterToEdit != null) {
			return masterToEdit;
		}
		
		
		return null;
	}
	
	@PutMapping("/ricefw/api/domestic/masters/{ricefwId}")
	public ResponseEntity<Master> updateRicefwItem(@PathVariable String ricefwId, @RequestBody Master master) {
		
		Master updatedMaster = ricefwService.save(master);
		return new ResponseEntity<Master>(updatedMaster, HttpStatus.OK);
		
	}
	
	@PostMapping("/ricefw/api/domestic/masters")
	public ResponseEntity<Void> createRicefwItem(@RequestBody Master master) {
		
		Master newMaster = ricefwService.createRicefwItem(master);
		return null;
	}
	
	@GetMapping("/ricefw/api/conversion")
	public String getLastRicefwId() {
		
		String id = ricefwService.getLastConversionNumber();
		
	    int number = Integer.parseInt(id.substring(1, 6));
	    
	    String newNumber = String.format("C%05d", ++number);
		
		return newNumber;
	}

}
