package com.test.dao;

import java.io.File;
import java.util.List;

import com.test.dto.Proposal;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public class ProposalDAOimpl implements ProposalDAO {

	public ProposalDAOimpl(){

	}

	public void finalize() throws Throwable {

	}

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
	public Proposal writeProposal() {
		// TODO Auto-generated method stub
		return null;
	}



}