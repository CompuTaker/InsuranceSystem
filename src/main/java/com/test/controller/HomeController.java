package com.test.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.dao.ProposalDAO;

@Controller
public class HomeController {
	
	@Autowired
	private ProposalDAO proposalDAO;
	
	@RequestMapping({"/index", "/"})
	public String chat(Model model) {
		return "index"; // chat.jsp
	}

	@RequestMapping({ "/proposalRequest" }) // 제안서 폼 요청버튼
	public String requestProposal(Model model) {
		return "proposalRequest";
	}

	@RequestMapping({ "/proposalInsuranceType" }) // 제안서 보험선택
	public String choiceProposalInsuranceType(Model model) {
		return "proposalInsuranceType";
	}

	@RequestMapping({ "/proposalForm" }) // 제안서 폼화면
	public String writeProposal(Model model) {
		return "proposalForm";
	}

	@RequestMapping({ "/fireProposal" }) // 제안서 input화면
	public String writeFireProposal(Model model) {
		return "fireProposal";
	}

	@RequestMapping({ "/injuryProposal" }) // 제안서 input화면
	public String writeInjuryProposal(Model model) {
		return "injuryProposal";
	}

	@RequestMapping({ "/vehicleProposal" }) // 제안서 input화면
	public String writeVehicleProposal(Model model) {
		return "vehicleProposal";
	}
	
	@RequestMapping({ "/internalApprovedList" }) // 제안서 폼화면
	public String requestInternalApprovedList(Model model) {
		return "InternalApprovedList";
	}
	@RequestMapping(value = "/witeProposal", method = RequestMethod.POST) // 제안서 작성완료 (작성종료, 내부승인요청버튼)
	public String submitProposal(@RequestParam HashMap<String, Object> proposal) {
		proposalDAO.witeProposal(proposal);
		return "witeProposal";
	}
	
}
