package com.test.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.test.dao.CounselDAO;
import com.test.dao.FireInsuranceDAOimpl;
import com.test.dao.FireProposalDAOimpl;
import com.test.dao.InjuryInsuranceDAOimpl;
import com.test.dao.InjuryProposalDAOimpl;
import com.test.dao.VehicleInsuranceDAOimpl;
import com.test.dao.VehicleProposalDAOimpl;
import com.test.dto.Counsel;
import com.test.dto.Customer;
import com.test.dto.FireInsurance;
import com.test.dto.FireProposal;
import com.test.dto.InjuryInsurance;
import com.test.dto.InjuryProposal;
import com.test.dto.Insurance;
import com.test.dto.Proposal;
import com.test.dto.VehicleInsurance;
import com.test.dto.VehicleProposal;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
@Controller
@SessionAttributes({"customer", "salesman"})
public class InsuranceController {
		
	@Autowired
	private FireInsuranceDAOimpl fireInsuranceDAOimpl;
	
	@Autowired
	private InjuryInsuranceDAOimpl injuryInsuranceDAOimpl;
	
	@Autowired
	private VehicleInsuranceDAOimpl vehicleInsuranceDAOimpl;
	
	@Autowired
    private FireProposalDAOimpl fireProposalDAOimpl;

    @Autowired
    private InjuryProposalDAOimpl injuryProposalDAOimpl;
 
    @Autowired
    private VehicleProposalDAOimpl vehicleProposalDAOimpl;
    
    @Autowired
    private CounselDAO counselDAO;
        
    
	
	@RequestMapping({ "/allInsurance" }) // 모든 보험 상품 보기
	   public String showAllInsurnace(Model model) {
	      List<Proposal> fireProposalList = new ArrayList<Proposal>();
	      List<Proposal> injuryProposalList = new ArrayList<Proposal>();
	      List<Proposal> vehicleProposalList = new ArrayList<Proposal>();
	      
	      List<Insurance> fireInsuranceList = this.fireInsuranceDAOimpl.showAllInsurance();
	      for(Insurance fi : fireInsuranceList) {
	         FireInsurance castFi = (FireInsurance) fi;
	         Proposal prop = this.fireProposalDAOimpl.showSpecificProposal(castFi.getFireProposalID());
	         if(prop != null) { // prop != null
	            fireProposalList.add(prop);
	         }else {
	            FireProposal emptyProp = new FireProposal();
	            emptyProp.setFireProposalID(-1);
	            emptyProp.setProposalName("없음_오류_화재보험제안서");
	            fireProposalList.add(emptyProp);
	         }
	      }
	      
	      List<Insurance> injuryInsuranceList = this.injuryInsuranceDAOimpl.showAllInsurance();
	      for(Insurance ii : injuryInsuranceList) {
	         InjuryInsurance castIi = (InjuryInsurance) ii;
	         Proposal prop = this.injuryProposalDAOimpl.showSpecificProposal(castIi.getInjuryProposalID());
	         if(prop != null) { // prop != null
	            injuryProposalList.add(prop);
	         }else {
	            InjuryProposal emptyProp = new InjuryProposal();
	            emptyProp.setInjuryProposalID(-1);
	            emptyProp.setProposalName("없음_오류_상해보험제안서");
	            injuryProposalList.add(emptyProp);
	         }
	      }
	      
	      List<Insurance> vehicleInsuranceList = this.vehicleInsuranceDAOimpl.showAllInsurance();
	      for(Insurance vi : vehicleInsuranceList) {
	         VehicleInsurance castVi = (VehicleInsurance) vi;
	         Proposal prop = this.vehicleProposalDAOimpl.showSpecificProposal(castVi.getVehicleProposalID());
	         if(prop != null) { // prop != null
	        	 vehicleProposalList.add(prop);
	         }else {
	            VehicleProposal emptyProp = new VehicleProposal();
	            emptyProp.setVehicleProposalID(-1);
	            emptyProp.setProposalName("없음_오류_상해보험제안서");
	            vehicleProposalList.add(emptyProp);
	         }
	      }
	      
	      model.addAttribute("fireInsuranceList", fireInsuranceList);
	      model.addAttribute("injuryInsuranceList", injuryInsuranceList);
	      model.addAttribute("vehicleInsuranceList", vehicleInsuranceList);
	      
	      model.addAttribute("fireProposalList", fireProposalList);
	      model.addAttribute("injuryProposalList", injuryProposalList);
	      model.addAttribute("vehicleProposalList", vehicleProposalList);
	      
		
		return "allInsurance";
	}
	
	
	
	@RequestMapping(value = "/insuranceDetail") // 보험상품 상세보기
	public String showInsuranceDetail(Model model, String whichInsurance, int insuranceID) {
		FireInsurance finsurance = null;
		InjuryInsurance iinsurance = null;
		VehicleInsurance vinsurance = null;
		
		if(whichInsurance.equals("fire")) {
			finsurance = (FireInsurance) this.fireInsuranceDAOimpl.showInsuranceDetail(insuranceID);
			FireProposal fp = (FireProposal) this.fireProposalDAOimpl.showSpecificProposal(finsurance.getFireProposalID());
			model.addAttribute("Proposal", fp);
			model.addAttribute("Insurance", finsurance);
		}else if(whichInsurance.equals("injury")) {
			iinsurance = (InjuryInsurance)this.injuryInsuranceDAOimpl.showInsuranceDetail(insuranceID);
			InjuryProposal ip = (InjuryProposal) this.injuryProposalDAOimpl.showSpecificProposal(iinsurance.getInjuryProposalID());
			model.addAttribute("Proposal", ip);
			model.addAttribute("Insurance", iinsurance);
		}else if(whichInsurance.equals("vehicle")) {
			vinsurance = (VehicleInsurance) this.vehicleInsuranceDAOimpl.showInsuranceDetail(insuranceID);
			VehicleProposal vp = (VehicleProposal) this.vehicleProposalDAOimpl.showSpecificProposal(vinsurance.getVehicleProposalID());
			model.addAttribute("Proposal", vp);
			model.addAttribute("Insurance", vinsurance);
		}else {
			System.out.println("~~NONE_insuranceDetail~~");
			return "redirect:/";
		}
		return whichInsurance + "InsuranceDetail";
		// fire/injury/vehicle/insuranceDetail
	}
	
	
	@RequestMapping(value = "/requestCounsel") // 상담요청하기
	public String requestConsel(Model model, HttpSession session, int insuranceID, String whichInsuranceDetail, String isBack) {

		Customer customer = (Customer) session.getAttribute("customer");
		if (customer == null) {
			System.out.println("로그인을 해주세요~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			return "redirect:logout";

		} else {
			String loginID = customer.getLoginID();
			model.addAttribute("loginID", loginID);
			model.addAttribute("insuranceID", insuranceID);
			model.addAttribute("insuranceType", whichInsuranceDetail);
			model.addAttribute("isBack", isBack);
			return "requestCounsel";
		}
	}
	
	@RequestMapping(value = "/requestCounsel_ok") // 상담요청하기
	public String requestConsel_ok(Model model, HttpSession session, @RequestParam HashMap<String, String> requestCounsel) {
		Customer customer = (Customer) session.getAttribute("customer");
		
		// 날짜만들기
		Date from = new Date();
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		String date = transFormat.format(from);
		
		// counsel만들기
		Counsel counsel = new Counsel();
		counsel.setCustomerID(customer.getCustomerID());
		counsel.setCounselDate(date);
		counsel.setCounselTopic(requestCounsel.get("counselTopic"));
		counsel.setCounselContent(requestCounsel.get("counselContent"));
		
		System.out.println("counsel Topic : " + counsel.getCounselTopic());
		
		// insert counsel
		counselDAO.writeCounselContent(counsel);
				
		return "requestCounsel_ok";
	}

}