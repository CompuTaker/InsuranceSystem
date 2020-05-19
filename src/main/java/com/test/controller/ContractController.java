package com.test.controller;

import java.util.List;

import com.test.dao.ContractDAO;
import com.test.dao.ContractStatisticsDAO;
import com.test.dao.CustomerDAO;
import com.test.dao.InsuranceDAO;
import com.test.dto.Contract;
import com.test.dto.ContractStatistics;
import com.test.dto.Customer;
import com.test.dto.Insurance;
import com.test.dto.InsurancePaymentList;
import com.test.dto.Salesman;


/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class ContractController {

	public CustomerDAO customerDAO;
	public ContractDAO contractDAO;
	public InsuranceDAO insuranceDAO;
	public ContractStatisticsDAO contractStatisticsDAO;

	public ContractController(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param �����������ID
	 * @param ���ID
	 */
	public int assignContractManager(int contractID, int contractManagerID){
		return 0;
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
	 * @param ���
	 */
	public int modifyContract(Contract contract){
		return 0;
	}

	/**
	 * 
	 * @param ����
	 */
	public List<ContractStatistics> showContractStatistics(Insurance insurance){
		return null;
	}

	/**
	 * 
	 * @param ���ID
	 */
	public int destroyContract(int contractID){
		return 0;
	}

	/**
	 * 
	 * @param �������
	 * @param �����ǰ
	 * @param ��
	 */
	public Contract joinInsurance(Salesman salesman, Insurance insurance, Customer customer){
		return null;
	}

	/**
	 * 
	 * @param ���
	 */
	public InsurancePaymentList showInsurancePaymentList(Contract contract){
		return null;
	}

	/**
	 * 
	 * @param ���αݾ�
	 * @param ���
	 */
	public int payInsurancePayment(int insurancePayment, Contract contract){
		return 0;
	}

	public List<Contract> showAllContractsByInsurance(){
		return null;
	}

	/**
	 * 
	 * @param ����
	 * @param ��
	 */
	public String sendConditionMail(Insurance insurance, Customer customer){
		return "";
	}

	public List<Contract> showAllContractsByWork(){
		return null;
	}

	/**
	 * 
	 * @param ���ID
	 */
	public Contract renewContract(int contractID){
		return null;
	}

	public int postponeExpectedMoney(){
		return 0;
	}

	/**
	 * 
	 * @param ���޾�
	 * @param ���ID
	 */
	public int provideExpectedMoney(int expectedMoney, int contractID){
		return 0;
	}

}