package com.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.dto.Contract;
import com.test.dto.ContractManager;
import com.test.dto.ContractStatistics;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
@Repository
public class ContractDAOimpl implements ContractDAO {

	public Contract contract;
	public ContractManager contractManager;

	public ContractDAOimpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param ���ID
	 */
	public Contract showContractDetail(int contractID){
		return null;
	}

	/**
	 * 
	 * @param ����ID
	 */
	public List<ContractStatistics> showContractStatistics(int insuranceID){
		return null;
	}

	/**
	 * 
	 * @param ���
	 */
	public int destroyContract(Contract contract){
		return 0;
	}
	
	/**
	 * 
	 * @param �����
	 * @param ���
	 */
	public int payInsurancePayment(int insurancePayment, Contract contract){
		return 0;
	}

	public List<Contract> showAllContractsByInsurance(){
		return null;
	}

	public List<Contract> showAllContractsByWork(){
		return null;
	}

	/**
	 * 
	 * @param ���޾�
	 * @param ���ID
	 */
	public void provideExpectedMoney(int expectedMoney, int contractID){

	}

}