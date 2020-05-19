package com.test.added;

public class VerificationDocument {
	
	private int verificationDocumentListID;
	private int verificationDocumentID;
	
//	private File VerificationDocument;
	private byte[] verificationDocument;
	
	public int getVerificationDocumentListID() {
		return verificationDocumentListID;
	}
	public void setVerificationDocumentListID(int verificationDocumentListID) {
		this.verificationDocumentListID = verificationDocumentListID;
	}
	public int getVerificationDocumentID() {
		return verificationDocumentID;
	}
	public void setVerificationDocumentID(int verificationDocumentID) {
		this.verificationDocumentID = verificationDocumentID;
	}
	public byte[] getVerificationDocument() {
		return verificationDocument;
	}
	public void setVerificationDocument(byte[] verificationDocument) {
		this.verificationDocument = verificationDocument;
	}
	
}
