package com.test.dao;

import java.util.List;

import com.test.dto.Contract;
import com.test.dto.ContractStatistics;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public interface ContractDAO {

	/**
	 * 
	 * @param ���ID
	 */
	public Contract showContractDetail(int contractID);

	/**
	 * 
	 * @param ����ID
	 */
	public List<ContractStatistics> showContractStatistics(int insuranceID);

	/**
	 * 
	 * @param ���
	 */
	public int destroyContract(Contract contract);

	/**
	 * 
	 * @param �����
	 * @param ���
	 */
	public int payInsurancePayment(int insurancePayment, Contract contract);

	public List<Contract> showAllContractsByInsurance();

	public List<Contract> showAllContractsByWork();

	/**
	 * 
	 * @param ���޾�
	 * @param ���ID
	 */
	public void provideExpectedMoney(int expectedMoney, int contractID);

}