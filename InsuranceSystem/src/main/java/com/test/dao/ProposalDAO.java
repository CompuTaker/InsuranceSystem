package com.test.dao;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.dto.Proposal;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public interface ProposalDAO {

	abstract public List<Proposal> beforeInternalApprovedProposal(); // 내부승인 요청하기 전 제안서 목록
	abstract public List<Proposal> afterInternalApprovedProposal(); // 내부승인 요청한 제안서 목록
	abstract public List<Proposal> afterExternalApprovedProposal(); // 외부승인 요청한 제안서 목록
	abstract public List<Proposal> showInternalApprovedProposal(); // 내부승인 완료된 제안서 목록
	abstract public List<Proposal> beforePublicFromProposal(); // 내부외부 둘 다 승인된 공시할 제안서 목록
	
	abstract public int internalApproved(int proposalID, File VerificationDocumentList); // 내부승인
	abstract public int requestInternalApproved(int proposalID, File VerificationDocumentList); //내부승인 요청하기
	abstract public int internalRejected(int proposalID); // 내부승인 거절하기
	abstract public int externalApproved(int proposalID, File VerificationDocumentList); // 외부승인
	abstract public int requestExternalApproved(int proposalID, File VerificationDocumentList); // 외부승인 요청하기
	abstract public int externalRejected(int proposalID); // 외부승인 거절하기
	abstract public int publicFromProposal(int proposalID); // 상품공시하기
	
	abstract public String getProprosalName(int proposalID);
	
	abstract public List<String> showProposal();
	
	abstract public Proposal showSpecificProposal(int proposalID);
	
	abstract public List<Proposal> showExternalApprovedProposal();
	
	abstract public int saveProposalTemp(Proposal proposal);
	
	abstract public int writeProposal(HashMap<String, Object> pmap);
	
}