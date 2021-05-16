package com.test.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.dto.Accident;
import com.test.dto.AccidentManager;
import com.test.dto.ClaimAdjuster;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
@Repository
public class AccidentDAOimpl implements AccidentDAO {

	public Accident accident;

	public AccidentDAOimpl(){

	}

	/**
	 * 
	 * @param �系_���ػ�����
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
	public int acceptAccident(Accident accident){
		return 0;
	}

	/**
	 * 
	 * @param ���ػ�����
	 * @param ���
	 */
	public int assignClaimAdjuster(Accident accident, ClaimAdjuster claimAdjuster){
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