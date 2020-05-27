package com.test.dto;

public class VehicleInsurance implements Insurance {
	
	private int insuranceID;
	private int vehicleProposalID;
	private String insuranceName;
	private String explanation;
	private int officialDocumentsID;
	
	public int getInsuranceID() {
		return insuranceID;
	}
	public void setInsuranceID(int insuranceID) {
		this.insuranceID = insuranceID;
	}
	public int getVehicleProposalID() {
		return vehicleProposalID;
	}
	public void setVehicleProposalID(int vehicleProposalID) {
		this.vehicleProposalID = vehicleProposalID;
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
