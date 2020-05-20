package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.dao.CustomerDAO;
import com.test.dto.Customer;
import com.test.dto.Salesman;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class CustomerController {
	
	@Autowired
	public CustomerDAO customerDAO;

	public CustomerController(){

	}

	public void finalize() throws Throwable {

	} 

	/**
	 * 
	 * @param �������
	 */
	public List<Customer> showAssignedCustomerBySalesman(Salesman salesman){
		return null;
	}

	/**
	 * 
	 * @param ����
	 * @param ��й�ȣ
	 */
	public Customer login(String loginID, String password){
		return null;
	}

	/**
	 * 
	 * @param ��й�ȣ
	 * @param ���̵�
	 */
	public Customer login_anon(String loginID, String password){
		return null;
	}

	/**
	 * 
	 * @param �ӽþ��̵�
	 * @param ����ó
	 * @param ��й�ȣ
	 */
	public int saveCustomer_anon(String login_temp, String phoneNumber, String password){
		return 0;
	}

	/**
	 * 
	 * @param ����
	 */
	public int checkDuplicateLoginID(String loginID){
		return 0;
	}

	/**
	 * 
	 * @param ��
	 */
	public List<Customer> showCustomerForSales(Customer customer){
		return null;
	}

	/**
	 * 
	 * @param �̸���
	 */
	public int checkEmail(String email){
		return 0;
	}

	/**
	 * 
	 * @param ��
	 */
	public int signup(Customer customer){
		return 0;
	}

}