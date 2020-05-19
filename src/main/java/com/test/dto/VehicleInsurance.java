package com.test.dto;

import java.util.List;

import com.test.enumeration.VehiclePurpose;
import com.test.enumeration.VehicleType;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class VehicleInsurance extends Contract {

	private int objectCompansationMoney;
	private int noAccidentHistory;
	private float drivingHistory;
	private int drivingPenalty;
	private String vehicleNumber;
	private List<String> vehicleAccidentHistory;
	private VehiclePurpose vehiclePurpose;
	private VehicleType vehicleType;

	public VehicleInsurance(){

	}

}