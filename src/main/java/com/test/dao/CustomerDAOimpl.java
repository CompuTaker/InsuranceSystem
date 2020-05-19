package com.test.dao;

import java.util.List;

import com.test.dto.Accident;
import com.test.dto.Customer;
import com.test.dto.Salesman;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class CustomerDAOimpl implements CustomerDAO {

	public CustomerDAOimpl(){

	}

	public void finalize() throws Throwable {

	}


	@Override
	public List<Customer> showAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer showOneCustomerByID(int customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> showAssignedCustomer(Salesman salesman) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer login(String customerID, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer login_anon(String password, String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer showAccidentPeopleInformation(Accident accident) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> showCustomerForSales(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int signup(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

}