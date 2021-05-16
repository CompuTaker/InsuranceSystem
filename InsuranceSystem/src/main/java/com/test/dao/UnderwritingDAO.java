package com.test.dao;

import com.test.dto.MarketEnvironment;
import com.test.dto.UnderWriter;
import com.test.dto.UnderwritingGuideline;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public interface UnderwritingDAO {

	public MarketEnvironment showMarketEnvironment();

	/**
	 * 
	 * @param ���������ID
	 */
	public UnderWriter showOneUnderWriterByID(int underwriterID);

	public UnderwritingGuideline showUnderwritingGuideline();

}