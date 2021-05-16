package com.test.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContractInsuranceDAOimpl implements ContractInsuranceDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int insertContractInsurane(Map<String, Object> ctimap) {
		// TODO Auto-generated method stub
		return this.sqlSession.insert("insertContractInsurance", ctimap);
	}
	
}
