package com.test.dto;

public class FireInsurance implements Insurance {
//	  insuranceID INT(11) unsigned NOT NULL AUTO_INCREMENT,
//	  fireProposalID INT(11) unsigned,
//	  insuranceName varchar(32),
//	  explanation varchar(32),
//	  officialDocumentsID INT(11) unsigned,  
	private int insuranceID;
	private int fireProposalID;
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
	public int getOfficialDocumentsID() {
		return officialDocumentsID;
	}
	public void setOfficialDocumentsID(int officialDocumentsID) {
		this.officialDocumentsID = officialDocumentsID;
	}
	
}
