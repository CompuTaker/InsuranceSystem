package com.test.dto;

import java.io.File;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public class Proposal {

	private File VerificationDocuments;
	private int verificationDocumentListID;
	private boolean isInternalApproved;
	private int insuranceDeveloperTeamID;
	private String insuranceName;
	private String insuranceType;
	private boolean isExternalApproved;
	private String proposalContent;
	private int proposalID;
	private String proposalName;

	public int getVerificationDocumentID() {
		return verificationDocumentListID;
	}
	public void setVerificationDocumentID(int verificationDocumentID) {
		verificationDocumentListID = verificationDocumentID;
	}
	public boolean isInternalApproved() {
		return isInternalApproved;
	}
	public void setInternalApproved(boolean isInternalApproved) {
		this.isInternalApproved = isInternalApproved;
	}
	public int getInsuranceDeveloperTeamID() {
		return insuranceDeveloperTeamID;
	}
	public void setInsuranceDeveloperTeamID(int insuranceDeveloperTeamID) {
		this.insuranceDeveloperTeamID = insuranceDeveloperTeamID;
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
	public boolean isExternalApproved() {
		return isExternalApproved;
	}
	public void setExternalApproved(boolean isExternalApproved) {
		this.isExternalApproved = isExternalApproved;
	}
	public String getProposalContent() {
		return proposalContent;
	}
	public void setProposalContent(String proposalContent) {
		this.proposalContent = proposalContent;
	}
	public int getProposalID() {
		return proposalID;
	}
	public void setProposalID(int proposalID) {
		this.proposalID = proposalID;
	}
	public String getProposalName() {
		return proposalName;
	}
	public void setProposalName(String proposalName) {
		this.proposalName = proposalName;
	}
	public File getVerificationDocuments() {
		return VerificationDocuments;
	}
	public void setVerificationDocuments(File verificationDocuments) {
		VerificationDocuments = verificationDocuments;
	}
	public int getVerificationDocumentListID() {
		return verificationDocumentListID;
	}
	public void setVerificationDocumentListID(int verificationDocumentListID) {
		this.verificationDocumentListID = verificationDocumentListID;
	}

}