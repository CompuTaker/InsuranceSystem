package com.test.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.test.dao.FireProposalDAOimpl;
import com.test.dao.InjuryProposalDAOimpl;
import com.test.dao.VehicleProposalDAOimpl;
import com.test.dto.InsuranceDeveloper;
import com.test.dto.InsuranceInternalApprover;
import com.test.dto.Proposal;

@Controller
@SessionAttributes({ "customer", "salesman", "insuranceInteralApprover", "insuranceDeveloper"})
public class ProposalController {

	@Autowired
	private FireProposalDAOimpl fireProposalDAOimpl;

	@Autowired
	private InjuryProposalDAOimpl injuryProposalDAOimpl;

	@Autowired
	private VehicleProposalDAOimpl vehicleProposalDAOimpl;

	@RequestMapping({ "/proposalRequest" }) // 제안서 폼 요청버튼
	public String requestProposal(Model model, HttpSession session) {
//		HttpSession session
		InsuranceDeveloper insuranceDeveloper = (InsuranceDeveloper) session.getAttribute("insuranceDeveloper");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(insuranceDeveloper + "!!!!!");
		if(insuranceDeveloper == null) {
			return "redirect:logout";
		}
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

	// 중복확인 실패!
	// 디비에서 조건으로 받아오도록 변경!
	@RequestMapping(value = "/duplicationProposalName", method = RequestMethod.POST) // 제안서 input화면
	public String duplicationProposalName(@RequestParam HashMap<String, Object> pmap) {
		boolean duplication = false;

		String proposalName = (String) pmap.get("proposalName");
		
		List<String> list = fireProposalDAOimpl.showProposal();
		for (int i = 0; i < list.size(); i++) {
			if (proposalName.equals(list.get(i)))
				duplication = true;
		}

		list = injuryProposalDAOimpl.showProposal();
		for (int i = 0; i < list.size(); i++) {
			if (proposalName.equals(list.get(i)))
				duplication = true;
		}

		list = vehicleProposalDAOimpl.showProposal();
		for (int i = 0; i < list.size(); i++) {
			if (proposalName.equals(list.get(i)))
				duplication = true;
		}

		if (duplication) {
			System.out.println("존재!");
		} else {
			System.out.println("!존재");
		}

		return "writeProposal";
	}


	// 내부승인 요청하기 전 목록 출력
	@RequestMapping({ "/beforeInternalApproved" })
	public String beforeInternalApproved(Model model, HttpSession session) {
//		HttpSession session
		InsuranceDeveloper insuranceDeveloper = (InsuranceDeveloper) session.getAttribute("insuranceDeveloper");
		if(insuranceDeveloper == null) {
			return "redirect:logout";
		}

		List<Proposal> fireBeforeInternalApprovedList = fireProposalDAOimpl.beforeInternalApprovedProposal();
		List<Proposal> injuryBeforeInternalApprovedList = injuryProposalDAOimpl.beforeInternalApprovedProposal();
		List<Proposal> vehicleBeforeInternalApprovedList = vehicleProposalDAOimpl.beforeInternalApprovedProposal();

		model.addAttribute("fireList", fireBeforeInternalApprovedList);
		model.addAttribute("injuryList", injuryBeforeInternalApprovedList);
		model.addAttribute("vehicleList", vehicleBeforeInternalApprovedList);

		return "beforeInternalApproved"; // DAO로 가는 곳
	}

	// 내부승인 요청하기
	@RequestMapping({ "/checkedBeforeInternalApproved" })
	public String checkedBeforeInternalApproved(Model model, String whichProposal, int proposalID) {

		List<Proposal> fireRequestedInternalApprovedList = fireProposalDAOimpl.beforeInternalApprovedProposal();
		List<Proposal> injuryRequestedInternalApprovedList = injuryProposalDAOimpl.beforeInternalApprovedProposal();
		List<Proposal> vehicleRequestedInternalApprovedList = vehicleProposalDAOimpl.beforeInternalApprovedProposal();

		model.addAttribute("fireList", fireRequestedInternalApprovedList);
		model.addAttribute("injuryList", injuryRequestedInternalApprovedList);
		model.addAttribute("vehicleList", vehicleRequestedInternalApprovedList);


		if (whichProposal.equals("fire")) {
			this.fireProposalDAOimpl.requestInternalApproved(proposalID, null);
		} else if (whichProposal.equals("injury")) {
			this.injuryProposalDAOimpl.requestInternalApproved(proposalID, null);
		} else if (whichProposal.equals("vehicle")) {
			this.vehicleProposalDAOimpl.requestInternalApproved(proposalID, null);
		} else {
			System.out.println("~NONE~");
		}

		return "redirect:/beforeInternalApproved"; // DAO로 가는 곳
	}


	// 내부승인 요청한 제안서 목록
	@RequestMapping({ "/afterInternalApproved" })
	public String requestInternalApproved(Model model, HttpSession session, SessionStatus status) {
//		HttpSession session
		
		InsuranceInternalApprover insuranceInternalApprover = (InsuranceInternalApprover) session.getAttribute("insuranceInteralApprover");
		
		if(insuranceInternalApprover == null) {
			return "redirect:logout";
		}

		List<Proposal> fireInternalApprovedList = fireProposalDAOimpl.afterInternalApprovedProposal();
		List<Proposal> injuryInternalApprovedList = injuryProposalDAOimpl.afterInternalApprovedProposal();
		List<Proposal> vehicleInternalApprovedList = vehicleProposalDAOimpl.afterInternalApprovedProposal();

		model.addAttribute("fireList", fireInternalApprovedList);
		model.addAttribute("injuryList", injuryInternalApprovedList);
		model.addAttribute("vehicleList", vehicleInternalApprovedList);

		return "afterInternalApproved"; // DAO로 가는 곳
	}

	// 내부승인하기
	@RequestMapping({ "/checkedAfterInternalApproved" })
	public String checkedAfterInternalApproved(Model model, String whichProposal, int proposalID) {

		List<Proposal> fireInternalApprovedList = fireProposalDAOimpl.afterInternalApprovedProposal();
		List<Proposal> injuryInternalApprovedList = injuryProposalDAOimpl.afterInternalApprovedProposal();
		List<Proposal> vehicleInternalApprovedList = vehicleProposalDAOimpl.afterInternalApprovedProposal();

		model.addAttribute("fireList", fireInternalApprovedList);
		model.addAttribute("injuryList", injuryInternalApprovedList);
		model.addAttribute("vehicleList", vehicleInternalApprovedList);


		if (whichProposal.equals("fire")) {
			this.fireProposalDAOimpl.internalApproved(proposalID, null);
		} else if (whichProposal.equals("injury")) {
			this.injuryProposalDAOimpl.internalApproved(proposalID, null);
		} else if (whichProposal.equals("vehicle")) {
			this.vehicleProposalDAOimpl.internalApproved(proposalID, null);
		} else {
			System.out.println("~NONE~");
		}

		return "redirect:/afterInternalApproved"; // DAO로 가는 곳
	}
	
//	checkedAfterInternalRejected
	// 내부승인 거절하기
	@RequestMapping({ "/checkedAfterInternalRejected" })
	public String checkedAfterInternalRejected(Model model, String whichProposal, int proposalID) {

		List<Proposal> fireInternalApprovedList = fireProposalDAOimpl.afterInternalApprovedProposal();
		List<Proposal> injuryInternalApprovedList = injuryProposalDAOimpl.afterInternalApprovedProposal();
		List<Proposal> vehicleInternalApprovedList = vehicleProposalDAOimpl.afterInternalApprovedProposal();

		model.addAttribute("fireList", fireInternalApprovedList);
		model.addAttribute("injuryList", injuryInternalApprovedList);
		model.addAttribute("vehicleList", vehicleInternalApprovedList);


		if (whichProposal.equals("fire")) {
			this.fireProposalDAOimpl.internalRejected(proposalID);
		} else if (whichProposal.equals("injury")) {
			this.injuryProposalDAOimpl.internalRejected(proposalID);
		} else if (whichProposal.equals("vehicle")) {
			this.vehicleProposalDAOimpl.internalRejected(proposalID);
		} else {
			System.out.println("~NONE~");
		}

		return "redirect:/afterInternalApproved"; // DAO로 가는 곳
	}

	// 외부승인 요청하기 전 제안서 목록 출력
	@RequestMapping({ "/beforeExternalApproved" })
	public String beforeExternalApproved(Model model) {

		List<Proposal> fireInternalApprovedList = fireProposalDAOimpl.showInternalApprovedProposal();
		List<Proposal> injuryInternalApprovedList = injuryProposalDAOimpl.showInternalApprovedProposal();
		List<Proposal> vehicleInternalApprovedList = vehicleProposalDAOimpl.showInternalApprovedProposal();

		model.addAttribute("fireList", fireInternalApprovedList);
		model.addAttribute("injuryList", injuryInternalApprovedList);
		model.addAttribute("vehicleList", vehicleInternalApprovedList);

		return "beforeExternalApproved"; // DAO로 가는 곳
	}

	
	// 외부승인 요청하기
	@RequestMapping({ "/checkedBeforeExternalApproved" })
	public String checkedBeforeExternalApproved(Model model, String whichProposal, int proposalID) {

		List<Proposal> fireInternalApprovedList = fireProposalDAOimpl.showInternalApprovedProposal();
		List<Proposal> injuryInternalApprovedList = injuryProposalDAOimpl.showInternalApprovedProposal();
		List<Proposal> vehicleInternalApprovedList = vehicleProposalDAOimpl.showInternalApprovedProposal();

		model.addAttribute("fireList", fireInternalApprovedList);
		model.addAttribute("injuryList", injuryInternalApprovedList);
		model.addAttribute("vehicleList", vehicleInternalApprovedList);


		if (whichProposal.equals("fire")) {
			this.fireProposalDAOimpl.requestExternalApproved(proposalID, null);
		} else if (whichProposal.equals("injury")) {
			this.injuryProposalDAOimpl.requestExternalApproved(proposalID, null);
		} else if (whichProposal.equals("vehicle")) {
			this.vehicleProposalDAOimpl.requestExternalApproved(proposalID, null);
		} else {
			System.out.println("~NONE~");
		}

		return "redirect:/beforeExternalApproved"; // DAO로 가는 곳
	}

	
	// 외부승인 요청된 제안서 목록 출력
	@RequestMapping({ "/afterExternalApproved" })
	public String requestExternalApproved(Model model, HttpSession session) {
//		, HttpSession session
		InsuranceInternalApprover insuranceInternalApprover = (InsuranceInternalApprover) session.getAttribute("insuranceInteralApprover");
		if(insuranceInternalApprover == null) {
			return "redirect:logout";
		}

		List<Proposal> fireInternalApprovedList = fireProposalDAOimpl.afterExternalApprovedProposal();
		List<Proposal> injuryInternalApprovedList = injuryProposalDAOimpl.afterExternalApprovedProposal();
		List<Proposal> vehicleInternalApprovedList = vehicleProposalDAOimpl.afterExternalApprovedProposal();

		model.addAttribute("fireList", fireInternalApprovedList);
		model.addAttribute("injuryList", injuryInternalApprovedList);
		model.addAttribute("vehicleList", vehicleInternalApprovedList);

		return "afterExternalApproved"; // DAO로 가는 곳
	}
	
	// 외부승인하기
	@RequestMapping({ "/checkedAfterExternalApproved" })
	public String checkedAfterExternalApproved(Model model, String whichProposal, int proposalID) {

		List<Proposal> fireInternalApprovedList = fireProposalDAOimpl.afterExternalApprovedProposal();
		List<Proposal> injuryInternalApprovedList = injuryProposalDAOimpl.afterExternalApprovedProposal();
		List<Proposal> vehicleInternalApprovedList = vehicleProposalDAOimpl.afterExternalApprovedProposal();

		model.addAttribute("fireList", fireInternalApprovedList);
		model.addAttribute("injuryList", injuryInternalApprovedList);
		model.addAttribute("vehicleList", vehicleInternalApprovedList);


		if (whichProposal.equals("fire")) {
			this.fireProposalDAOimpl.externalApproved(proposalID, null);
		} else if (whichProposal.equals("injury")) {
			this.injuryProposalDAOimpl.externalApproved(proposalID, null);
		} else if (whichProposal.equals("vehicle")) {
			this.vehicleProposalDAOimpl.externalApproved(proposalID, null);
		} else {
			System.out.println("~NONE~");
		}

		return "redirect:/afterExternalApproved"; // DAO로 가는 곳
	}

	// 외부승인거절하기
	@RequestMapping({ "/checkedAfterExternalRejected" })
	public String checkedAfterExternalRejected(Model model, String whichProposal, int proposalID) {

		List<Proposal> fireInternalApprovedList = fireProposalDAOimpl.afterExternalApprovedProposal();
		List<Proposal> injuryInternalApprovedList = injuryProposalDAOimpl.afterExternalApprovedProposal();
		List<Proposal> vehicleInternalApprovedList = vehicleProposalDAOimpl.afterExternalApprovedProposal();

		model.addAttribute("fireList", fireInternalApprovedList);
		model.addAttribute("injuryList", injuryInternalApprovedList);
		model.addAttribute("vehicleList", vehicleInternalApprovedList);


		if (whichProposal.equals("fire")) {
			this.fireProposalDAOimpl.externalRejected(proposalID);
		} else if (whichProposal.equals("injury")) {
			this.injuryProposalDAOimpl.externalRejected(proposalID);
		} else if (whichProposal.equals("vehicle")) {
			this.vehicleProposalDAOimpl.externalRejected(proposalID);
		} else {
			System.out.println("~NONE~");
		}

		return "redirect:/afterExternalApproved"; // DAO로 가는 곳
	}


	// 내부승인, 외부승인 둘 다 완료된 제안서 목록 출력
	@RequestMapping({ "/makeInsurancePublicFromProposal" })
	public String beforePublicFromProposal(Model model, HttpSession session) {
//		, HttpSession session
		InsuranceInternalApprover insuranceInternalApprover = (InsuranceInternalApprover) session.getAttribute("insuranceInteralApprover");
		if(insuranceInternalApprover == null) {
			return "redirect:logout";
		}

		List<Proposal> fireInternalApprovedList = fireProposalDAOimpl.beforePublicFromProposal();
		List<Proposal> injuryInternalApprovedList = injuryProposalDAOimpl.beforePublicFromProposal();
		List<Proposal> vehicleInternalApprovedList = vehicleProposalDAOimpl.beforePublicFromProposal();

		model.addAttribute("fireList", fireInternalApprovedList);
		model.addAttribute("injuryList", injuryInternalApprovedList);
		model.addAttribute("vehicleList", vehicleInternalApprovedList);

		return "makeInsurancePublicFromProposal"; // DAO로 가는 곳
	}
	
	// 상품 공시하기 (보험으로 바꾸는 기능 추가해야함)---------------------------------
	@RequestMapping({ "/checkedBeforePublicFromProposal" })
	public String checkedBeforePublicFromProposal(Model model, String whichProposal, int proposalID) {

		List<Proposal> fireInternalApprovedList = fireProposalDAOimpl.beforePublicFromProposal();
		List<Proposal> injuryInternalApprovedList = injuryProposalDAOimpl.beforePublicFromProposal();
		List<Proposal> vehicleInternalApprovedList = vehicleProposalDAOimpl.beforePublicFromProposal();

		model.addAttribute("fireList", fireInternalApprovedList);
		model.addAttribute("injuryList", injuryInternalApprovedList);
		model.addAttribute("vehicleList", vehicleInternalApprovedList);

// 			System.out.println(whichProposal + "  ~~  " + proposalID);

		if (whichProposal.equals("fire")) {
			this.fireProposalDAOimpl.publicFromProposal(proposalID);
		} else if (whichProposal.equals("injury")) {
			this.injuryProposalDAOimpl.publicFromProposal(proposalID);
		} else if (whichProposal.equals("vehicle")) {
			this.vehicleProposalDAOimpl.publicFromProposal(proposalID);
		} else {
			System.out.println("~NONE~");
		}

		return "redirect:/makeInsurancePublicFromProposal"; // DAO로 가는 곳
	}

	
	// 제안서 작성완료 (작성종료, 내부승인요청버튼)
	@RequestMapping(value = "/writeProposal", method = RequestMethod.POST) 
	public String submitProposal(@RequestParam HashMap<String, Object> pmap) {
		String whichProposal = (String) pmap.get("whichProposal");
		pmap.put("insuranceDeveloperTeamID", 1); // 정필컴퍼니 강제
		pmap.put("isInternalApproved", 0);
		pmap.put("isExternalApproved", 0);

		if (whichProposal.equals("fire")) {
			this.fireProposalDAOimpl.writeProposal(pmap);
		} else if (whichProposal.equals("injury")) {
			this.injuryProposalDAOimpl.writeProposal(pmap);
		} else if (whichProposal.equals("vehicle")) {
			this.vehicleProposalDAOimpl.writeProposal(pmap);
		} else {
			System.out.println("~NONE~");
		}
		return "writeProposal";
	}

	// 원래 없던 내용 임시로 만듦ㅁㅁㅁㅁ
	@RequestMapping({ "/writeProposal" })
	public String writeProposals(Model model) {
		return "writeProposal";
	}

}