package com.quedacoder.ricefw.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.quedacoder.ricefw.api.model.Conversion;
import com.quedacoder.ricefw.api.model.Enhancement;
import com.quedacoder.ricefw.api.model.Form;
import com.quedacoder.ricefw.api.model.Interface;
import com.quedacoder.ricefw.api.model.Master;
import com.quedacoder.ricefw.api.model.Report;
import com.quedacoder.ricefw.api.model.Workflow;
import com.quedacoder.ricefw.api.repository.ConversionRepository;
import com.quedacoder.ricefw.api.repository.EnhancementRepository;
import com.quedacoder.ricefw.api.repository.FormRepository;
import com.quedacoder.ricefw.api.repository.InterfaceRepository;
import com.quedacoder.ricefw.api.repository.ReportRepository;
import com.quedacoder.ricefw.api.repository.RicefwRepository;
import com.quedacoder.ricefw.api.repository.WorkflowRepository;

@Service
public class RicefwService {
	
	@Autowired
	private RicefwRepository repository;
	
	@Autowired
	private ConversionRepository conversionRepository;
	
	@Autowired
	private ReportRepository reportRepository;
	
	@Autowired
	private InterfaceRepository interfaceRepository;
	
	@Autowired
	private EnhancementRepository enhancementRepository;
	
	@Autowired
	private FormRepository formRepository;
	
	@Autowired
	private WorkflowRepository workflowRepository;
	
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
	
	public Master createRicefwItem(Master master) {
		
		
		// determine object type of new ricefw item
		String objectType = determineObjectType(master.getObjectType());
		
		
		// get the last ricefw id created
		Optional<String> lastRicefwId = getLastRicefwId(objectType);
		
		
		//create ricefw id by one
		if (lastRicefwId.isPresent()) {
			
			String newRicefwId = createNewId(lastRicefwId.get(), objectType);
			
			// Save data to db
			master.setRicefwId(newRicefwId);
			Master savedRecord = repository.save(master);
			
			// Save newly created ricefwId to id tracker table
			saveIdToTrackerTable(objectType, savedRecord.getRicefwId());
		}
		
		// save ricefw item
		return master;
	}
	
	private void saveIdToTrackerTable(String objectType, String ricefwId) {
		
		switch (objectType) {
		
		case "C":
			Conversion conversion = new Conversion();
			conversion.setRegion("Domestic");
			conversion.setRicefwId(ricefwId);
			conversionRepository.save(conversion);
			break;
			
		case "R":
			Report report = new Report();
			report.setRegion("Domestic");
			report.setRicefwId(ricefwId);
			reportRepository.save(report);
			break;
			
		case "I":
			Interface interfaceObject = new Interface();
			interfaceObject.setRegion("Domestic");
			interfaceObject.setRicefwId(ricefwId);
			interfaceRepository.save(interfaceObject);
			break;
			
		case "E":
			Enhancement enhancement = new Enhancement();
			enhancement.setRegion("Domestic");
			enhancement.setRicefwId(ricefwId);
			enhancementRepository.save(enhancement);
			break;
			
		case "F":
			Form form = new Form();
			form.setRegion("Domestic");
			form.setRicefwId(ricefwId);
			formRepository.save(form);
			break;
			
		case "W":
			Workflow workflow = new Workflow();
			workflow.setRegion("Domestic");
			workflow.setRicefwId(ricefwId);
			workflowRepository.save(workflow);
			break;
		default:
			break;
	}
		
	}

	private String createNewId(String s, String o) {
		
		int n = Integer.parseInt(s.substring(1, 6));
		System.out.println(s.substring(1, 6));
		System.out.println(n);
		n++;
		
		String testString = String.format("%s%05d", o, n);
		System.out.println(testString);
		
		return String.format("%s%05d", o, n);
	}

	private Optional<String> getLastRicefwId(String objectType) {
		
		Optional<String> ricefwId = null;
		
		switch (objectType) {
		
			case "C":
				ricefwId = Optional.ofNullable(conversionRepository.findLastRicefwId("Domestic"));
				break;
			case "R":
				ricefwId = Optional.ofNullable(reportRepository.findLastRicefwId("Domestic"));
				break;
			case "I":
				ricefwId = Optional.ofNullable(interfaceRepository.findLastRicefwId("Domestic"));
				break;
			case "E":
				ricefwId = Optional.ofNullable(enhancementRepository.findLastRicefwId("Domestic"));
				break;
			case "F":
				ricefwId = Optional.ofNullable(formRepository.findLastRicefwId("Domestic"));
				break;
			case "W":
				ricefwId = Optional.ofNullable(workflowRepository.findLastRicefwId("Domestic"));
				break;
			default:
				break;
		}
		
		return ricefwId;
	}

	private String determineObjectType(String objectType) {
		
		char arr[] = objectType.toCharArray();
		return Character.toString(arr[0]);
		
	}

	public String getLastConversionNumber() {
		return conversionRepository.findLastRicefwId("Domestic");
	}

}
