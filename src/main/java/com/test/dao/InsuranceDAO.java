package com.test.dao;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.dto.Insurance;
import com.test.dto.Proposal;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
@Repository
public interface InsuranceDAO {

	public Insurance showInsuranceDetail(int insuranceID);

	abstract public List<Insurance> showAllInsurance();

	/**
	 * 
	 * @param ����
	 */
	public File showCondition(Insurance insurance);
	
}