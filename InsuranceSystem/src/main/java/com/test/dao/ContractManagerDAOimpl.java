package com.test.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContractManagerDAOimpl implements ContractManagerDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<String> getContractManagerName(int contractManagerID) {
		return sqlSession.selectList("getContractManagerName");
	}
	
	@Override
	public String showDetailContractManagerName(int contractManagerID) {
		return sqlSession.selectOne("getcustomerContractManagerName", contractManagerID);
	}
	
	@Override
	public List<String> showCustomerContractManager(List<Integer> allContractManager) {
		
		List<String> result = new ArrayList<String>();
		
		for(int contractManagerID : allContractManager) {
			result.add((String) sqlSession.selectOne("getcustomerContractManagerName", contractManagerID));
		}
		
		return result;
	}

}
