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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.test.dao.CustomerDAO;
import com.test.dao.InsuranceInternalApproverDAO;
import com.test.dao.SalesmanDAO;
import com.test.dto.Customer;
import com.test.dto.InsuranceInternalApprover;
import com.test.dto.Salesman;

@Controller
@SessionAttributes({"customer", "salesman", "insuranceInteralApprover"})
public class HomeController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	private SalesmanDAO salesmanDAO;
	
	@Autowired
	private InsuranceInternalApproverDAO insuranceInternalApproverDAO;
	
	@RequestMapping({"/index", "/"})
	public String chat(Model model, HttpSession session) {
		if(session.getAttribute("customer") != null) {
			model.addAttribute("who", "customer");
		}else if(session.getAttribute("salesman") != null) {
			model.addAttribute("who", "salesman");
		}else if(session.getAttribute("insuranceInteralApprover") != null) {
			model.addAttribute("who", "insuranceInteralApprover");
		}else { // all null
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
			model.addAttribute("customer", customers.get(0));
			if(customers.size() == 0) {
				return "redirect:index";
			}
		}else if(whoLogin.equals("영업사원")) {
			List<Salesman> salesmans = this.salesmanDAO.login(loginInfo);
			if(salesmans.size() == 0) {
				return "redirect:index";
			}
			model.addAttribute("salesman", salesmans.get(0));
		}else if(whoLogin.equals("내부승인자")) {
			List<InsuranceInternalApprover> insuranceInteralApprovers = this.insuranceInternalApproverDAO.login(loginInfo);
			if(insuranceInteralApprovers.size() == 0) {
				return "redirect:index";
			}
			model.addAttribute("insuranceInteralApprover", insuranceInteralApprovers.get(0));
		}
		return "redirect:index";
	}

	
	@RequestMapping(value = "/logout")
	public String logout(Model model, SessionStatus status) {
		status.setComplete(); // sessionAttribute를 초기화해준다.
		return "redirect:/";
	}
	
}
