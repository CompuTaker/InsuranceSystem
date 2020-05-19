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

	private int customerID;
	private int accidentID;
	private String accidentCause;
	private String accidentPeopleInformation;
	private Date accidentDate;
	private int accidentManagerID;
	private String accidentLocation;
	private AccidentType accidentType;
	private File accidentPhoto;
	private int claimAdjusterID;
	private int requestedInsuranceMoney;
	private String damageScale;
	public ClaimAdjuster claimAdjuster;
	public AccidentManager accidentManager;
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getAccidentID() {
		return accidentID;
	}
	public void setAccidentID(int accidentID) {
		this.accidentID = accidentID;
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
	public AccidentType getAccidentType() {
		return accidentType;
	}
	public void setAccidentType(AccidentType accidentType) {
		this.accidentType = accidentType;
	}
	public File getAccidentPhoto() {
		return accidentPhoto;
	}
	public void setAccidentPhoto(File accidentPhoto) {
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
	public ClaimAdjuster getClaimAdjuster() {
		return claimAdjuster;
	}
	public void setClaimAdjuster(ClaimAdjuster claimAdjuster) {
		this.claimAdjuster = claimAdjuster;
	}
	public AccidentManager getAccidentManager() {
		return accidentManager;
	}
	public void setAccidentManager(AccidentManager accidentManager) {
		this.accidentManager = accidentManager;
	}

}