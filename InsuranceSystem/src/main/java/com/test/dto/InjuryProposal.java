package com.test.dto;

public class InjuryProposal implements Proposal { // extends Proposal
	
	private int injuryProposalID;
	private int injuryCoverage;
	private int illCoverage;
	// familyIllHistory
	private float familyBrainRate;
	private float familyHeartRate;
	private float familyCancerRate;
	// illHistory
	private float brainRate;
	private float heartRate; // default 1.0
	private float cancerRate;
	// gender
	private float manRate;
	private float womanRate;
	// job
	private float fieldJobRate;
	private float officeJobRate;
	private float noJobRate;
	private float dangerousJobRate;
	// Proposal
	private String proposalName;
	private byte[] verificationDocuments;
	private int isInternalApproved;
	private int insuranceDeveloperTeamID;
	private String insuranceType;
	private int isExternalApproved;
	private String proposalContent;
	
	public int getInjuryProposalID() {
		return injuryProposalID;
	}
	public void setInjuryProposalID(int injuryProposalID) {
		this.injuryProposalID = injuryProposalID;
	}
	public float getInjuryCoverage() {
		return injuryCoverage;
	}
	public void setInjuryCoverage(int injuryCoverage) {
		this.injuryCoverage = injuryCoverage;
	}
	public int getIllCoverage() {
		return illCoverage;
	}
	public void setIllCoverage(int illCoverage) {
		this.illCoverage = illCoverage;
	}
	public float getFamilyBrainRate() {
		return familyBrainRate;
	}
	public void setFamilyBrainRate(float familyBrainRate) {
		this.familyBrainRate = familyBrainRate;
	}
	public float getFamilyHeartRate() {
		return familyHeartRate;
	}
	public void setFamilyHeartRate(float familyHeartRate) {
		this.familyHeartRate = familyHeartRate;
	}
	public float getFamilyCancerRate() {
		return familyCancerRate;
	}
	public void setFamilyCancerRate(float familyCancerRate) {
		this.familyCancerRate = familyCancerRate;
	}
	public float getBrainRate() {
		return brainRate;
	}
	public void setBrainRate(float brainRate) {
		this.brainRate = brainRate;
	}
	public float getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(float heartRate) {
		this.heartRate = heartRate;
	}
	public float getCancerRate() {
		return cancerRate;
	}
	public void setCancerRate(float cancerRate) {
		this.cancerRate = cancerRate;
	}
	public float getManRate() {
		return manRate;
	}
	public void setManRate(float manRate) {
		this.manRate = manRate;
	}
	public float getWomanRate() {
		return womanRate;
	}
	public void setWomanRate(float womanRate) {
		this.womanRate = womanRate;
	}
	public float getFieldJobRate() {
		return fieldJobRate;
	}
	public void setFieldJobRate(float fieldJobRate) {
		this.fieldJobRate = fieldJobRate;
	}
	public float getOfficeJobRate() {
		return officeJobRate;
	}
	public void setOfficeJobRate(float officeJobRate) {
		this.officeJobRate = officeJobRate;
	}
	public float getNoJobRate() {
		return noJobRate;
	}
	public void setNoJobRate(float noJobRate) {
		this.noJobRate = noJobRate;
	}
	public float getDangerousJobRate() {
		return dangerousJobRate;
	}
	public void setDangerousJobRate(float dangerousJobRate) {
		this.dangerousJobRate = dangerousJobRate;
	}
	public String getProposalName() {
		return proposalName;
	}
	public void setProposalName(String proposalName) {
		this.proposalName = proposalName;
	}
	public byte[] getVerificationDocuments() {
		return verificationDocuments;
	}
	public void setVerificationDocuments(byte[] verificationDocuments) {
		this.verificationDocuments = verificationDocuments;
	}
	public int isInternalApproved() {
		return isInternalApproved;
	}
	public void setInternalApproved(int isInternalApproved) {
		this.isInternalApproved = isInternalApproved;
	}
	public int getInsuranceDeveloperTeamID() {
		return insuranceDeveloperTeamID;
	}
	public void setInsuranceDeveloperTeamID(int insuranceDeveloperTeamID) {
		this.insuranceDeveloperTeamID = insuranceDeveloperTeamID;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public int isExternalApproved() {
		return isExternalApproved;
	}
	public void setExternalApproved(int isExternalApproved) {
		this.isExternalApproved = isExternalApproved;
	}
	public String getProposalContent() {
		return proposalContent;
	}
	public void setProposalContent(String proposalContent) {
		this.proposalContent = proposalContent;
	}
	
}
