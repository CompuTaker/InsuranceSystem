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
	
	abstract public int writeProposal(HashMap<String, Object> pmap);
	
}