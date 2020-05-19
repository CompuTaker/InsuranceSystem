package com.test.dto;

import com.test.enumeration.AccidentType;

/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public class AccidentHistory {

	private int accidentDate;
	private AccidentType accidentType;
	private int accidentCount;
	
	public int getAccidentDate() {
		return accidentDate;
	}
	public void setAccidentDate(int accidentDate) {
		this.accidentDate = accidentDate;
	}
	public AccidentType getAccidentType() {
		return accidentType;
	}
	public void setAccidentType(AccidentType accidentType) {
		this.accidentType = accidentType;
	}
	public int getAccidentCount() {
		return accidentCount;
	}
	public void setAccidentCount(int accidentCount) {
		this.accidentCount = accidentCount;
	}
	
}