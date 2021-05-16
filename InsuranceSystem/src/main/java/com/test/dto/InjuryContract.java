package com.test.dto;


/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class InjuryContract extends Contract {

	private int injuryCoverage;
	private int illCoverage;
	
	public int getInjuryCoverage() {
		return injuryCoverage;
	}
	public void setInjuryCoverage(int injuryCoverage) {
		this.injuryCoverage = injuryCoverage;
	}
	public int getIllCoverage() {
		return illCoverage;
	}
	public void setIllCoverage(int illCoverage) {
		this.illCoverage = illCoverage;
	}

}