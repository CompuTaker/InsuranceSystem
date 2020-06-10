package com.test.dao;

import java.util.HashMap;
import java.util.List;

import com.test.dto.CustomerForSales;

public interface CustomerForSalesDAO {
	
	public List<CustomerForSales> listAllCustomerForSales();
	
	public List<CustomerForSales> listCustomerForSalesBySalesmanID(int salesmanID);

	public int insertCustomerForSales(HashMap<String, Object> rmap);
	
}
