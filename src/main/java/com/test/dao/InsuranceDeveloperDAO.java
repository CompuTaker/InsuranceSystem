package com.test.dao;

import com.test.dto.InsuranceDeveloper;
import com.test.dto.InsuranceDeveloperTeam;

/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public interface InsuranceDeveloperDAO {

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