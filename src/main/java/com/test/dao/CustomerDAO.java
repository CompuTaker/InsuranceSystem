package com.test.dao;

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

}