package com.test.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.CustomerForSales;

@Repository
public class CustomerForSalesDAOimpl implements CustomerForSalesDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<CustomerForSales> listAllCustomerForSales() {
		// TODO Auto-generated method stub
		return this.sqlSession.selectList("listAllCustomerForSales");
	}
	
	@Override
	public List<CustomerForSales> listCustomerForSalesBySalesmanID(int salesmanID){
		
		return this.sqlSession.selectList("listCustomerForSalesBySalesmanID", salesmanID);
	}

	@Override
	public int insertCustomerForSales(HashMap<String, Object> rmap) {
		// TODO Auto-generated method stub
		int res = this.sqlSession.insert("insertCustomerForSales", rmap);
		System.out.println("res : " + res);
		int lastInsertedCustomerForSalesID = Integer.parseInt(rmap.get("customerForSalesID") + "");
		System.out.println("lastInsertedCustomerForSalesID : " + lastInsertedCustomerForSalesID);
		return lastInsertedCustomerForSalesID;
	}

	@Override
	public CustomerForSales showCustomerForSalesById(int lastInsertedCustomerForSalesID) {
		// TODO Auto-generated method stub
		return this.sqlSession.selectOne("showCustomerForSalesById", lastInsertedCustomerForSalesID);
	}

	@Override
	public List<CustomerForSales> listCustomerForSalesByCustomerName(HashMap<String, Object> searchMap) {
		return this.sqlSession.selectList("listCustomerForSalesByCustomerName", searchMap);
		
	}

	@Override
	public List<CustomerForSales> listCustomerForSalesBySalesSocialSecurityNumber(HashMap<String, Object> searchMap) {
		return this.sqlSession.selectList("listCustomerForSalesBySalesSocialSecurityNumber", searchMap);
		
	}

}
