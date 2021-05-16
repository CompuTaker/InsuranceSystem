package com.test.dto;


/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public class ClaimAdjuster {

	private String workPlace;
	private float satisfactionLevel;
	private int team;
	private String claimAdjustingHistory;
	private int claimAdjusterID;
	private String claimAdjusterName;
	private String schedules;
	private String phoneNumber;
	private String jobPosition;
	
	public String getWorkPlace() {
		return workPlace;
	}
	public void setWorkPlace(String workPlace) {
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
	public String getClaimAdjusterName() {
		return claimAdjusterName;
	}
	public void setClaimAdjusterName(String claimAdjusterName) {
		this.claimAdjusterName = claimAdjusterName;
	}
	public String getSchedule() {
		return schedules;
	}
	public void setSchedule(String schedule) {
		this.schedules = schedule;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPosition() {
		return jobPosition;
	}
	public void setPosition(String position) {
		this.jobPosition = position;
	}

}