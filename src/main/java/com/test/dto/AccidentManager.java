package com.test.dto;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public class AccidentManager {

	private String workPlace;
	private int accidentManagerID;
	private int team;
	private String accidentManagerName;
	private String phoneNumber;
	private String jobPosition;
	
	public String getWorkPlace() {
		return workPlace;
	}
	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}
	public int getAccidentManagerID() {
		return accidentManagerID;
	}
	public void setAccidentManagerID(int accidentManagerID) {
		this.accidentManagerID = accidentManagerID;
	}
	public int getTeam() {
		return team;
	}
	public void setTeam(int team) {
		this.team = team;
	}
	public String getAccidentManagerName() {
		return accidentManagerName;
	}
	public void setAccidentManagerName(String accidentManagerName) {
		this.accidentManagerName = accidentManagerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getJobPosition() {
		return jobPosition;
	}
	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}
	
}