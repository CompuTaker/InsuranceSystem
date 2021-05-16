package com.test.dto;

public class InjuryInsurance implements Insurance {
	
	private int insuranceID;
	private int injuryProposalID;
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
	public int getOfficialDocumentsID() {
		return officialDocumentsID;
	}
	public void setOfficialDocumentsID(int officialDocumentsID) {
		this.officialDocumentsID = officialDocumentsID;
	}
	
}
