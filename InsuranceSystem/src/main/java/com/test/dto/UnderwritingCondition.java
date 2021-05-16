package com.test.dto;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class UnderwritingCondition {

	private MarketEnvironment marketEnvironment;
	private UnderwritingGuideline underwritingGuideline;
	
	public MarketEnvironment getMarketEnvironment() {
		return marketEnvironment;
	}
	public void setMarketEnvironment(MarketEnvironment marketEnvironment) {
		this.marketEnvironment = marketEnvironment;
	}
	public UnderwritingGuideline getUnderwritingGuideline() {
		return underwritingGuideline;
	}
	public void setUnderwritingGuideline(UnderwritingGuideline underwritingGuideline) {
		this.underwritingGuideline = underwritingGuideline;
	}
	
}