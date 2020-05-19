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
	private int name;
	private String phoneNumber;
	private int position;
	
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
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
}