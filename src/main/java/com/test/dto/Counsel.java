package com.test.dto;


/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public class Counsel {

	private int customerID;
	private int conselID;
	private String conselDate;
	private String conselContent;
	private String conselTopic;
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getConselID() {
		return conselID;
	}
	public void setConselID(int conselID) {
		this.conselID = conselID;
	}
	public String getConselDate() {
		return conselDate;
	}
	public void setConselDate(String conselDate) {
		this.conselDate = conselDate;
	}
	public String getConselContent() {
		return conselContent;
	}
	public void setConselContent(String conselContent) {
		this.conselContent = conselContent;
	}
	public String getConselTopic() {
		return conselTopic;
	}
	public void setConselTopic(String conselTopic) {
		this.conselTopic = conselTopic;
	}

}