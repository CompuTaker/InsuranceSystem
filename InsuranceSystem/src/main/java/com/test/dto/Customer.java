package com.test.dto;

import com.test.enumeration.Job;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class Customer {

//	private int familyIllHistory;
	private String familyIllHistory;
	private String loginID;
	private int customerID;
	private boolean advertisementAcceptance;
	private int age;
//	private List<IllHistory> illHistory;
	private String illHistory;
	private String loginPassword;
//	private List<AccidentHistory> accidentHistoryList;
	private int accidentHistoryID;
	private int gender;
	private int salesmanID;
	private String customerName;
	private String email;
	private int property;
	private String socialSecurityNumber;
	private String address;
//	private Job job;
	private String job;
	
	public String getFamilyIllHistory() {
		return familyIllHistory;
	}
	public void setFamilyIllHistory(String familyIllHistory) {
		this.familyIllHistory = familyIllHistory;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public boolean isAdvertisementAcceptance() {
		return advertisementAcceptance;
	}
	public void setAdvertisementAcceptance(boolean advertisementAcceptance) {
		this.advertisementAcceptance = advertisementAcceptance;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getIllHistory() {
		return illHistory;
	}
	public void setIllHistory(String illHistory) {
		this.illHistory = illHistory;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getSalesmanID() {
		return salesmanID;
	}
	public void setSalesmanID(int salesmanID) {
		this.salesmanID = salesmanID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getProperty() {
		return property;
	}
	public void setProperty(int property) {
		this.property = property;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAccidentHistoryID() {
		return accidentHistoryID;
	}
	public void setAccidentHistoryID(int accidentHistoryID) {
		this.accidentHistoryID = accidentHistoryID;
	}
	
}