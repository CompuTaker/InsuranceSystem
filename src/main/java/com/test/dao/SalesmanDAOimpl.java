package com.test.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.Salesman;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
@Repository
public class SalesmanDAOimpl implements SalesmanDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public Salesman assignSalesman() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Salesman> login(Map<String, String> loginInfo) {
		// TODO Auto-generated method stub
		return this.sqlSession.selectList("salesmanLogin", loginInfo);
	}

}