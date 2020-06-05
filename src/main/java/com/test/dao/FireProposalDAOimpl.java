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
		return sqlSession.selectList("beforeInternalApprovedFireProposal"); // 내부승인 전 제안서 받아오기
	}
	
	@Override
	public List<Proposal> afterInternalApprovedProposal() {
		return sqlSession.selectList("afterInternalApprovedFireProposal"); // 내부승인 요청한 제안서 받아오기
	}

	@Override
	public List<Proposal> afterExternalApprovedProposal() {
		return sqlSession.selectList("afterExternalApprovedFireProposal"); // 외부승인 요청한 제안서 받아오기
	}

	@Override
	public List<Proposal> showInternalApprovedProposal() {
		return sqlSession.selectList("showInternalApprovedFireProposal"); // 내부승인 완료된 제안서 받아오기
	}
	
	@Override
	public List<String> showProposal() {
		return sqlSession.selectList("showFireProposal"); // 이름 중복하려고 만들었는데 못함
	}
	
	@Override
	public Proposal showSpecificProposal(int proposalID) {
		return sqlSession.selectOne("showSpecificFireProposal", proposalID); // 이름 중복하려고 만들었는데 못함
	}

	@Override
	public int requestInternalApproved(int proposalID, File VerificationDocumentList) {
		return sqlSession.update("requestInternalApprovedFire", proposalID); // 내부승인 요청하기
	}
	

	@Override
	public int requestExternalApproved(int proposalID, File VerificationDocumentList) {
		return sqlSession.update("requestExternalApprovedFire", proposalID); // 외부승인 요청하기

	}
	
	@Override
	public int internalApproved(int proposalID, File VerificationDocumentList) {
		return sqlSession.update("internalApprovedFire", proposalID); // 내부승인하기
	}
	@Override
	public int internalRejected(int proposalID) {
		return sqlSession.update("internalRejectedFire", proposalID); // 내부승인거절하기
	}
	@Override
	public int externalApproved(int proposalID, File VerificationDocumentList) {
		return sqlSession.update("externalApprovedFire", proposalID); // 외부승인하기
	}
	@Override
	public int externalRejected(int proposalID) {
		return sqlSession.update("externalRejectedFire", proposalID); // 외부승인거절하기
	}

	
	@Override
	public List<Proposal> beforePublicFromProposal() {
		return sqlSession.selectList("beforePublicFromFireProposal");
	}

	@Override
	public int publicFromProposal(int proposalID) {
		sqlSession.insert("publicFireProposal", proposalID);
		return sqlSession.update("publicFromFireProposal", proposalID);
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

	@Override
	public String getProprosalName(int proposalID) {
		return this.sqlSession.selectOne("selectFireProposalName", proposalID);
	}
}
   