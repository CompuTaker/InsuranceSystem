package com.test.dto;

/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public class InsurnaceInternalApprover {

	/**
	 * @author Administrator
	 * @version 1.0
	 * @created 12-5-2020 ���� 4:22:13
	 */

	private int insuranceInternalApproverID;
	private int team;
	private int name;
	private int position;
	
	public int getInsuranceInternalApproverID() {
		return insuranceInternalApproverID;
	}
	public void setInsuranceInternalApproverID(int insuranceInternalApproverID) {
		this.insuranceInternalApproverID = insuranceInternalApproverID;
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
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}

}