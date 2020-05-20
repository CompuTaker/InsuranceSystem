package com.test.controller;

import java.util.Date;
import java.util.List;

import com.test.dao.AccidentDAO;
import com.test.dao.ContractDAO;
import com.test.dao.CustomerDAO;
import com.test.dto.Accident;
import com.test.dto.AccidentManager;
import com.test.dto.ClaimAdjuster;
import com.test.dto.Customer;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public class AccidentController {

//	public CustomerDAO customerDAO;
//	public AccidentDAO accidentDAO;
//	public ContractDAO contractDAO;

	public AccidentController(){

	}

	/**
	 * 
	 * @param �系_���ػ�����
	 * @param ��ȸ���۳�¥
	 * @param ��ȸ��������¥
	 */
	public List<Accident> showAssignedWork(ClaimAdjuster claimAdjuster, Date startDate, Date endDate){
		return null;
	}

	/**
	 * 
	 * @param �������
	 * @param ���
	 */
	public int assignAccidentManager(AccidentManager accidentManager, Accident accident){
		return 0;
	}

	/**
	 * 
	 * @param ���
	 */
	public Customer showAccidentPeopleInformation(Accident accident){
		return null;
	}

	/**
	 * 
	 * @param ���
	 */
	public int acceptAccident(Accident accident){
		return 0;
	}

	/**
	 * 
	 * @param ���ػ�����
	 * @param ���
	 */
	public int assignClaimAdjuster(ClaimAdjuster claimAdjuster, Accident accident){
		return 0;
	}

	/**
	 * 
	 * @param ���
	 * @param �系_���ػ�����
	 */
	public int notifyAssignment(Accident accident, ClaimAdjuster claimAdjuster){
		return 0;
	}

	/**
	 * 
	 * @param ���
	 */
	public int assignOutsideclaimAdjuster(Accident accident){
		return 0;
	}

	/**
	 * 
	 * @param ���
	 */
	public List<AccidentManager> showNearAccidentManager(Accident accident){
		return null;
	}

	/**
	 * 
	 * @param ���
	 * @param ���޾�
	 */
	public int requestInsuranceMoney(Accident accident, int insuranceMoney){
		return 0;
	}

}