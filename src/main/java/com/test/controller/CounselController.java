package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.test.dto.Customer;
import com.test.dto.Insurance;
import com.test.dto.Salesman;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
@Controller
@SessionAttributes({"customer", "salesman", "insuranceInteralApprover"})
public class CounselController {
	
	// 상담, 영업사원, 고객
	// Consel, Salesman, Customer DAOs
	
	

	/**
	 * 
	 * @param ��
	 * @param �������
	 */
	public int requestConsel(Customer customer, Salesman salesman){
		return 0;
	}

	/**
	 * 
	 * @param �̸�
	 * @param ���ǳ���
	 * @param ����ó
	 * @param �����ǰ
	 * @param �������
	 */
	public int requestCounsel_anon(String name, String conselContent, String phoneNumber, Insurance insurance, Salesman salesman){
		return 0;
	}

	public Salesman assignSalesman(){
		return null;
	}

}