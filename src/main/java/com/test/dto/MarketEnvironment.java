package com.test.dto;

import java.io.File;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public class MarketEnvironment {

	private File economyOutlookReport;
	private File currencyCreditPolicyReport;
	
	public File getEconomyOutlookReport() {
		return economyOutlookReport;
	}
	public void setEconomyOutlookReport(File economyOutlookReport) {
		this.economyOutlookReport = economyOutlookReport;
	}
	public File getCurrencyCreditPolicyReport() {
		return currencyCreditPolicyReport;
	}
	public void setCurrencyCreditPolicyReport(File currencyCreditPolicyReport) {
		this.currencyCreditPolicyReport = currencyCreditPolicyReport;
	}

}