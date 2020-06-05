package com.test.dao;

import java.io.File;
import java.util.List;

import com.test.dto.Insurance;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public interface InsuranceDAO {
	
	abstract public Insurance showInsuranceDetail(int insuranceID);

	abstract public List<Insurance> showAllInsurance();
	
	abstract public int getProprosalID(int insuranceID);

	/**
	 * 
	 * @param ����
	 */
	abstract public File showCondition(Insurance insurance);
	
}