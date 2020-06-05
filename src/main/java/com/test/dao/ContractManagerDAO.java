package com.test.dao;

import java.util.List;

import com.test.dto.ContractManager;

public interface ContractManagerDAO {
	
	abstract public List<String> getContractManagerName(int contractManagerID);
	
	public List<String> showCustomerContractManager(List<Integer> allContractManager);

}
