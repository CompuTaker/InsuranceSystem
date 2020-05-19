package com.test.dao;

import java.io.File;
import java.util.List;

import com.test.dto.Proposal;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public interface ProposalDAO {

	public List<Proposal> showInteralApprovedProposal();

	/**
	 * 
	 * @param ���ȼ�
	 * @param ����������
	 */
	public int requestInternalApproved(Proposal proposal, File VerificationDocumentList);

	/**
	 * 
	 * @param ���ȼ�
	 * @param ����������
	 */
	public int requestExternalApproved(Proposal proposal, File VerificationDocumentList);

	public List<Proposal> showExternalApprovedProposal();

	/**
	 * 
	 * @param ���ȼ�
	 */
	public int saveProposalTemp(Proposal proposal);

	public Proposal writeProposal();

}