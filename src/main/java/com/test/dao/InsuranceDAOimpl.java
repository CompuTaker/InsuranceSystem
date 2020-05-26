package com.test.dao;

import java.io.File;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.Insurance;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
@Repository
public class InsuranceDAOimpl implements InsuranceDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public InsuranceDAOimpl(){

	}

	@Override
	public List<Insurance> showAllInsurance() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("showInsurance");
	}

	@Override
	public Insurance showInsuranceDetail(int insuranceID) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("showInsuranceDetail", insuranceID);
	}

	@Override
	public File showCondition(Insurance insurance) {
		// TODO Auto-generated method stub
		return null;
	}



}