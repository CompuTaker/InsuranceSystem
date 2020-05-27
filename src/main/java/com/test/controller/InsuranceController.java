package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.test.dao.FireInsuranceDAOimpl;
import com.test.dao.InjuryInsuranceDAOimpl;
import com.test.dao.InsuranceDAO;
import com.test.dao.InsuranceDAOimpl;
import com.test.dao.VehicleInsuranceDAOimpl;
import com.test.dto.Insurance;

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
	
	public Insurance showInsuranceDetail(int insuranceID){
		return null;
	}

	public List<Insurance> showAllInsurance(){
		return null;
	}
	
	@RequestMapping({ "/allInsurance" }) // 모든 보험 상품 보기
	public String showAllInsurnace(Model model) {
		
		List<Insurance> fireInsuranceList = this.fireInsuranceDAOimpl.showAllInsurance();
		List<Insurance> injuryInsuranceList = this.injuryInsuranceDAOimpl.showAllInsurance();
		List<Insurance> vehicleInsuranceList = this.vehicleInsuranceDAOimpl.showAllInsurance();
		
		model.addAttribute("fireInsuranceList", fireInsuranceList);
		model.addAttribute("injuryInsuranceList", injuryInsuranceList);
		model.addAttribute("vehicleInsuranceList", vehicleInsuranceList);
		
		return "allInsurance";
	}
	
	@RequestMapping(value = "/insuranceDetail", method = RequestMethod.GET) // 보험상품 상세보기
	public String showInsuranceDetail(Model model, String whichInsurance, int insuranceID) {
		System.out.println(insuranceID);
		Insurance insurance = null;
		if(whichInsurance.equals("fire")) {
			insurance = this.fireInsuranceDAOimpl.showInsuranceDetail(insuranceID);
		}else if(whichInsurance.equals("injury")) {
			insurance = this.injuryInsuranceDAOimpl.showInsuranceDetail(insuranceID);
		}else if(whichInsurance.equals("vehicle")) {
			insurance = this.vehicleInsuranceDAOimpl.showInsuranceDetail(insuranceID);
		}else {
			System.out.println("~~NONE_insuranceDetail~~");
			return "redirect:/";
		}
		model.addAttribute("insurance", insurance);		
		return "insuranceDetail";
	}

}