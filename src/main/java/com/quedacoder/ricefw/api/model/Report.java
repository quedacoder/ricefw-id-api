package com.quedacoder.ricefw.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Report {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String ricefwId;
	private String region;
	
	public Report() {}
	
	public Report(long id, String ricefwId, String region) {
		super();
		this.id = id;
		this.ricefwId = ricefwId;
		this.region = region;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getRicefwId() {
		return ricefwId;
	}


	public void setRicefwId(String ricefwId) {
		this.ricefwId = ricefwId;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	@Override
	public String toString() {
		return "Report [id=" + id + ", ricefwId=" + ricefwId + ", region=" + region + "]";
	}

}
