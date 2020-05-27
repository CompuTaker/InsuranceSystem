package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.test.dao.InsuranceDAO;
import com.test.dao.InsuranceDAOimpl;
import com.test.dto.Insurance;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
@Controller
@SessionAttributes({"customer", "salesman"})
public class InsuranceController {

	public InsuranceController(){

	}
		
	@Autowired
	private InsuranceDAO insuranceDAO;
	
	@Autowired
	private InsuranceDAOimpl insuranceDAOimpl;
	
		
	public Insurance showInsuranceDetail(int insuranceID){
		return null;
	}

	public List<Insurance> showAllInsurance(){
		return null;
	}
	
	@RequestMapping({ "/allInsurance" }) // 모든 보험 상품 보기
	public String showAllInsurnace(Model model) {
		
		List<Insurance> insuranceList = insuranceDAOimpl.showAllInsurance();
				
		model.addAttribute("insuranceList", insuranceList);
				
		return "allInsurance";
	}
	
	@RequestMapping(value = "/insuranceDetail", method = RequestMethod.GET) // 보험상품 상세보기
	public String showInsuranceDetail(Model model, int insuranceID) {
		System.out.println(insuranceID);
//		int insuranceID = Integer.parseInt(stringInsuranceID);
		Insurance insurance = insuranceDAO.showInsuranceDetail(insuranceID);
		
		model.addAttribute("insurance", insurance);
				
		return "allInsurance";
	}

}