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

	public Insurance showInsuranceDetail();

	/**
	 * 
	 * @param ����ID
	 */
	public List<Insurance> showAllInsurance(Insurance insurance);

	/**
	 * 
	 * @param ����
	 */
	public File showCondition(Insurance insurance);
	
}