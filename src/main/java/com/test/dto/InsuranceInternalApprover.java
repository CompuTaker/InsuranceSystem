package com.test.dto;

/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public class InsuranceInternalApprover {

	private int insuranceInternalApproverID;
	private String team;
	private String insuranceInternalApproverName;
	private String jobPosition;
	
	public int getInsuranceInternalApproverID() {
		return insuranceInternalApproverID;
	}
	public void setInsuranceInternalApproverID(int insuranceInternalApproverID) {
		this.insuranceInternalApproverID = insuranceInternalApproverID;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getInsuranceInternalApproverName() {
		return insuranceInternalApproverName;
	}
	public void setInsuranceInternalApproverName(String insuranceInternalApproverName) {
		this.insuranceInternalApproverName = insuranceInternalApproverName;
	}
	public String getJobPosition() {
		return jobPosition;
	}
	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

}