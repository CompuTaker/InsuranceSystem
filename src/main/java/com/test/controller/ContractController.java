package com.test.controller;

import java.text.SimpleDateFormat;
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
import com.test.dto.InsurancePayment;
import com.test.dto.InsurancePaymentList;
import com.test.enumeration.Bank;
import com.test.enumeration.Job;


@Controller
public class ContractController {
	
	@Autowired
	private CustomerDAO customerDAOimpl;
	
	@Autowired
	private ContractDAO contractDAOimpl;

	@Autowired
	private ContractManagerDAO contractManagerDAOimpl;
	
	@Autowired
	private RecipientDAO recipientDAOimpl;

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
		
		model.addAttribute("insuranceName", insuranceName);
		model.addAttribute("customerName", customerName);
		model.addAttribute("contract", allContract);
		model.addAttribute("contractManager", allContractManager);
		model.addAttribute("recipientName", recipientName);
		
		return "allContract";
		
		}
	
	@RequestMapping("/contractDetailID")
	public String showContractDetail(Model model, int contractID) {

		int customerID = 1;
		
		//고객이름
		String customerName = customerDAOimpl.showCustomerName(customerID);
		
		//상세보기 계약  받아오기
		Contract contract = contractDAOimpl.showContractDetail(contractID);
		
		//계약관리자 이름 받아오기
		String contractManagerName = contractManagerDAOimpl.showDetailContractManagerName(contract.getContractManagerID());
		
		//수령인 이름 받아오기
		String recipientName = recipientDAOimpl.showDetailRecipientName(contract.getRecipientID());
		
		
		
		String insuranceName = new String();
			switch(contract.getInsuranceType()) {
			case "FireInsurance":
				insuranceName = fireProposalDAOimpl.getProprosalName(fireInsuranceDAOimpl.getProprosalID(contract.getInsuranceID()));
				break;
			case "InjuryInsurance": 
				insuranceName = injuryProposalDAOimpl.getProprosalName(injuryInsuranceDAOimpl.getProprosalID(contract.getInsuranceID()));
				break;
			case "VehicleInsurance":
				insuranceName = vehicleProposalDAOimpl.getProprosalName(vehicleInsuranceDAOimpl.getProprosalID(contract.getInsuranceID()));
				break;
			}
			
		String startDate = new SimpleDateFormat("yyyy-MM-dd").format(contract.getContractRemainingPeriod());
		String endDate = new SimpleDateFormat("yyyy-MM-dd").format(contract.getContractExpirationDate());

		model.addAttribute("customerName", customerName);
		model.addAttribute("contract", contract);
		model.addAttribute("contractManagerName", contractManagerName);
		model.addAttribute("recipientName", recipientName);
		model.addAttribute("insuranceName", insuranceName);
		
		model.addAttribute("startDate", startDate);
		model.addAttribute("endDate", endDate);
		
		return "contractDetail";
	}
	
	@RequestMapping("/checkInsuranceMoney")
	public String checkInsuranceMoney(Model model, int contractID) {
		
		int customerID = 1;
		
		//고객이름
		String customerName = customerDAOimpl.showCustomerName(customerID);
		
		//상세보기 계약  받아오기
		Contract contract = contractDAOimpl.showContractDetail(contractID);
		InsurancePaymentList paymentList = contractDAOimpl.showPaymentList(contract.getInsurancePaymentListID());
		List<InsurancePayment> payment = contractDAOimpl.showPayment(paymentList.getInsurancePaymentListID());
		
		String insuranceName = new String();
		switch(contract.getInsuranceType()) {
		case "FireInsurance":
			insuranceName = fireProposalDAOimpl.getProprosalName(fireInsuranceDAOimpl.getProprosalID(contract.getInsuranceID()));
			break;
		case "InjuryInsurance": 
			insuranceName = injuryProposalDAOimpl.getProprosalName(injuryInsuranceDAOimpl.getProprosalID(contract.getInsuranceID()));
			break;
		case "VehicleInsurance":
			insuranceName = vehicleProposalDAOimpl.getProprosalName(vehicleInsuranceDAOimpl.getProprosalID(contract.getInsuranceID()));
			break;
		}
		
		List<String> date = new ArrayList<String>();
		
		for(InsurancePayment insurancePayment: payment) {
			date.add(new SimpleDateFormat("yyyy-MM-dd").format(insurancePayment.getInsurancePaymentDate()));
		}
		
		model.addAttribute("customerName", customerName);
		model.addAttribute("insuranceName", insuranceName);
		model.addAttribute("paymentList", paymentList);
		model.addAttribute("payment", payment);
		model.addAttribute("date", date);
		model.addAttribute("banks", Bank.values());
		
		return "checkInsuranceMoney";
	}
	


	@RequestMapping("/destroyContract")
	public String destroyContract(Model model, int contractID) {
		contractDAOimpl.destroyContract(contractID);

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
		
		model.addAttribute("insuranceName", insuranceName);
		model.addAttribute("customerName", customerName);
		model.addAttribute("contract", allContract);
		model.addAttribute("contractManager", allContractManager);
		model.addAttribute("recipientName", recipientName);
		
		return "allContract";
	}
		
	@RequestMapping("/payCard")
	public String payCard(Model model, int paymentAmount, int paymentListID) {
		
		contractDAOimpl.payCard(paymentAmount, paymentListID);
		
		return "redirect:index";
	}
	
}