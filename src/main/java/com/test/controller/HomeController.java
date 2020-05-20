package com.test.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
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

	@RequestMapping({ "/fireProposal" }) // 제안서 폼화면
	public String writeFireProposal(Model model) {
		return "fireProposal";
	}

	@RequestMapping({ "/injuryProposal" }) // 제안서 폼화면
	public String writeInjuryProposal(Model model) {
		return "injuryProposal";
	}

	@RequestMapping({ "/vehicleProposal" }) // 제안서 폼화면
	public String writeVehicleProposal(Model model) {
		return "vehicleProposal";
	}
	
	@RequestMapping(value = "/internalApprovedList", method = RequestMethod.POST, headers = ("content-type=multipart/*"))
    public ModelAndView customer_signupDo(@RequestParam File file) {
//      return this.customerService.customer_signupDo(multipartHttpServletRequest, cmap);
//      return this. //--> 내부승인 요청 검증자료
		return null; // DAO로 가는 곳
    }
	
}
