package com.test.dao;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.Proposal;

@Repository
public class VehicleProposalDAOimpl implements ProposalDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<Proposal> beforeInternalApprovedProposal() {
		return sqlSession.selectList("beforeInternalApprovedVehicleProposal");
	}
	
	@Override
	public List<Proposal> afterInternalApprovedProposal() {
		return sqlSession.selectList("afterInternalApprovedVehicleProposal");
	}

	@Override
	public List<Proposal> afterExternalApprovedProposal() {
		return sqlSession.selectList("afterExternalApprovedVehicleProposal"); // 외부승인 요청한 제안서 받아오기
	}
	
	@Override
	public List<Proposal> showInternalApprovedProposal() {
		return sqlSession.selectList("showInternalApprovedVehicleProposal");
	}
	
	@Override
	public List<String> showProposal() {
		return sqlSession.selectList("showVehicleProposal");
	}
	
	@Override
	public Proposal showSpecificProposal(int proposalID) {
		return sqlSession.selectOne("showSpecificVehicleProposal", proposalID); // 이름 중복하려고 만들었는데 못함
	}
	
	@Override
	public int requestInternalApproved(int proposalID, File VerificationDocumentList) {
		return sqlSession.update("requestInternalApprovedVehicle", proposalID);
	}

	@Override
	public int requestExternalApproved(int proposalID, File VerificationDocumentList) {
		return sqlSession.update("requestExternalApprovedVehicle", proposalID);
	}
	
	@Override
	public int internalApproved(int proposalID, File VerificationDocumentList) {
		return sqlSession.update("internalApprovedVehicle", proposalID);
	}
	@Override
	public int internalRejected(int proposalID) {
		return sqlSession.update("internalRejectedVehicle", proposalID); // 내부승인거절하기
	}
	@Override
	public int externalApproved(int proposalID, File VerificationDocumentList) {
		return sqlSession.update("externalApprovedVehicle", proposalID);
	}
	@Override
	public int externalRejected(int proposalID) {
		return sqlSession.update("externalRejectedVehicle", proposalID); // 외부승인거절하기
	}
	
	@Override
	public List<Proposal> beforePublicFromProposal() {
		return sqlSession.selectList("beforePublicFromVehicleProposal");
	}

	@Override
	public int publicFromProposal(int proposalID) {
		sqlSession.insert("publicVehicleProposal", proposalID);
		return sqlSession.update("publicFromVehicleProposal", proposalID);
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
		return this.sqlSession.insert("insertVehicleProposal", pmap);
	}

	@Override
	public String getProprosalName(int proposalID) {
		return this.sqlSession.selectOne("selectVehicleProposalName", proposalID);
	}

}
