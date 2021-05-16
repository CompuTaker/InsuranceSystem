package com.test.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.test.dto.Accident;
import com.test.dto.Customer;
import com.test.dto.Salesman;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public interface CustomerDAO {
	
	//고객ID에 맞는 고객이름 가져오기
	public String showCustomerName(int customerID);
	public int signUp(HashMap<String, Object> pmap);
	
	
	public List<Customer> showCustomerBySocialSecurityNumber(String socialSecurityNumber);
	

	public List<Customer> showAllCustomer();

	/**
	 * 
	 * @param ��
	 */
	public int modifyCustomer(Customer customer);

	/**
	 * 
	 * @param ��ID
	 */
	public Customer showOneCustomerByID(int customerID);

	/**
	 * 
	 * @param �������
	 */
	public List<Customer> showAssignedCustomer(Salesman salesman);

	/**
	 * 
	 * @param ����
	 * @param ��й�ȣ
	 */
	public List<Customer> login(Map<String, String> loginInfo);

	/**
	 * 
	 * @param ��й�ȣ
	 * @param ����ó
	 */
	public Customer login_anon(String password, String phoneNumber);

	/**
	 * 
	 * @param ���
	 */
	public Customer showAccidentPeopleInformation(Accident accident);

	/**
	 * 
	 * @param ��
	 */
	public List<Customer> showCustomerForSales(Customer customer);

	/**
	 * 
	 * @param ��
	 */
	public int signup(Customer customer);
	
	public List<Customer> showCustomerByLoginID(String id);
	
	public boolean checkCustomerByPw(String id, String pw);

}