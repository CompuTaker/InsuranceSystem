package com.test.dao;

import java.util.Date;
import java.util.List;

import com.test.dto.Accident;
import com.test.dto.AccidentManager;
import com.test.dto.ClaimAdjuster;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public interface AccidentDAO {

	/**
	 * 
	 * @param �系_���ػ�����
	 * @param ��ȸ���۳�¥
	 * @param ��ȸ��������¥
	 */
	public List<Accident> showAssignedWork(ClaimAdjuster claimAdjuster, Date startDate, Date endDate);

	/**
	 * 
	 * @param �������
	 * @param ���
	 */
	public int assignAccidentManager(AccidentManager accidentManager, Accident accident);

	/**
	 * 
	 * @param ���
	 */
	public int acceptAccident(Accident accident);

	/**
	 * 
	 * @param ���
	 * @param �系_���ػ�����
	 */
	public int assignClaimAdjuster(Accident accident, ClaimAdjuster claimAdjuster);

	/**
	 * 
	 * @param ���
	 */
	public int assignOutsideclaimAdjuster(Accident accident);

	/**
	 * 
	 * @param ���
	 */
	public List<AccidentManager> showNearAccidentManager(Accident accident);

	/**
	 * 
	 * @param ���
	 * @param ���޾�
	 */
	public int requestInsuranceMoney(Accident accident, int insuranceMoney);

}