package com.test.dao;

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

}
