package com.test.dto;


/**
 * @author ghaga
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public class Recipient {

	private int recipientID;
	private String recipientName;
	private String recipientSocialSecurityNumber;
	
	public int getRecipientID() {
		return recipientID;
	}
	public void setRecipientID(int recipientID) {
		this.recipientID = recipientID;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getRecipientSocialSecurityNumber() {
		return recipientSocialSecurityNumber;
	}
	public void setRecipientSocialSecurityNumber(String recipientSocialSecurityNumber) {
		this.recipientSocialSecurityNumber = recipientSocialSecurityNumber;
	}

}