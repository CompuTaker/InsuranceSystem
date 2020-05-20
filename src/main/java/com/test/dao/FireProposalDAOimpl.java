package com.test.dao;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import com.test.dto.Proposal;

public class FireProposalDAOimpl implements ProposalDAO {

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
	public Proposal writeProposal(HashMap<String, Object> pmap) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
