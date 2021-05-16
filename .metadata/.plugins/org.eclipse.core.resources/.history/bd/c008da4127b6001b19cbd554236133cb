package com.test.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.Insurance;
import com.test.dto.InsuranceInternalApprover;
import com.test.dto.OfficalDocuments;
import com.test.dto.Proposal;

/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
@Repository
public class InsuranceInternalApproverDAOimpl implements InsuranceInternalApproverDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public Insurance makeInsurancePublicFromProposal(OfficalDocuments officalDocuments, Proposal proposal){
		return null;
	}
	
	public int internalApprovePropoal(Proposal proposal){
		return 0;
	}

	@Override
	public List<InsuranceInternalApprover> login(Map<String, String> loginInfo) {
		// TODO Auto-generated method stub
		return this.sqlSession.selectList("insurnaceInternalApproverLogin", loginInfo);
	}

}