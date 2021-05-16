package com.test.dao;

import java.util.List;

import com.test.dto.ContractManager;

public interface ContractManagerDAO {
	
	abstract public List<String> getContractManagerName(int contractManagerID);
	
	abstract public List<String> showCustomerContractManager(List<Integer> allContractManager);
	
	abstract public String showDetailContractManagerName(int contractManagerID);

}
