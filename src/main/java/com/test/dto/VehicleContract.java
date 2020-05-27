package com.test.dto;

import java.util.List;

import com.test.enumeration.VehiclePurpose;
import com.test.enumeration.VehicleType;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class VehicleContract extends Contract {

	private int objectCompansationMoney;
	private int noAccidentHistory;
	private float drivingHistory;
	private int drivingPenalty;
	private String vehicleNumber;
	private List<String> vehicleAccidentHistory;
	private VehiclePurpose vehiclePurpose;
	private VehicleType vehicleType;
	
	public int getObjectCompansationMoney() {
		return objectCompansationMoney;
	}
	public void setObjectCompansationMoney(int objectCompansationMoney) {
		this.objectCompansationMoney = objectCompansationMoney;
	}
	public int getNoAccidentHistory() {
		return noAccidentHistory;
	}
	public void setNoAccidentHistory(int noAccidentHistory) {
		this.noAccidentHistory = noAccidentHistory;
	}
	public float getDrivingHistory() {
		return drivingHistory;
	}
	public void setDrivingHistory(float drivingHistory) {
		this.drivingHistory = drivingHistory;
	}
	public int getDrivingPenalty() {
		return drivingPenalty;
	}
	public void setDrivingPenalty(int drivingPenalty) {
		this.drivingPenalty = drivingPenalty;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public List<String> getVehicleAccidentHistory() {
		return vehicleAccidentHistory;
	}
	public void setVehicleAccidentHistory(List<String> vehicleAccidentHistory) {
		this.vehicleAccidentHistory = vehicleAccidentHistory;
	}
	public VehiclePurpose getVehiclePurpose() {
		return vehiclePurpose;
	}
	public void setVehiclePurpose(VehiclePurpose vehiclePurpose) {
		this.vehiclePurpose = vehiclePurpose;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

}