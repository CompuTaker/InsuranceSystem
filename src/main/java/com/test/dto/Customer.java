package com.test.dto;

import java.util.List;

import com.test.enumeration.IllHistory;
import com.test.enumeration.Job;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class Customer {

	private int familyIllHistory;
	private String loginID;
	private int customerID;
	private boolean advertisementAcceptance;
	private int age;
	private List<IllHistory> illHistory;
	private String password;
	private List<AccidentHistory> accidentHistoryList;
	private int gender;
	private int salesmanID;
	private String name;
	private String email;
	private int property;
	private String socialSecurityNumber;
	private String address;
	private Job job;

	public Customer(){

	}

	public void finalize() throws Throwable {

	}

}