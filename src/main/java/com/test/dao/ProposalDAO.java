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
	
	abstract public List<Proposal> beforeInternalApprovedProposal();
	abstract public List<Proposal> afterInternalApprovedProposal();
	abstract public List<Proposal> showInternalApprovedProposal();
	
	abstract public int requestInternalApproved(int proposalID, File VerificationDocumentList);
	
	abstract public List<String> showProposal();
	
	abstract public int requestExternalApproved(int proposalID, File VerificationDocumentList);

	abstract public List<Proposal> showExternalApprovedProposal();
	
	abstract public int saveProposalTemp(Proposal proposal);
	
	abstract public int writeProposal(HashMap<String, Object> pmap);
	
	abstract public int internalApproved(int proposalID, File VerificationDocumentList);

	
}