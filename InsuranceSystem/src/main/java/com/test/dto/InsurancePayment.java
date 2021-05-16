package com.test.dto;

import java.util.Date;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public class InsurancePayment {
	
	private int insurancePaymentID;
	private int insurancePaymentListID;
	private Date insurancePaymentDate;
	private int oneTimeInsurancePayment;
	
	public int getInsurancePaymentID() {
		return insurancePaymentID;
	}
	public void setInsurancePaymentID(int insurancePaymentID) {
		this.insurancePaymentID = insurancePaymentID;
	}
	public int getInsurancePaymentListID() {
		return insurancePaymentListID;
	}
	public void setInsurancePaymentListID(int insurancePaymentListID) {
		this.insurancePaymentListID = insurancePaymentListID;
	}
	public Date getInsurancePaymentDate() {
		return insurancePaymentDate;
	}
	public void setInsurancePaymentDate(Date insurancePaymentDate) {
		this.insurancePaymentDate = insurancePaymentDate;
	}
	public int getOneTimeInsurancePayment() {
		return oneTimeInsurancePayment;
	}
	public void setOneTimeInsurancePayment(int oneTimeInsurancePayment) {
		this.oneTimeInsurancePayment = oneTimeInsurancePayment;
	}
	
}