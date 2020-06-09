package com.test.dto;


/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public class Counsel {

	private int customerID;
	private int counselID;
	private String counselDate;
	private String counselContent;
	private String counselTopic;
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getCounselID() {
		return counselID;
	}
	public void setCounselID(int counselID) {
		this.counselID = counselID;
	}
	public String getCounselDate() {
		return counselDate;
	}
	public void setCounselDate(String counselDate) {
		this.counselDate = counselDate;
	}
	public String getCounselContent() {
		return counselContent;
	}
	public void setCounselContent(String counselContent) {
		this.counselContent = counselContent;
	}
	public String getCounselTopic() {
		return counselTopic;
	}
	public void setCounselTopic(String counselTopic) {
		this.counselTopic = counselTopic;
	}

}