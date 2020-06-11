package com.test.dao;

import java.util.List;
import java.util.Map;

import com.test.dto.InsuranceDeveloper;
import com.test.dto.InsuranceDeveloperTeam;
import com.test.dto.Salesman;

/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public interface InsuranceDeveloperDAO {
	
	public List<InsuranceDeveloper> login(Map<String, String> loginInfo);

	/**
	 * 
	 * @param ���谳����
	 */
	public int joinInsuranceDeveloper(InsuranceDeveloper insuranceDeveloper);

	/**
	 * 
	 * @param ���谳����
	 */
	public int registerInsuranceDeveloperTeamOnProposal(InsuranceDeveloperTeam insuranceDeveloperTeam);

}