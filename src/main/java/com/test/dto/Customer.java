package com.test.dto;

import java.util.List;

import com.test.enumeration.IllHistory;
import com.test.enumeration.Job;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class Customer {

	private int familyIllHistory;
	private String loginID;
	private int customerID;
	private boolean advertisementAcceptance;
	private int age;
	private List<IllHistory> illHistory;
	private String password;
	private List<AccidentHistory> accidentHistoryList;
	private int gender;
	private int salesmanID;
	private String name;
	private String email;
	private int property;
	private String socialSecurityNumber;
	private String address;
	private Job job;
	
	public int getFamilyIllHistory() {
		return familyIllHistory;
	}
	public void setFamilyIllHistory(int familyIllHistory) {
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
	public List<IllHistory> getIllHistory() {
		return illHistory;
	}
	public void setIllHistory(List<IllHistory> illHistory) {
		this.illHistory = illHistory;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<AccidentHistory> getAccidentHistoryList() {
		return accidentHistoryList;
	}
	public void setAccidentHistoryList(List<AccidentHistory> accidentHistoryList) {
		this.accidentHistoryList = accidentHistoryList;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
}