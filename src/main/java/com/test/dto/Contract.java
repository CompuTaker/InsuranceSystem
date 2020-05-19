package com.test.dto;

import java.util.Date;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class Contract extends Insurance {

	private int contractID;
	private int contractManagerID;
	private Date contractExpirationDate;
	private int customerID;
	private float lossRate;
	private String profitabilityRating;
	private int salesmanID;
	private int remainingExpectedMoney;
	private int compensationHistory;
	private int insurancePayment;
	private float discountRate;
	private float extraChargeRate;
	private Date contractRemainingPeriod;
	
//	private Recipient recipient;
//	private PaymentType paymentType;
//	private CompensationType compensationType;
//	private InsurancePaymentList insurancePaymentList;
//	private List<File> insuranceDocuments;
//	private Bank bank;
	private int recipientID;
	private String paymentType;
	private String compensationType;
	private int insurancePaymentListID;
	private int insuranceDocumentListID;
	private String bank;
	
	public int getContractID() {
		return contractID;
	}
	public void setContractID(int contractID) {
		this.contractID = contractID;
	}
	public int getContractManagerID() {
		return contractManagerID;
	}
	public void setContractManagerID(int contractManagerID) {
		this.contractManagerID = contractManagerID;
	}
	public Date getContractExpirationDate() {
		return contractExpirationDate;
	}
	public void setContractExpirationDate(Date contractExpirationDate) {
		this.contractExpirationDate = contractExpirationDate;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public float getLossRate() {
		return lossRate;
	}
	public void setLossRate(float lossRate) {
		this.lossRate = lossRate;
	}
	public String getProfitabilityRating() {
		return profitabilityRating;
	}
	public void setProfitabilityRating(String profitabilityRating) {
		this.profitabilityRating = profitabilityRating;
	}
	public int getSalesmanID() {
		return salesmanID;
	}
	public void setSalesmanID(int salesmanID) {
		this.salesmanID = salesmanID;
	}
	public int getRemainingExpectedMoney() {
		return remainingExpectedMoney;
	}
	public void setRemainingExpectedMoney(int remainingExpectedMoney) {
		this.remainingExpectedMoney = remainingExpectedMoney;
	}
	public int getCompensationHistory() {
		return compensationHistory;
	}
	public void setCompensationHistory(int compensationHistory) {
		this.compensationHistory = compensationHistory;
	}
	public int getInsurancePayment() {
		return insurancePayment;
	}
	public void setInsurancePayment(int insurancePayment) {
		this.insurancePayment = insurancePayment;
	}
	public float getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}
	public float getExtraChargeRate() {
		return extraChargeRate;
	}
	public void setExtraChargeRate(float extraChargeRate) {
		this.extraChargeRate = extraChargeRate;
	}
	public Date getContractRemainingPeriod() {
		return contractRemainingPeriod;
	}
	public void setContractRemainingPeriod(Date contractRemainingPeriod) {
		this.contractRemainingPeriod = contractRemainingPeriod;
	}
	public int getRecipientID() {
		return recipientID;
	}
	public void setRecipientID(int recipientID) {
		this.recipientID = recipientID;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getCompensationType() {
		return compensationType;
	}
	public void setCompensationType(String compensationType) {
		this.compensationType = compensationType;
	}
	public int getInsurancePaymentListID() {
		return insurancePaymentListID;
	}
	public void setInsurancePaymentListID(int insurancePaymentListID) {
		this.insurancePaymentListID = insurancePaymentListID;
	}
	public int getInsuranceDocumentListID() {
		return insuranceDocumentListID;
	}
	public void setInsuranceDocumentListID(int insuranceDocumentListID) {
		this.insuranceDocumentListID = insuranceDocumentListID;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
}