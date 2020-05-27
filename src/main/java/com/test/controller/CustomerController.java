package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.test.dao.CustomerDAO;
import com.test.dto.Customer;
import com.test.dto.Salesman;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class CustomerController {
	
	public CustomerDAO customerDAO;
	
	public List<Customer> showAssignedCustomerBySalesman(Salesman salesman){
		return null;
	}

	public Customer login_anon(String loginID, String password){
		return null;
	}
	
	public int saveCustomer_anon(String login_temp, String phoneNumber, String password){
		return 0;
	}
	
	public int checkDuplicateLoginID(String loginID){
		return 0;
	}
	
	public List<Customer> showCustomerForSales(Customer customer){
		return null;
	}

	public int checkEmail(String email){
		return 0;
	}

	public int signup(Customer customer){
		return 0;
	}

}
