package com.test.dao;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.Proposal;

@Repository
public class InjuryProposalDAOimpl implements ProposalDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<Proposal> beforeInternalApprovedProposal() {
		return sqlSession.selectList("beforeInternalApprovedInjuryProposal");
	}
	
	@Override
	public List<Proposal> afterInternalApprovedProposal() {
		return sqlSession.selectList("afterInternalApprovedInjuryProposal");
	}

	@Override
	public List<Proposal> afterExternalApprovedProposal() {
		return sqlSession.selectList("afterExternalApprovedInjuryProposal"); // 외부승인 요청한 제안서 받아오기
	}
	
	@Override
	public List<Proposal> showInternalApprovedProposal() {
		return sqlSession.selectList("showInternalApprovedInjuryProposal");
	}
	
	@Override
	public List<String> showProposal() {
		return sqlSession.selectList("showInjuryProposal");
	}
	
	@Override
	public Proposal showSpecificProposal(int proposalID) {
		return sqlSession.selectOne("showSpecificInjuryProposal", proposalID); // 이름 중복하려고 만들었는데 못함
	}
	
	@Override
	public int requestInternalApproved(int proposalID, File VerificationDocumentList) {
		return sqlSession.update("requestInternalApprovedInjury", proposalID);
	}
	
	@Override
	public int requestExternalApproved(int proposalID, File VerificationDocumentList) {
		return sqlSession.update("requestExternalApprovedInjury", proposalID);
	}
	
	@Override
	public int internalApproved(int proposalID, File VerificationDocumentList) {
		return sqlSession.update("internalApprovedInjury", proposalID);
	}
	@Override
	public int internalRejected(int proposalID) {
		return sqlSession.update("internalRejectedInjury", proposalID); // 내부승인거절하기
	}
	@Override
	public int externalApproved(int proposalID, File VerificationDocumentList) {
		return sqlSession.update("externalApprovedInjury", proposalID);
	}
	@Override
	public int externalRejected(int proposalID) {
		return sqlSession.update("externalRejectedInjury", proposalID); // 외부승인거절하기
	}
	
	@Override
	public List<Proposal> beforePublicFromProposal() {
		return sqlSession.selectList("beforePublicFromInjuryProposal");
	}

	@Override
	public int publicFromProposal(int proposalID) {
		sqlSession.insert("publicInjuryProposal", proposalID);
		return sqlSession.update("publicFromInjuryProposal", proposalID);
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
		return this.sqlSession.insert("insertInjuryProposal", pmap);
	}

	@Override
	public String getProprosalName(int proposalID) {
		return this.sqlSession.selectOne("selectInjuryProposalName", proposalID);
	}

}
