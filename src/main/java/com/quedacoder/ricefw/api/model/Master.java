package com.quedacoder.ricefw.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Master {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String ricefwId;
	
	// required
	private String objectTitle;
	
	// required
	private String ricefwDescription;
	
	// required
	private String landscapeSystem;
	private String processArea;
	private String processAreaText;
	
	// required
	private String objectType;
	private String objectTypeText;
	
	// required
	private String region;
	
	// required
	private String originatingProject;
	private String sourceSystem;
	private String targetSystem;
	private String middleware;
	
	// on selection screen
	private String isApprovedByLeadPanel;
	private String requestedBy;
	private Date requestedOn;
	private String approvalStatus;
	private String isActive;
	private String respondedText;
	private String respondedBy;
	private Date respondedOn;
	private String jiraId;
	
	// on creation screen
	private String documentationUrl;
	
	// required
	private String subProcessArea;
	private String subProcessAreaText;
	private String referenceId;
	
	public Master() {
		super();
	}

	public Master(long id, String ricefwId, String objectTitle, String ricefwDescription, String landscapeSystem,
			String processArea, String processAreaText, String objectType, String objectTypeText, String region,
			String originatingProject, String sourceSystem, String targetSystem, String middleware,
			String isApprovedByLeadPanel, String requestedBy, Date requestedOn, String approvalStatus,
			String isActive, String respondedText, String respondedBy, Date respondedOn, String jiraId,
			String documentationUrl, String subProcessArea, String subProcessAreaText, String referenceId) {
		super();
		this.id = id;
		this.ricefwId = ricefwId;
		this.objectTitle = objectTitle;
		this.ricefwDescription = ricefwDescription;
		this.landscapeSystem = landscapeSystem;
		this.processArea = processArea;
		this.processAreaText = processAreaText;
		this.objectType = objectType;
		this.objectTypeText = objectTypeText;
		this.region = region;
		this.originatingProject = originatingProject;
		this.sourceSystem = sourceSystem;
		this.targetSystem = targetSystem;
		this.middleware = middleware;
		this.isApprovedByLeadPanel = isApprovedByLeadPanel;
		this.requestedBy = requestedBy;
		this.requestedOn = requestedOn;
		this.approvalStatus = approvalStatus;
		this.isActive = isActive;
		this.respondedText = respondedText;
		this.respondedBy = respondedBy;
		this.respondedOn = respondedOn;
		this.jiraId = jiraId;
		this.documentationUrl = documentationUrl;
		this.subProcessArea = subProcessArea;
		this.subProcessAreaText = subProcessAreaText;
		this.referenceId = referenceId;
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

	public String getObjectTitle() {
		return objectTitle;
	}

	public void setObjectTitle(String objectTitle) {
		this.objectTitle = objectTitle;
	}

	public String getRicefwDescription() {
		return ricefwDescription;
	}

	public void setRicefwDescription(String ricefwDescription) {
		this.ricefwDescription = ricefwDescription;
	}

	public String getLandscapeSystem() {
		return landscapeSystem;
	}

	public void setLandscapeSystem(String landscapeSystem) {
		this.landscapeSystem = landscapeSystem;
	}

	public String getProcessArea() {
		return processArea;
	}

	public void setProcessArea(String processArea) {
		this.processArea = processArea;
	}

	public String getProcessAreaText() {
		return processAreaText;
	}

	public void setProcessAreaText(String processAreaText) {
		this.processAreaText = processAreaText;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getObjectTypeText() {
		return objectTypeText;
	}

	public void setObjectTypeText(String objectTypeText) {
		this.objectTypeText = objectTypeText;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getOriginatingProject() {
		return originatingProject;
	}

	public void setOriginatingProject(String originatingProject) {
		this.originatingProject = originatingProject;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getTargetSystem() {
		return targetSystem;
	}

	public void setTargetSystem(String targetSystem) {
		this.targetSystem = targetSystem;
	}

	public String getMiddleware() {
		return middleware;
	}

	public void setMiddleware(String middleware) {
		this.middleware = middleware;
	}

	public String isApprovedByLeadPanel() {
		return isApprovedByLeadPanel;
	}

	public void setApprovedByLeadPanel(String isApprovedByLeadPanel) {
		this.isApprovedByLeadPanel = isApprovedByLeadPanel;
	}

	public String getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}

	public Date getRequestedOn() {
		return requestedOn;
	}

	public void setRequestedOn(Date requestedOn) {
		this.requestedOn = requestedOn;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String isActive() {
		return isActive;
	}

	public void setActive(String isActive) {
		this.isActive = isActive;
	}

	public String getRespondedText() {
		return respondedText;
	}

	public void setRespondedText(String respondedText) {
		this.respondedText = respondedText;
	}

	public String getRespondedBy() {
		return respondedBy;
	}

	public void setRespondedBy(String respondedBy) {
		this.respondedBy = respondedBy;
	}

	public Date getRespondedOn() {
		return respondedOn;
	}

	public void setRespondedOn(Date respondedOn) {
		this.respondedOn = respondedOn;
	}

	public String getJiraId() {
		return jiraId;
	}

	public void setJiraId(String jiraId) {
		this.jiraId = jiraId;
	}

	public String getDocumentationUrl() {
		return documentationUrl;
	}

	public void setDocumentationUrl(String documentationUrl) {
		this.documentationUrl = documentationUrl;
	}

	public String getSubProcessArea() {
		return subProcessArea;
	}

	public void setSubProcessArea(String subProcessArea) {
		this.subProcessArea = subProcessArea;
	}

	public String getSubProcessAreaText() {
		return subProcessAreaText;
	}

	public void setSubProcessAreaText(String subProcessAreaText) {
		this.subProcessAreaText = subProcessAreaText;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	@Override
	public String toString() {
		return "Master [id=" + id + ", ricefwId=" + ricefwId + ", objectTitle=" + objectTitle + ", ricefwDescription="
				+ ricefwDescription + ", landscapeSystem=" + landscapeSystem + ", processArea=" + processArea
				+ ", processAreaText=" + processAreaText + ", objectType=" + objectType + ", objectTypeText="
				+ objectTypeText + ", region=" + region + ", originatingProject=" + originatingProject
				+ ", sourceSystem=" + sourceSystem + ", targetSystem=" + targetSystem + ", middleware=" + middleware
				+ ", isApprovedByLeadPanel=" + isApprovedByLeadPanel + ", requestedBy=" + requestedBy + ", requestedOn="
				+ requestedOn + ", approvalStatus=" + approvalStatus + ", isActive=" + isActive + ", respondedText="
				+ respondedText + ", respondedBy=" + respondedBy + ", respondedOn=" + respondedOn + ", jiraId=" + jiraId
				+ ", documentationUrl=" + documentationUrl + ", subProcessArea=" + subProcessArea
				+ ", subProcessAreaText=" + subProcessAreaText + ", referenceId=" + referenceId + "]";
	}

}
