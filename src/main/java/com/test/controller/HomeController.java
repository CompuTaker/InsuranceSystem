package com.test.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.dao.FireProposalDAOimpl;
import com.test.dao.InjuryProposalDAOimpl;
import com.test.dao.VehicleProposalDAOimpl;
import com.test.dto.Proposal;

@Controller
public class HomeController {
	
	@Autowired
	private FireProposalDAOimpl fireProposalDAOimpl;
	
	@Autowired
	private InjuryProposalDAOimpl injuryProposalDAOimpl;
	
	@Autowired
	private VehicleProposalDAOimpl vehicleProposalDAOimpl;
	
	
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

	
	//중복확인 실패!
	//디비에서 조건으로 받아오도록 변경!
	@RequestMapping(value = "/duplicationProposalName", method = RequestMethod.POST) // 제안서 input화면
	public String duplicationProposalName(@RequestParam HashMap<String, Object> pmap) {
      	boolean duplication = false;
      	
      	String proposalName = (String) pmap.get("proposalName");
      	
      	
      	List<String> list = fireProposalDAOimpl.showProposal();
		for(int i = 0; i < list.size(); i++) {
			if(proposalName.equals(list.get(i))) duplication = true;
		}
		
		list = injuryProposalDAOimpl.showProposal();
		for(int i = 0; i < list.size(); i++) {
			if(proposalName.equals(list.get(i))) duplication = true;
		}
		
		list = vehicleProposalDAOimpl.showProposal();
		for(int i = 0; i < list.size(); i++) {
			if(proposalName.equals(list.get(i))) duplication = true;
		}
		
// 		if(duplication) {alert('이미 존재하는 이름입니다.');}
// 		else {alert('사용 가능한 이름입니다.');}
		
		if(duplication) {System.out.println("존재!");}
		else {System.out.println("!존재");}
		
		return "writeProposal";
	}
	
	
	//내부승인 요청하기 전
	@RequestMapping({"/beforeInternalApproved"})
	public String beforeInternalApproved(Model model) {

		List<Proposal> fireInternalApprovedList = fireProposalDAOimpl.beforeInternalApprovedProposal();
		List<Proposal> injuryInternalApprovedList = injuryProposalDAOimpl.beforeInternalApprovedProposal();
		List<Proposal> vehicleInternalApprovedList = vehicleProposalDAOimpl.beforeInternalApprovedProposal();
		
		model.addAttribute("fireList", fireInternalApprovedList);
		model.addAttribute("injuryList", injuryInternalApprovedList);
		model.addAttribute("vehicleList", vehicleInternalApprovedList);
		
		return "beforeInternalApproved"; // DAO로 가는 곳
    }
	
	//내부승인 요청 후 (완료는 아니고 그냥 요청만._.)
	@RequestMapping({"/afterInternalApproved"})
	public String requestInternalApproved(Model model) {

		List<Proposal> fireInternalApprovedList = fireProposalDAOimpl.afterInternalApprovedProposal();
		List<Proposal> injuryInternalApprovedList = injuryProposalDAOimpl.afterInternalApprovedProposal();
		List<Proposal> vehicleInternalApprovedList = vehicleProposalDAOimpl.afterInternalApprovedProposal();
		
		model.addAttribute("fireList", fireInternalApprovedList);
		model.addAttribute("injuryList", injuryInternalApprovedList);
		model.addAttribute("vehicleList", vehicleInternalApprovedList);
		
		return "afterInternalApproved"; // DAO로 가는 곳
    }
	
	@RequestMapping({"/checkedBeforeInternalApproved"})
	public String checkedBeforeInternalApproved(Model model, String whichProposal, int proposalID) {
//		System.out.println(fireProposalRequest + "~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		List<Proposal> fireInternalApprovedList = fireProposalDAOimpl.beforeInternalApprovedProposal();
		List<Proposal> injuryInternalApprovedList = injuryProposalDAOimpl.beforeInternalApprovedProposal();
		List<Proposal> vehicleInternalApprovedList = vehicleProposalDAOimpl.beforeInternalApprovedProposal();
		
		model.addAttribute("fireList", fireInternalApprovedList);
		model.addAttribute("injuryList", injuryInternalApprovedList);
		model.addAttribute("vehicleList", vehicleInternalApprovedList);
		
//		System.out.println(whichProposal + "  ~~  " + proposalID);
		
		if(whichProposal.equals("fire")) {
			this.fireProposalDAOimpl.requestInternalApproved(proposalID, null);
		}else if(whichProposal.equals("injury")) {
			this.injuryProposalDAOimpl.requestInternalApproved(proposalID, null);
		}else if(whichProposal.equals("vehicle")) {
			this.vehicleProposalDAOimpl.requestInternalApproved(proposalID, null);
		}else {
			System.out.println("~NONE~");
		}
		
		return "redirect:/beforeInternalApproved"; // DAO로 가는 곳
    }
	
	@RequestMapping({"/checkedAfterInternalApproved"})
	public String checkedAfterInternalApproved(Model model, String whichProposal, int proposalID) {
//		System.out.println(fireProposalRequest + "~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		List<Proposal> fireInternalApprovedList = fireProposalDAOimpl.afterInternalApprovedProposal();
		List<Proposal> injuryInternalApprovedList = injuryProposalDAOimpl.afterInternalApprovedProposal();
		List<Proposal> vehicleInternalApprovedList = vehicleProposalDAOimpl.afterInternalApprovedProposal();
		
		model.addAttribute("fireList", fireInternalApprovedList);
		model.addAttribute("injuryList", injuryInternalApprovedList);
		model.addAttribute("vehicleList", vehicleInternalApprovedList);
		
//		System.out.println(whichProposal + "  ~~  " + proposalID);
		
		if(whichProposal.equals("fire")) {
			this.fireProposalDAOimpl.internalApproved(proposalID, null);
		}else if(whichProposal.equals("injury")) {
			this.injuryProposalDAOimpl.internalApproved(proposalID, null);
		}else if(whichProposal.equals("vehicle")) {
			this.vehicleProposalDAOimpl.internalApproved(proposalID, null);
		}else {
			System.out.println("~NONE~");
		}
		
		return "redirect:/afterInternalApproved"; // DAO로 가는 곳
    }
	
	

	@RequestMapping(value = "/writeProposal", method = RequestMethod.POST) // 제안서 작성완료 (작성종료, 내부승인요청버튼)
	public String submitProposal(@RequestParam HashMap<String, Object> pmap) {
		String whichProposal = (String) pmap.get("whichProposal");
		pmap.put("insuranceDeveloperTeamID", 1); // 정필컴퍼니 강제
		pmap.put("isInternalApproved", 0);
		pmap.put("isExternalApproved", 0);
		
		if(whichProposal.equals("fire")) {
			this.fireProposalDAOimpl.writeProposal(pmap);
		}else if(whichProposal.equals("injury")) {
			this.injuryProposalDAOimpl.writeProposal(pmap);
		}else if(whichProposal.equals("vehicle")) {
			this.vehicleProposalDAOimpl.writeProposal(pmap);
		}else {
			System.out.println("~NONE~");
		}
		return "writeProposal";
	}
	
	//원래 없던 내용 임시로 만듦ㅁㅁㅁㅁ
	@RequestMapping({ "/writeProposal" })
	public String writeProposals(Model model) {
		return "writeProposal";
	}
	
}
