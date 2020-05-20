package com.test.dto;


/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public class InsuranceDeveloper {

	private int insuranceDeveloperID;
	private int insuranceDeveloperTeamID;
	private String insuranceDeveloperName;
	private int jobPosition;
	
	public int getInsuranceDeveloperID() {
		return insuranceDeveloperID;
	}
	public void setInsuranceDeveloperID(int insuranceDeveloperID) {
		this.insuranceDeveloperID = insuranceDeveloperID;
	}
	public int getInsuranceDeveloperTeamID() {
		return insuranceDeveloperTeamID;
	}
	public void setInsuranceDeveloperTeamID(int insuranceDeveloperTeamID) {
		this.insuranceDeveloperTeamID = insuranceDeveloperTeamID;
	}
	public String getInsuranceDeveloperName() {
		return insuranceDeveloperName;
	}
	public void setInsuranceDeveloperName(String insuranceDeveloperName) {
		this.insuranceDeveloperName = insuranceDeveloperName;
	}
	public int getJobPosition() {
		return jobPosition;
	}
	public void setJobPosition(int jobPosition) {
		this.jobPosition = jobPosition;
	}
	
}