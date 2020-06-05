package com.test.dao;

import java.util.List; 

import com.test.dto.Contract;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public interface ContractDAO {
	
	public List<Contract> showAllContract(int customerID);
	
}