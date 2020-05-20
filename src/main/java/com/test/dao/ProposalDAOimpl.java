package com.test.dao;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.test.dto.Proposal;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public class ProposalDAOimpl implements ProposalDAO {

	@Autowired // root-context.xml, 마이바티스를 이용해서 MySQL에 접근하는 변수
	private SqlSessionTemplate sqlSession;

	
	
	@Override
	public List<Proposal> showInteralApprovedProposal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int requestInternalApproved(Proposal proposal, File VerificationDocumentList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int requestExternalApproved(Proposal proposal, File VerificationDocumentList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Proposal> showExternalApprovedProposal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int saveProposalTemp(Proposal proposal) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void witeProposal(HashMap<String, Object> proposal) {
		this.sqlSession.insert("insertTheProposal",proposal);
	}



}