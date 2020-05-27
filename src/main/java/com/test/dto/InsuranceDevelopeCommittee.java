package com.test.dto;


/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public class InsuranceDevelopeCommittee extends InsuranceInternalApprover {

	private String careerHistory;
	private String major;
	
	public String getCareerHistory() {
		return careerHistory;
	}
	public void setCareerHistory(String careerHistory) {
		this.careerHistory = careerHistory;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}