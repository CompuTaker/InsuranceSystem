package com.test.dto;

public class Insurance {
	
	private int insuranceMoneyLimit;
	private int insuranceID;
	private String name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
