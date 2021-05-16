package com.test.dto;

/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public class OfficalDocuments {
	
	private int officalDocumentsID;
	
//	private File businessMethodReport;
//	private File productSummaryReport;
//	private File condition;
	private byte[] businessMethodReport;
	private byte[] productSummaryReport;
	private byte[] insuranceCondition;
	
	public int getOfficalDocumentsID() {
		return officalDocumentsID;
	}
	public void setOfficalDocumentsID(int officalDocumentsID) {
		this.officalDocumentsID = officalDocumentsID;
	}
	public byte[] getBusinessMethodReport() {
		return businessMethodReport;
	}
	public void setBusinessMethodReport(byte[] businessMethodReport) {
		this.businessMethodReport = businessMethodReport;
	}
	public byte[] getProductSummaryReport() {
		return productSummaryReport;
	}
	public void setProductSummaryReport(byte[] productSummaryReport) {
		this.productSummaryReport = productSummaryReport;
	}
	public byte[] getInsuranceCondition() {
		return insuranceCondition;
	}
	public void setCondition(byte[] insuranceCondition) {
		this.insuranceCondition = insuranceCondition;
	}
	
}