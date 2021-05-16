package com.test.dto;

import java.io.File;
import java.util.Date;

import com.test.enumeration.AccidentType;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public class Accident {
	
	private int accidentID;
	private int customerID;
	private int accidentHistoryID;
	private String accidentCause;
	private String accidentPeopleInformation;
	private Date accidentDate;
	private int accidentManagerID;
	private String accidentLocation;
//	private AccidentType accidentType;
	private String accidentType;
	private byte[] accidentPhoto;
	private int claimAdjusterID;
	private int requestedInsuranceMoney;
	private String damageScale;
	
	public int getAccidentID() {
		return accidentID;
	}
	public void setAccidentID(int accidentID) {
		this.accidentID = accidentID;
	}
	public int getAccidentHistoryID() {
		return accidentHistoryID;
	}
	public void setAccidentHistoryID(int accidentHistoryID) {
		this.accidentHistoryID = accidentHistoryID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getAccidentCause() {
		return accidentCause;
	}
	public void setAccidentCause(String accidentCause) {
		this.accidentCause = accidentCause;
	}
	public String getAccidentPeopleInformation() {
		return accidentPeopleInformation;
	}
	public void setAccidentPeopleInformation(String accidentPeopleInformation) {
		this.accidentPeopleInformation = accidentPeopleInformation;
	}
	public Date getAccidentDate() {
		return accidentDate;
	}
	public void setAccidentDate(Date accidentDate) {
		this.accidentDate = accidentDate;
	}
	public int getAccidentManagerID() {
		return accidentManagerID;
	}
	public void setAccidentManagerID(int accidentManagerID) {
		this.accidentManagerID = accidentManagerID;
	}
	public String getAccidentLocation() {
		return accidentLocation;
	}
	public void setAccidentLocation(String accidentLocation) {
		this.accidentLocation = accidentLocation;
	}
	public String getAccidentType() {
		return accidentType;
	}
	public void setAccidentType(String accidentType) {
		this.accidentType = accidentType;
	}
	public byte[] getAccidentPhoto() {
		return accidentPhoto;
	}
	public void setAccidentPhoto(byte[] accidentPhoto) {
		this.accidentPhoto = accidentPhoto;
	}
	public int getClaimAdjusterID() {
		return claimAdjusterID;
	}
	public void setClaimAdjusterID(int claimAdjusterID) {
		this.claimAdjusterID = claimAdjusterID;
	}
	public int getRequestedInsuranceMoney() {
		return requestedInsuranceMoney;
	}
	public void setRequestedInsuranceMoney(int requestedInsuranceMoney) {
		this.requestedInsuranceMoney = requestedInsuranceMoney;
	}
	public String getDamageScale() {
		return damageScale;
	}
	public void setDamageScale(String damageScale) {
		this.damageScale = damageScale;
	}

}