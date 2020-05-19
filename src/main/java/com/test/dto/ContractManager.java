package com.test.dto;


/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class ContractManager {

	private int contractManagerID;
	private String contractManagerName;
	private String name;
	private String jobPosition;
	
	public int getContractManagerID() {
		return contractManagerID;
	}
	public void setContractManagerID(int contractManagerID) {
		this.contractManagerID = contractManagerID;
	}
	public String getContractManagerName() {
		return contractManagerName;
	}
	public void setContractManagerName(String contractManagerName) {
		this.contractManagerName = contractManagerName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobPosition() {
		return jobPosition;
	}
	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

}