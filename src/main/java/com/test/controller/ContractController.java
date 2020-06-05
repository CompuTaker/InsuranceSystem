package com.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.dao.ContractDAO;
import com.test.dao.ContractManagerDAO;
import com.test.dao.CustomerDAO;
import com.test.dao.FireInsuranceDAOimpl;
import com.test.dao.FireProposalDAOimpl;
import com.test.dao.InjuryInsuranceDAOimpl;
import com.test.dao.InjuryProposalDAOimpl;
import com.test.dao.RecipientDAO;
import com.test.dao.VehicleInsuranceDAOimpl;
import com.test.dao.VehicleProposalDAOimpl;
import com.test.dto.Contract;


@Controller
public class ContractController {
	
	@Autowired
	CustomerDAO customerDAOimpl;
	
	@Autowired
	ContractDAO contractDAOimpl;

	@Autowired
	ContractManagerDAO contractManagerDAOimpl;
	
	@Autowired
	RecipientDAO recipientDAOimpl;

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
	
	@RequestMapping("/allContract")
	public String showContract(Model model) {
		
		int customerID = 1;
		
		//고객이름
		String customerName = customerDAOimpl.showCustomerName(customerID);
		
		//고객의 계약 전체 받아오기
		List<Contract> allContract = contractDAOimpl.showAllContract(customerID);
		
		// ID만 빼오기
		List<Integer> allContractManagerID = new ArrayList<Integer>();
		List<Integer> recipientID = new ArrayList<Integer>();
		List<Integer> insuranceID = new ArrayList<Integer>();
		List<String> insuranceType = new ArrayList<String>();
		for(Contract contract : allContract) {
			allContractManagerID.add(contract.getContractManagerID());
			recipientID.add(contract.getRecipientID());
			insuranceID.add(contract.getInsuranceID());
			insuranceType.add(contract.getInsuranceType());
		}

		
		//계약관리자 ID로 이름 다 받아오기
		List<String> allContractManager = contractManagerDAOimpl.showCustomerContractManager(allContractManagerID);
		
		//수취인 ID로 이름 다 받아오기
		List<String> recipientName = recipientDAOimpl.showRecipientName(recipientID);
		
		List<String> insuranceName = new ArrayList<String>();
		for(int i = 0; i < insuranceID.size(); i++) {
			int proposalID = 0;
			switch(insuranceType.get(i)) {
			case "FireInsurance":
				proposalID = fireInsuranceDAOimpl.getProprosalID(insuranceID.get(i));
				insuranceName.add(fireProposalDAOimpl.getProprosalName(proposalID));
				break;
			case "InjuryInsurance": 
				proposalID = injuryInsuranceDAOimpl.getProprosalID(insuranceID.get(i));
				insuranceName.add(injuryProposalDAOimpl.getProprosalName(proposalID));
				break;
			case "VehicleInsurance":
				proposalID = vehicleInsuranceDAOimpl.getProprosalID(insuranceID.get(i));
				insuranceName.add(vehicleProposalDAOimpl.getProprosalName(proposalID));
				break;
			}

		}
		
//		System.out.println(customerName + "고객이름");
//		for(Contract contract : allContract) {
//			System.out.println(contract.getCustomerID() + "고객아이디");
//			System.out.println(contract.getBank() + "고객은행");
//			System.out.println(contract.getRecipientID() + "수취인아이디");
//			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");
//
//		}
//		
//		for(int i = 0; i < allContractManager.size(); i++) {
//			System.out.println(allContractManager + "매니져이름드으으을");
//			System.out.println(recipientName + "수취인이름드으응ㄹ");
//			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");
//		}
//		
//		
//		for(String name : insuranceName) {
//			System.out.println(name + "보험이르으으음");
//			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");
//		}
		
		model.addAttribute("insuranceName", insuranceName);
		model.addAttribute("customerName", customerName);
		model.addAttribute("contract", allContract);
		model.addAttribute("contractManager", allContractManager);
		model.addAttribute("recipientName", recipientName);
		
		return "allContract";
		
		}
		
}