package com.test.dto;

public class InjuryInsurance implements Insurance {
	
	private int insuranceID;
	private int injuryProposalID;
	private String insuranceName;
	private String explanation;
	private int officialDocumentsID;
	
	public int getInsuranceID() {
		return insuranceID;
	}
	public void setInsuranceID(int insuranceID) {
		this.insuranceID = insuranceID;
	}
	public int getInjuryProposalID() {
		return injuryProposalID;
	}
	public void setInjuryProposalID(int injuryProposalID) {
		this.injuryProposalID = injuryProposalID;
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
