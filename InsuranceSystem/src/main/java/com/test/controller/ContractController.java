package com.test.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.test.dao.ContractDAO;
import com.test.dao.ContractInsuranceDAO;
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
import com.test.dto.Customer;
import com.test.dto.InsurancePayment;
import com.test.dto.InsurancePaymentList;
import com.test.enumeration.Bank;


@Controller
@SessionAttributes({"customer"})
public class ContractController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	private ContractDAO contractDAO;

	@Autowired
	private ContractManagerDAO contractManagerDAO;
	
	@Autowired
	private RecipientDAO recipientDAO;

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
    private ContractInsuranceDAO contractInsuranceDAO;
	
	@RequestMapping("/allContract")
	public String showContract(Model model, HttpSession session) {
//		HttpSession session
		Customer customer = (Customer) session.getAttribute("customer");
		int customerID = 0;
		if(customer != null) {
			customerID = customer.getCustomerID();
		} else {
			return "redirect:logout";
		}
		
		//고객이름
		String customerName = customerDAO.showCustomerName(customerID);
		
		//고객의 계약 전체 받아오기
		List<Contract> allContract = contractDAO.showAllContract(customerID);
		
		// ID만 빼오기
		List<Integer> allContractManagerID = new ArrayList<Integer>();
		List<Integer> recipientID = new ArrayList<Integer>();
		List<Integer> insuranceID = new ArrayList<Integer>();
		List<String> insuranceType = new ArrayList<String>();
		for(Contract contract : allContract) {
			System.out.println("contract.getInsuranceType ==> " + contract.getInsuranceType());
			allContractManagerID.add(contract.getContractManagerID());
			recipientID.add(contract.getRecipientID());
			insuranceID.add(contract.getInsuranceID());
			insuranceType.add(contract.getInsuranceType());
		}
		
		//계약관리자 ID로 이름 다 받아오기
		List<String> allContractManager = contractManagerDAO.showCustomerContractManager(allContractManagerID);
		
		//수취인 ID로 이름 다 받아오기
		List<String> recipientName = recipientDAO.showRecipientName(recipientID);
		
		List<String> insuranceName = new ArrayList<String>();
		System.out.println("insuranceID.size ==> " + insuranceID.size());
		System.out.println("insuranceType.size ==> " +insuranceType.size());
		for(int i = 0; i < insuranceID.size(); i++) {
			int proposalID = 0;
			if(insuranceType.get(i).equals("fire")) {
				proposalID = fireInsuranceDAOimpl.getProprosalID(insuranceID.get(i));
				insuranceName.add(fireProposalDAOimpl.getProprosalName(proposalID));
			} else if(insuranceType.get(i).equals("injury")) {
				proposalID = injuryInsuranceDAOimpl.getProprosalID(insuranceID.get(i));
				insuranceName.add(injuryProposalDAOimpl.getProprosalName(proposalID));
			} else if(insuranceType.get(i).equals("vehicle")) {
				proposalID = vehicleInsuranceDAOimpl.getProprosalID(insuranceID.get(i));
				insuranceName.add(vehicleProposalDAOimpl.getProprosalName(proposalID));
			}

		}
		
		model.addAttribute("insuranceName", insuranceName);
		model.addAttribute("customerID", customerID);
		model.addAttribute("customerName", customerName);
		model.addAttribute("contract", allContract);
		model.addAttribute("contractManager", allContractManager);
		model.addAttribute("recipientName", recipientName);
		
		return "allContract";
		
		}
	
	@RequestMapping("/contractDetailID")
	public String showContractDetail(Model model, int contractID, int customerID) {
		

		//고객이름
		String customerName = customerDAO.showCustomerName(customerID);
		
		//상세보기 계약  받아오기
		Contract contract = contractDAO.showContractDetail(contractID);
		
		//계약관리자 이름 받아오기
		String contractManagerName = contractManagerDAO.showDetailContractManagerName(contract.getContractManagerID());
		
		//수령인 이름 받아오기
		String recipientName = recipientDAO.showDetailRecipientName(contract.getRecipientID());
		
		
		
		String insuranceName = new String();
		if(contract.getInsuranceType().equals("fire")) {
			insuranceName = fireProposalDAOimpl.getProprosalName(fireInsuranceDAOimpl.getProprosalID(contract.getInsuranceID()));
		} else if(contract.getInsuranceType().equals("injury")) {
			insuranceName = injuryProposalDAOimpl.getProprosalName(injuryInsuranceDAOimpl.getProprosalID(contract.getInsuranceID()));
		} else if(contract.getInsuranceType().equals("vehicle")) {
			insuranceName = vehicleProposalDAOimpl.getProprosalName(vehicleInsuranceDAOimpl.getProprosalID(contract.getInsuranceID()));
		} 
			
		String startDate = new SimpleDateFormat("yyyy-MM-dd").format(contract.getContractRemainingPeriod());
		String endDate = new SimpleDateFormat("yyyy-MM-dd").format(contract.getContractExpirationDate());

		model.addAttribute("customerName", customerName);
		model.addAttribute("customerID", customerID);
		model.addAttribute("contract", contract);
		model.addAttribute("contractManagerName", contractManagerName);
		model.addAttribute("recipientName", recipientName);
		model.addAttribute("insuranceName", insuranceName);
		
		model.addAttribute("startDate", startDate);
		model.addAttribute("endDate", endDate);
		
		return "contractDetail";
	}
	
	@RequestMapping("/checkInsuranceMoney")
	public String checkInsuranceMoney(Model model, int contractID, int customerID) {
		
		//고객이름
		String customerName = customerDAO.showCustomerName(customerID);
		
		//상세보기 계약  받아오기
		Contract contract = contractDAO.showContractDetail(contractID);
		InsurancePaymentList paymentList = contractDAO.showPaymentList(contract.getInsurancePaymentListID());
		List<InsurancePayment> payment = contractDAO.showPayment(paymentList.getInsurancePaymentListID());
		
		String insuranceName = new String();
		if(contract.getInsuranceType().equals("fire")) {
			insuranceName = fireProposalDAOimpl.getProprosalName(fireInsuranceDAOimpl.getProprosalID(contract.getInsuranceID()));
		} else if(contract.getInsuranceType().equals("injury")) {
			insuranceName = injuryProposalDAOimpl.getProprosalName(injuryInsuranceDAOimpl.getProprosalID(contract.getInsuranceID()));
		} else if(contract.getInsuranceType().equals("vehicle")) {
			insuranceName = vehicleProposalDAOimpl.getProprosalName(vehicleInsuranceDAOimpl.getProprosalID(contract.getInsuranceID()));
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
	public String destroyContract(Model model, int contractID, int customerID ) {
		
		contractDAO.destroyContract(contractID);
		
		//고객이름
		String customerName = customerDAO.showCustomerName(customerID);
		
		//고객의 계약 전체 받아오기
		List<Contract> allContract = contractDAO.showAllContract(customerID);
		
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
		List<String> allContractManager = contractManagerDAO.showCustomerContractManager(allContractManagerID);
		
		//수취인 ID로 이름 다 받아오기
		List<String> recipientName = recipientDAO.showRecipientName(recipientID);
		
		List<String> insuranceName = new ArrayList<String>();
		for(int i = 0; i < insuranceID.size(); i++) {
			int proposalID = 0;
			if(insuranceType.get(i).equals("fire")) {
				proposalID = fireInsuranceDAOimpl.getProprosalID(insuranceID.get(i));
				insuranceName.add(fireProposalDAOimpl.getProprosalName(proposalID));
			} else if(insuranceType.get(i).equals("injury")) {
				proposalID = injuryInsuranceDAOimpl.getProprosalID(insuranceID.get(i));
				insuranceName.add(injuryProposalDAOimpl.getProprosalName(proposalID));
			} else if(insuranceType.get(i).equals("vehicle")) {
				proposalID = vehicleInsuranceDAOimpl.getProprosalID(insuranceID.get(i));
				insuranceName.add(vehicleProposalDAOimpl.getProprosalName(proposalID));
			}
		}
		
		model.addAttribute("insuranceName", insuranceName);
		model.addAttribute("customerName", customerName);
		model.addAttribute("contract", allContract);
		model.addAttribute("contractManager", allContractManager);
		model.addAttribute("recipientName", recipientName);
		
		return "index";
	}
	
	@RequestMapping("/insertContract")
	public String insertContract(Model model, @RequestParam HashMap<String, Object> ctmap) {
		// String -> Date(yyyy-MM-dd) -> yyyy-MM-dd포맷으로 변환 -> String으로 ctmap에 저장
		
		// ctmap에 넣어줄 값
		String contractExpirationDate = null;
		
		DateFormat requestDT = new SimpleDateFormat("yyyy-MM-dd");
		
		String contractExpirationDateString = ctmap.get("contractExpirationDate") + "";
		try {
			// 문자열 source를 날짜 Date 인스턴스로 변환 : Wed Dec 25 00:00:00 KST 2024  이러한 형식임
			Date date = requestDT.parse(contractExpirationDateString);
			
			// Date의 format을 yyyy-MM-dd로 변환하여 String으로 return
			// Date 형식으로 return받지 못함..
			contractExpirationDate = requestDT.format(date);
			
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
//			e1.printStackTrace();
			System.out.println("~DateParsingProblem~");
		}		
		
		Date contractRemainingPeriod = new Date();
		
		UnderwritingTestStub underwritingTestStub = new UnderwritingTestStub();
		int insurancePayment = underwritingTestStub.calculateInsurancePayment(
					Float.parseFloat(ctmap.get("extraChargeRate") + ""));
		
		int insurancePaymentListID = contractDAO.makePaymentList(insurancePayment);
		
		ctmap.put("contractExpirationDate", contractExpirationDate);
		ctmap.put("contractRemainingPeriod", contractRemainingPeriod);
		ctmap.put("insurancePayment", insurancePayment);
		ctmap.put("insurancePaymentListID", insurancePaymentListID);
		
		int contractID = this.contractDAO.insertContract(ctmap);
		Map<String, Object> conInsMap = new HashMap<String, Object>();
		conInsMap.put("contractID", contractID);
		conInsMap.put("insuranceType", ctmap.get("insuranceType"));
		conInsMap.put("insuranceID", ctmap.get("insuranceID"));
		int res = this.contractInsuranceDAO.insertContractInsurane(conInsMap);
		System.out.println("insertContractInsurance res  : " + res);
		
		return "redirect:/";
	}
	
	@RequestMapping("/payCard")
	public String payCard(Model model, int paymentAmount, int paymentListID) {
		
		contractDAO.payCard(paymentAmount, paymentListID);
		
		return "redirect:index";
	}
	
}