package com.test.dao;

import java.util.List;

import com.test.dto.ContractStatistics;
import com.test.dto.Insurance;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public interface ContractStatisticsDAO {

	/**
	 * 
	 * @param ����
	 */
	public List<ContractStatistics> showContractStatistics(Insurance insurance);

}