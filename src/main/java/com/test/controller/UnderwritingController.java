package com.test.controller;

import com.test.dto.Contract;
import com.test.dto.Customer;
import com.test.dto.Insurance;
import com.test.dto.UnderWriter;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class UnderwritingController {

	public UnderwritingController(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param ���Ѹ�
	 */
	public int reviewCustomerJoin(Customer customer){
		return 0;
	}

	/**
	 * 
	 * @param UnderWriter
	 * @param ��
	 * @param ����
	 */
	public int underWriteCustomer(UnderWriter underWriter, Customer customer, Insurance insurance){
		return 0;
	}

	/**
	 * 
	 * @param ��
	 */
	public int rejectCustomer(Customer customer){
		return 0;
	}

	/**
	 * 
	 * @param ��
	 */
	public Contract approveCustomer(Customer customer){
		return null;
	}

}