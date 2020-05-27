package com.test.dto;

import java.util.Date;

/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public class SeniorActuary extends InsuranceInternalApprover {

	private Date appointmentStartDate;
	private Date appointmentEndDate;
	
	public Date getAppointmentStartDate() {
		return appointmentStartDate;
	}
	public void setAppointmentStartDate(Date appointmentStartDate) {
		this.appointmentStartDate = appointmentStartDate;
	}
	public Date getAppointmentEndDate() {
		return appointmentEndDate;
	}
	public void setAppointmentEndDate(Date appointmentEndDate) {
		this.appointmentEndDate = appointmentEndDate;
	}
	
}