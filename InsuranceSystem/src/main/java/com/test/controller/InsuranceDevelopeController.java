package com.test.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.dao.ProposalDAO;
import com.test.dto.Insurance;
import com.test.dto.InsuranceDeveloper;
import com.test.dto.InsuranceDeveloperTeam;
import com.test.dto.OfficalDocuments;
import com.test.dto.Proposal;

/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 4:22:13
 */
@Controller
public class InsuranceDevelopeController {

	@RequestMapping({ "/joinInsurance/insuraceListMenu" })
	public String showInranceListMenu(Model model) {
		return "/joinInsurance/insuraceListMenu";
	}

	@RequestMapping({ "/joinInsurance/insuraceList" })
	public String showInranceList(Model model) {
		return "/joinInsurance/insuraceList";
	}

	@RequestMapping({ "/joinInsurance/fireInsuraceInput" })
	public String showInranceListInput(Model model) {
		return "/joinInsurance/fireInsuraceInput";
	}

	@RequestMapping({ "/joinInsurance/fireInsuraceInfo" })
	public String showInranceInfo(Model model) {
		return "/joinInsurance/fireInsuraceInfo";
	}

	public List<Proposal> showInteralApprovedProposal() {
		return null;
	}

	/**
	 * 
	 * @param 谳
	 */
	public int joinInsuranceDeveloper(InsuranceDeveloper insuranceDeveloper) {
		return 0;
	}

	/**
	 * 
	 * @param 谳
	 */
	public int registerInsuranceDeveloperTeamOnProposal(InsuranceDeveloperTeam insuranceDeveloperTeam) {
		return 0;
	}

	/**
	 * 
	 * @param ü
	 * @param ȼ
	 */
	public Insurance makeInsurancePublicFromProposal(OfficalDocuments officalDocuments, Proposal proposal) {
		return null;
	}

	/**
	 * 
	 * @param ȼ
	 */
	public int requestPropsalInternalApproved(Proposal proposal) {
		return 0;
	}

	/**
	 * 
	 * @param ȼ
	 */
	public int internalApprovePropoal(Proposal proposal) {
		return 0;
	}

	/**
	 * 
	 * @param ȼ
	 */
	public int requestProposalExternalApproved(Proposal proposal) {
		return 0;
	}

	public List<Proposal> showExternalApprovedProposal() {
		return null;
	}

	/**
	 * 
	 * @param ȼ
	 */
	public int saveProposalTemp(Proposal proposal) {
		return 0;
	}

}