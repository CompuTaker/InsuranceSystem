package com.test.dto;


/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public class ClaimAdjuster {

	private int workPlace;
	private float satisfactionLevel;
	private int team;
	private String claimAdjustingHistory;
	private int claimAdjusterID;
	private String name;
	private String schedule;
	private String phoneNumber;
	private String position;
	
	public int getWorkPlace() {
		return workPlace;
	}
	public void setWorkPlace(int workPlace) {
		this.workPlace = workPlace;
	}
	public float getSatisfactionLevel() {
		return satisfactionLevel;
	}
	public void setSatisfactionLevel(float satisfactionLevel) {
		this.satisfactionLevel = satisfactionLevel;
	}
	public int getTeam() {
		return team;
	}
	public void setTeam(int team) {
		this.team = team;
	}
	public String getClaimAdjustingHistory() {
		return claimAdjustingHistory;
	}
	public void setClaimAdjustingHistory(String claimAdjustingHistory) {
		this.claimAdjustingHistory = claimAdjustingHistory;
	}
	public int getClaimAdjusterID() {
		return claimAdjusterID;
	}
	public void setClaimAdjusterID(int claimAdjusterID) {
		this.claimAdjusterID = claimAdjusterID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

}