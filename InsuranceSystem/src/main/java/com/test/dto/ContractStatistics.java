package com.test.dto;


/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class ContractStatistics {

	private int totalCustomerCount;
	private float contractRenewRate;
	private int insuranceID;
	private float collectionRate;
	private float actualEfficiency;
	private float salesBalance;
	private float maintainRate;
	private int totalInsuranceMoney;
	private int totalRefundMoney;
	
	public int getTotalCustomerCount() {
		return totalCustomerCount;
	}
	public void setTotalCustomerCount(int totalCustomerCount) {
		this.totalCustomerCount = totalCustomerCount;
	}
	public float getContractRenewRate() {
		return contractRenewRate;
	}
	public void setContractRenewRate(float contractRenewRate) {
		this.contractRenewRate = contractRenewRate;
	}
	public int getInsuranceID() {
		return insuranceID;
	}
	public void setInsuranceID(int insuranceID) {
		this.insuranceID = insuranceID;
	}
	public float getCollectionRate() {
		return collectionRate;
	}
	public void setCollectionRate(float collectionRate) {
		this.collectionRate = collectionRate;
	}
	public float getActualEfficiency() {
		return actualEfficiency;
	}
	public void setActualEfficiency(float actualEfficiency) {
		this.actualEfficiency = actualEfficiency;
	}
	public float getSalesBalance() {
		return salesBalance;
	}
	public void setSalesBalance(float salesBalance) {
		this.salesBalance = salesBalance;
	}
	public float getMaintainRate() {
		return maintainRate;
	}
	public void setMaintainRate(float maintainRate) {
		this.maintainRate = maintainRate;
	}
	public int getTotalInsuranceMoney() {
		return totalInsuranceMoney;
	}
	public void setTotalInsuranceMoney(int totalInsuranceMoney) {
		this.totalInsuranceMoney = totalInsuranceMoney;
	}
	public int getTotalRefundMoney() {
		return totalRefundMoney;
	}
	public void setTotalRefundMoney(int totalRefundMoney) {
		this.totalRefundMoney = totalRefundMoney;
	}
}