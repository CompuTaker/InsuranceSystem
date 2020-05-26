package com.test.dao;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.Proposal;

@Repository
public class FireProposalDAOimpl implements ProposalDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<Proposal> beforeInternalApprovedProposal() {
		return sqlSession.selectList("beforeInternalApprovedFireProposal");
	}
	
	@Override
	public List<Proposal> afterInternalApprovedProposal() {
		return sqlSession.selectList("afterInternalApprovedFireProposal");
	}

	@Override
	public List<Proposal> showInternalApprovedProposal() {
		return sqlSession.selectList("showInternalApprovedFireProposal");
	}
	
	@Override
	public List<String> showProposal() {
		return sqlSession.selectList("showFireProposal");
	}

	@Override
	public int requestInternalApproved(int proposalID, File VerificationDocumentList) {
		return sqlSession.update("requestInternalApprovedFire", proposalID);
	}

	@Override
	public int requestExternalApproved(Proposal proposal, File VerificationDocumentList) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int internalApproved(int proposalID, File VerificationDocumentList) {
		return sqlSession.update("internalApprovedFire", proposalID);
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
	public int writeProposal(HashMap<String, Object> pmap) {
		// TODO Auto-generated method stub
		return this.sqlSession.insert("insertFireProposal", pmap);
	}

	
}
   