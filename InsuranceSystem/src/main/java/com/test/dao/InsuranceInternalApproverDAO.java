package com.test.dao;

import java.util.List;
import java.util.Map;

import com.test.dto.Insurance;
import com.test.dto.InsuranceInternalApprover;
import com.test.dto.OfficalDocuments;
import com.test.dto.Proposal;

/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public interface InsuranceInternalApproverDAO {

	/**
	 * 
	 * @param ���ü���
	 * @param ���ȼ�
	 */
	public Insurance makeInsurancePublicFromProposal(OfficalDocuments officalDocuments, Proposal proposal);

	/**
	 * 
	 * @param ���ȼ�
	 */
	public int internalApprovePropoal(Proposal proposal);
	
	public List<InsuranceInternalApprover> login(Map<String, String> loginInfo);
	
	public boolean checkByPw(String id, String pw);

}