package com.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.test.dao.CustomerDAO;
import com.test.dao.InsuranceDeveloperDAO;
import com.test.dao.InsuranceInternalApproverDAO;
import com.test.dao.SalesmanDAO;
import com.test.dto.Customer;
import com.test.dto.InsuranceDeveloper;
import com.test.dto.InsuranceInternalApprover;
import com.test.dto.Salesman;
import com.test.enumeration.Job;

@Controller
@SessionAttributes({"customer", "salesman", "insuranceInteralApprover", "insuranceDeveloper"})
public class HomeController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	private SalesmanDAO salesmanDAO;
	
	@Autowired
	private InsuranceInternalApproverDAO insuranceInternalApproverDAO;
	
	@Autowired
	private InsuranceDeveloperDAO insuranceDeveloperDAO;
	
	@RequestMapping({"/index", "/"})
	public String chat(Model model, HttpSession session) {
		if(session.getAttribute("customer") != null) {
			model.addAttribute("who", "customer");
		} else if(session.getAttribute("salesman") != null) {
			model.addAttribute("who", "salesman");
		} else if(session.getAttribute("insuranceInteralApprover") != null) {
			model.addAttribute("who", "insuranceInteralApprover");
		} else if(session.getAttribute("insuranceDeveloper") != null) {
			model.addAttribute("who", "insuranceDeveloper");
		} else { // all null
			model.addAttribute("who", "anon");
		}
		return "index"; // chat.jsp
	}
	
	@RequestMapping(value = "/login")
	public String loginDo(Model model) {
		return "login";
	}
	
	@RequestMapping(value = "/loginDo", method = RequestMethod.POST)
	public String loginDo(Model model, String id, String pw, String whoLogin, HttpSession session, SessionStatus status) {
		Map<String, String> loginInfo = new HashMap<String, String>();
		loginInfo.put("id", id); // Map객체에 Id값을 저장한다.
		loginInfo.put("pw", pw); // Map객체에 PW값을 저장한다.
		if(whoLogin.equals("고객")) {
			List<Customer> customers = this.customerDAO.login(loginInfo);
			if(customers.size() == 0) {
				return "redirect:index";
			}
//			model.addAttribute("customer", customers.get(0));
			session.setAttribute("customer", customers.get(0));
		} else if(whoLogin.equals("영업사원")) {
			List<Salesman> salesmans = this.salesmanDAO.login(loginInfo);
			if(salesmans.size() == 0) {
				return "redirect:index";
			}
//			model.addAttribute("salesman", salesmans.get(0));
			session.setAttribute("salesman", salesmans.get(0));
		} else if(whoLogin.equals("내부승인자")) {
			List<InsuranceInternalApprover> insuranceInteralApprovers = this.insuranceInternalApproverDAO.login(loginInfo);
			if(insuranceInteralApprovers.size() == 0) {
				return "redirect:index";
			}
//			model.addAttribute("insuranceInteralApprover", insuranceInteralApprovers.get(0));
			session.setAttribute("insuranceInteralApprover", insuranceInteralApprovers.get(0));
		} else if(whoLogin.equals("보험개발자")) {
			List<InsuranceDeveloper> insuranceDevelopers = this.insuranceDeveloperDAO.login(loginInfo);
			if(insuranceDevelopers.size() == 0) {
				return "redirect:index";
			} 
//			model.addAttribute("insuranceDeveloper", insuranceDevelopers.get(0));
			session.setAttribute("insuranceDeveloper", insuranceDevelopers.get(0));
		}
		return "redirect:index";
	}

	
	@RequestMapping(value = "/logout")
	public String logout(Model model, SessionStatus status) {
		status.setComplete(); // sessionAttribute를 초기화해준다.
		return "redirect:login";
	}
	
	@RequestMapping(value = "/signUp")
	public String signUp(Model model) {
		model.addAttribute("jobs", Job.values());
		return "signUp";
	}
	
	@RequestMapping(value = "/signUpComplete")
	public String signUpComplete(@RequestParam HashMap<String, Object> pmap) {
		customerDAO.signUp(pmap);
		System.out.println("회원가입 완료 페이지");
		return "redirect:login";
	}
	
	@RequestMapping(value = "/checkDuplicate") // 중복확인 (ID, 주민등록번호)
	@ResponseBody
	public String checkDuplicate(Model model, @RequestParam HashMap<String, Object> amap) {
		String res = "";
		String id = (String) amap.get("id");
		String ssn = (String) amap.get("ssn");
		System.out.println("id ajax => " + id);
		System.out.println("ssn ajax => " + ssn);
		List<Customer> customersByID = this.customerDAO.showCustomerByLoginID(id);
		List<Customer> customersBySSN = this.customerDAO.showCustomerBySocialSecurityNumber(ssn);
		if(customersByID.size() > 0) {
			res = res + "id ";
		}
		if(customersBySSN.size() > 0) {
			res = res + "ssn ";
		}
		return res; // Ajax
	}
	
	@RequestMapping(value = "/checkLogin") // 중복확인 (ID, 주민등록번호)
	@ResponseBody
	public String checkLogin(Model model, @RequestParam HashMap<String, Object> amap) {
		String res = "";
		String id = (String) amap.get("id");
		String pw = (String) amap.get("pw");
		String type = (String) amap.get("type");
		
		System.out.println("type ajax =>" + type);
		System.out.println("id ajax => " + id);
		System.out.println("pw ajax => " + pw);
		
		
		if(type.equals("보험개발자")) {
			

				if(this.insuranceDeveloperDAO.checkByPw(id, pw)) {
					res = "";
				} else {
					res = "false";
				}
			
			
		} else if(type.equals("고객")) {
			List<Customer> customersByID = this.customerDAO.showCustomerByLoginID(id);
			
			
			if(customersByID.size() > 0) {
				if(this.customerDAO.checkCustomerByPw(id, pw)) {
					res = "";
				} else {
					res = "false";
				}
			} else {
				res = "false";
			}
			
		} else if(type.equals("영업사원")) {

				if(this.salesmanDAO.checkByPw(id, pw)) {
					res = "";
				} else {
					res = "false";
				}
			
		} else if(type.equals("내부승인자")) {

			if(this.insuranceInternalApproverDAO.checkByPw(id, pw)) {
					res = "";
				} else {
					res = "false";
				}
			
			
		}
		return res;

	}
	
}
