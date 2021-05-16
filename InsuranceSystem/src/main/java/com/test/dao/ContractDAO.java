package com.test.dao;

import java.util.List;
import java.util.Map;

import com.test.dto.Contract;
import com.test.dto.InsurancePayment;
import com.test.dto.InsurancePaymentList;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public interface ContractDAO {
	
	public List<Contract> showAllContract(int customerID);
	public Contract showContractDetail(int contractID);
	public InsurancePaymentList showPaymentList(int insurancePaymentListID);
	public List<InsurancePayment> showPayment(int insurancePaymentListID);
	public int destroyContract(int contractID);
	public int payCard(int paymentAmount, int paymentListID);
	public int makePaymentList(int insurancePayment);
	public int insertContract(Map<String, Object> ctmap);
	
}
