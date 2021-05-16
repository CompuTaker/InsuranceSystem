package com.test.dto;

import java.util.Date;


/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public class InsurancePaymentList {
	
//	private List<InsurancePayment> insurancePaymentList;
	private int insurancePaymentListID;
	private int completedPayment;
	private int uncompletedPayment;
	private Date insurancePaymentPeriod;
	
	public int getInsurancePaymentListID() {
		return insurancePaymentListID;
	}
	public void setInsurancePaymentListID(int insurancePaymentListID) {
		this.insurancePaymentListID = insurancePaymentListID;
	}
	public int getCompletedPayment() {
		return completedPayment;
	}
	public void setCompletedPayment(int completedPayment) {
		this.completedPayment = completedPayment;
	}
	public int getUncompletedPayment() {
		return uncompletedPayment;
	}
	public void setUncompletedPayment(int uncompletedPayment) {
		this.uncompletedPayment = uncompletedPayment;
	}
	public Date getInsurancePaymentPeriod() {
		return insurancePaymentPeriod;
	}
	public void setInsurancePaymentPeriod(Date insurancePaymentPeriod) {
		this.insurancePaymentPeriod = insurancePaymentPeriod;
	}
	
}