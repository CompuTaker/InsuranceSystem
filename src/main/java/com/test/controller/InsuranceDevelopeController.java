package com.test.controller;

import java.util.List;

import com.test.dto.Insurance;
import com.test.dto.InsuranceDeveloper;
import com.test.dto.InsuranceDeveloperTeam;
import com.test.dto.OfficalDocuments;
import com.test.dto.Proposal;

/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public class InsuranceDevelopeController {

	public InsuranceDevelopeController(){

	}

	public void finalize() throws Throwable {

	}

	public List<Proposal> showInteralApprovedProposal(){
		return null;
	}

	/**
	 * 
	 * @param ���谳����
	 */
	public int joinInsuranceDeveloper(InsuranceDeveloper insuranceDeveloper){
		return 0;
	}

	/**
	 * 
	 * @param ���谳����
	 */
	public int registerInsuranceDeveloperTeamOnProposal(InsuranceDeveloperTeam insuranceDeveloperTeam){
		return 0;
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
	public int requestPropsalInternalApproved(Proposal proposal){
		return 0;
	}

	/**
	 * 
	 * @param ���ȼ�
	 */
	public int internalApprovePropoal(Proposal proposal){
		return 0;
	}

	/**
	 * 
	 * @param ���ȼ�
	 */
	public int requestProposalExternalApproved(Proposal proposal){
		return 0;
	}

	public List<Proposal> showExternalApprovedProposal(){
		return null;
	}

	public Proposal writeProposal(){
		return null;
	}

	/**
	 * 
	 * @param ���ȼ�
	 */
	public int saveProposalTemp(Proposal proposal){
		return 0;
	}

}