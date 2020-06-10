package com.test.dto;

public class CustomerForSales {
	
	private int customerForSalesID;
	private String customerForSalesName;
	private String customerForSalesSocialSecurityNumber;
	private int salesmanID;
	
	public int getCustomerForSalesID() {
		return customerForSalesID;
	}
	public void setCustomerForSalesID(int customerForSalesID) {
		this.customerForSalesID = customerForSalesID;
	}
	public String getCustomerForSalesName() {
		return customerForSalesName;
	}
	public void setCustomerForSalesName(String customerForSalesName) {
		this.customerForSalesName = customerForSalesName;
	}
	public String getCustomerForSalesSocialSecurityNumber() {
		return customerForSalesSocialSecurityNumber;
	}
	public void setCustomerForSalesSocialSecurityNumber(String customerForSalesSocialSecurityNumber) {
		this.customerForSalesSocialSecurityNumber = customerForSalesSocialSecurityNumber;
	}
	public int getSalesmanID() {
		return salesmanID;
	}
	public void setSalesmanID(int salesmanID) {
		this.salesmanID = salesmanID;
	}
	
}
