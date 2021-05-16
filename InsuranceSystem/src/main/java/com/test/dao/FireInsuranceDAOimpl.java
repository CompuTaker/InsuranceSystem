package com.test.dao;

import java.io.File;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.Insurance;

@Repository
public class FireInsuranceDAOimpl implements InsuranceDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int getProprosalID(int insuranceID) {
		System.out.println(insuranceID);
		return sqlSession.selectOne("getFireProposalID", insuranceID);
	}
	
	@Override
	public Insurance showInsuranceDetail(int insuranceID) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("showFireInsuranceDetail", insuranceID);
	}

	@Override
	public List<Insurance> showAllInsurance() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("showFireInsurance");
	}

	@Override
	public File showCondition(Insurance insurance) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
