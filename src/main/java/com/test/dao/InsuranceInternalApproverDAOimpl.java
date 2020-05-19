package com.test.dao;

import com.test.dto.Insurance;
import com.test.dto.InsurnaceInternalApprover;
import com.test.dto.OfficalDocuments;
import com.test.dto.Proposal;

/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public class InsuranceInternalApproverDAOimpl implements InsuranceInteralApproverDAO {

	public OfficalDocuments officalDocuments;
	public InsurnaceInternalApprover insurnaceInternalApprover;

	public InsuranceInternalApproverDAOimpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param ���ü���
	 * @param ���ȼ�
	 */
	public Insurance makeInsurancePublicFromProposal(OfficalDocuments officalDocuments, Proposal proposal){
		return null;
	}

	/**
	 * 
	 * @param ���ȼ�
	 */
	public int internalApprovePropoal(Proposal proposal){
		return 0;
	}

}