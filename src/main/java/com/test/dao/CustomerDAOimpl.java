package com.test.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.Accident;
import com.test.dto.Customer;
import com.test.dto.Salesman;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
@Repository
public class CustomerDAOimpl implements CustomerDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	//고객ID에 맞는 고객이름 가져오기
	public String showCustomerName(int customerID) {
		return sqlSession.selectOne("getCustomerName", customerID);
	}
	
	@Override
	public Customer showCustomerBySocialSecurityNumber(String socialSecurityNumber) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		try {
			customer = this.sqlSession.selectOne("showCustomerBySocialSecurityNumber", socialSecurityNumber);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("주민등록번호 중복 -- socialSecurityNumber");
			customer.setCustomerID(-1);
		}
		return customer;
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
	public List<Customer> login(Map<String, String> loginInfo) {
		// TODO Auto-generated method stub
		return this.sqlSession.selectList("customerLogin", loginInfo);
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