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
abstract public class ProposalDAO {
	
	@Autowired
	private FireProposalDAOimpl fireProposalDAOimpl; // FireProposalDAOimpl / InjuryProposalDAOimpl / VehicleProposalDAOimpl
	
	@Autowired
	private FireProposalDAOimpl injuryProposalDAOimpl;
	
	@Autowired
	private FireProposalDAOimpl vehicleProposalDAOimpl;
	
	abstract public List<Proposal> showInteralApprovedProposal();

	/**
	 * 
	 * @param ���ȼ�
	 * @param ����������
	 */
	abstract public int requestInternalApproved(Proposal proposal, File VerificationDocumentList);

	/**
	 * 
	 * @param ���ȼ�
	 * @param ����������
	 */
	abstract public int requestExternalApproved(Proposal proposal, File VerificationDocumentList);

	abstract public List<Proposal> showExternalApprovedProposal();

	/**
	 * 
	 * @param ���ȼ�
	 */
	abstract public int saveProposalTemp(Proposal proposal);
	
	public int writeProposal(HashMap<String, Object> pmap, String whichProposal) {
		if(whichProposal.equals("fire")) {
			return this.fireProposalDAOimpl.writeProposal(pmap);
		}else if(whichProposal.equals("injury")) {
			return this.injuryProposalDAOimpl.writeProposal(pmap);
		}else if(whichProposal.equals("vehicle")) {
			return this.vehicleProposalDAOimpl.writeProposal(pmap);
		}
		return -1;
	}
	
}