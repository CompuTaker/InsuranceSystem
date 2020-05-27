package com.test.dto;

public class VehicleProposal implements Proposal { // extends Proposal
	
	private int vehicleProposalID;
	// VehiclePurpose
	private float forBusinessRate;
	private float ownVehicleRate;
	private float rentalRate;
	// VehicleType
	private float suvRate;
	private float sedanRate;
	private float truckRate;
	private float pickupTruckRate;
	private float busRate;
	private float specialVehicleRate;
	// Proposal
	private String proposalName;
	private byte[] verificationDocuments;
	private int isInternalApproved;
	private int insuranceDeveloperTeamID;
	private String insuranceType;
	private int isExternalApproved;
	private String proposalContent;
	
	public int getVehicleProposalID() {
		return vehicleProposalID;
	}
	public void setVehicleProposalID(int vehicleProposalID) {
		this.vehicleProposalID = vehicleProposalID;
	}
	public float getForBusinessRate() {
		return forBusinessRate;
	}
	public void setForBusinessRate(float forBusinessRate) {
		this.forBusinessRate = forBusinessRate;
	}
	public float getOwnVehicleRate() {
		return ownVehicleRate;
	}
	public void setOwnVehicleRate(float ownVehicleRate) {
		this.ownVehicleRate = ownVehicleRate;
	}
	public float getRentalRate() {
		return rentalRate;
	}
	public void setRentalRate(float rentalRate) {
		this.rentalRate = rentalRate;
	}
	public float getSuvRate() {
		return suvRate;
	}
	public void setSuvRate(float suvRate) {
		this.suvRate = suvRate;
	}
	public float getSedanRate() {
		return sedanRate;
	}
	public void setSedanRate(float sedanRate) {
		this.sedanRate = sedanRate;
	}
	public float getTruckRate() {
		return truckRate;
	}
	public void setTruckRate(float truckRate) {
		this.truckRate = truckRate;
	}
	public float getPickupTruckRate() {
		return pickupTruckRate;
	}
	public void setPickupTruckRate(float pickupTruckRate) {
		this.pickupTruckRate = pickupTruckRate;
	}
	public float getBusRate() {
		return busRate;
	}
	public void setBusRate(float busRate) {
		this.busRate = busRate;
	}
	public float getSpecialVehicleRate() {
		return specialVehicleRate;
	}
	public void setSpecialVehicleRate(float specialVehicleRate) {
		this.specialVehicleRate = specialVehicleRate;
	}
	public String getProposalName() {
		return proposalName;
	}
	public void setProposalName(String proposalName) {
		this.proposalName = proposalName;
	}
	public byte[] getVerificationDocuments() {
		return verificationDocuments;
	}
	public void setVerificationDocuments(byte[] verificationDocuments) {
		this.verificationDocuments = verificationDocuments;
	}
	public int isInternalApproved() {
		return isInternalApproved;
	}
	public void setInternalApproved(int isInternalApproved) {
		this.isInternalApproved = isInternalApproved;
	}
	public int getInsuranceDeveloperTeamID() {
		return insuranceDeveloperTeamID;
	}
	public void setInsuranceDeveloperTeamID(int insuranceDeveloperTeamID) {
		this.insuranceDeveloperTeamID = insuranceDeveloperTeamID;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public int isExternalApproved() {
		return isExternalApproved;
	}
	public void setExternalApproved(int isExternalApproved) {
		this.isExternalApproved = isExternalApproved;
	}
	public String getProposalContent() {
		return proposalContent;
	}
	public void setProposalContent(String proposalContent) {
		this.proposalContent = proposalContent;
	}
	
}
