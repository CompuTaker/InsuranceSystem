package com.test.dto;

public class FireInsurance implements Insurance {
//	  insuranceID INT(11) unsigned NOT NULL AUTO_INCREMENT,
//	  fireProposalID INT(11) unsigned,
//	  insuranceName varchar(32),
//	  explanation varchar(32),
//	  officialDocumentsID INT(11) unsigned,  
	private int insuranceID;
	private int fireProposalID;
	private String insuranceName;
	private String explanation;
	private int officialDocumentsID;
	
	public int getInsuranceID() {
		return insuranceID;
	}
	public void setInsuranceID(int insuranceID) {
		this.insuranceID = insuranceID;
	}
	public int getFireProposalID() {
		return fireProposalID;
	}
	public void setFireProposalID(int fireProposalID) {
		this.fireProposalID = fireProposalID;
	}
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public int getOfficialDocumentsID() {
		return officialDocumentsID;
	}
	public void setOfficialDocumentsID(int officialDocumentsID) {
		this.officialDocumentsID = officialDocumentsID;
	}
	
}
