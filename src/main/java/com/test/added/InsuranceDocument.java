package com.test.added;

public class InsuranceDocument {
	
	private int insuranceDocumentListID;
	private int insuranceDocumentID;
	
//	private File VerificationDocument;
	private byte[] insuranceDocument;
	
	public int getInsuranceDocumentListID() {
		return insuranceDocumentListID;
	}
	public void setInsuranceDocumentListID(int insuranceDocumentListID) {
		this.insuranceDocumentListID = insuranceDocumentListID;
	}
	public int getInsuranceDocumentID() {
		return insuranceDocumentID;
	}
	public void setInsuranceDocumentID(int insuranceDocumentID) {
		this.insuranceDocumentID = insuranceDocumentID;
	}
	public byte[] getInsuranceDocument() {
		return insuranceDocument;
	}
	public void setInsuranceDocument(byte[] insuranceDocument) {
		this.insuranceDocument = insuranceDocument;
	}
	
}
