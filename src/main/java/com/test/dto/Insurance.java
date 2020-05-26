package com.test.dto;

public class Insurance {
	
	private int insuranceMoneyLimit;
	private int insuranceID;
	private String insuranceName;
	private String insuranceType;
	private String explanation;
	// insurance is one
	private int officalDocumentsID; // one to many
	// private File businessMethodReport;
	// private File productSummaryReport;
	// private File condition;
	
	public int getInsuranceMoneyLimit() {
		return insuranceMoneyLimit;
	}
	public void setInsuranceMoneyLimit(int insuranceMoneyLimit) {
		this.insuranceMoneyLimit = insuranceMoneyLimit;
	}
	public int getInsuranceID() {
		return insuranceID;
	}
	public void setInsuranceID(int insuranceID) {
		this.insuranceID = insuranceID;
	}
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public int getOfficalDocumentsID() {
		return officalDocumentsID;
	}
	public void setOfficalDocuments(int officalDocumentsID) {
		this.officalDocumentsID = officalDocumentsID;
	}
	
}
