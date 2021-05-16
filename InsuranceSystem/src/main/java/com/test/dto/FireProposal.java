package com.test.dto;

public class FireProposal implements Proposal { // extends Proposal
	
	private int fireProposalID;
	private float housingRate;
	private float pubRate;
	private float restaurantRate;
	private float sportFacilityRate;
	private float PCRoomRate;
	private float swimmingPoolRate;
	private float researchFacilityRate;
	private float industryFacilityRate;
	private float agriculturalFacilityRate;
	private float chemistryFacilityRate;
	private float woodenHouseRate; // 1.3
	private float koreanHouseRate; // 1.1
	private float westernHouseRate; // 1.0
	private float firePreventionFacilityRate;
	private float vinylHouseRate;
	// Proposal
	private String proposalName;
	private byte[] verificationDocuments;
	private int isInternalApproved;
	private int insuranceDeveloperTeamID;
	private String insuranceType;
	private int isExternalApproved;
	private String proposalContent;
	
	public int getFireProposalID() {
		return fireProposalID;
	}
	public void setFireProposalID(int fireProposalID) {
		this.fireProposalID = fireProposalID;
	}
	public float getHousingRate() {
		return housingRate;
	}
	public void setHousingRate(float housingRate) {
		this.housingRate = housingRate;
	}
	public float getPubRate() {
		return pubRate;
	}
	public void setPubRate(float pubRate) {
		this.pubRate = pubRate;
	}
	public float getRestaurantRate() {
		return restaurantRate;
	}
	public void setRestaurantRate(float restaurantRate) {
		this.restaurantRate = restaurantRate;
	}
	public float getSportFacilityRate() {
		return sportFacilityRate;
	}
	public void setSportFacilityRate(float sportFacilityRate) {
		this.sportFacilityRate = sportFacilityRate;
	}
	public float getPCRoomRate() {
		return PCRoomRate;
	}
	public void setPCRoomRate(float pCRoomRate) {
		PCRoomRate = pCRoomRate;
	}
	public float getSwimmingPoolRate() {
		return swimmingPoolRate;
	}
	public void setSwimmingPoolRate(float swimmingPoolRate) {
		this.swimmingPoolRate = swimmingPoolRate;
	}
	public float getResearchFacilityRate() {
		return researchFacilityRate;
	}
	public void setResearchFacilityRate(float researchFacilityRate) {
		this.researchFacilityRate = researchFacilityRate;
	}
	public float getIndustryFacilityRate() {
		return industryFacilityRate;
	}
	public void setIndustryFacilityRate(float industryFacilityRate) {
		this.industryFacilityRate = industryFacilityRate;
	}
	public float getAgriculturalFacilityRate() {
		return agriculturalFacilityRate;
	}
	public void setAgriculturalFacilityRate(float agriculturalFacilityRate) {
		this.agriculturalFacilityRate = agriculturalFacilityRate;
	}
	public float getChemistryFacilityRate() {
		return chemistryFacilityRate;
	}
	public void setChemistryFacilityRate(float chemistryFacilityRate) {
		this.chemistryFacilityRate = chemistryFacilityRate;
	}
	public float getWoodenHouseRate() {
		return woodenHouseRate;
	}
	public void setWoodenHouseRate(float woodenHouseRate) {
		this.woodenHouseRate = woodenHouseRate;
	}
	public float getKoreanHouseRate() {
		return koreanHouseRate;
	}
	public void setKoreanHouseRate(float koreanHouseRate) {
		this.koreanHouseRate = koreanHouseRate;
	}
	public float getWesternHouseRate() {
		return westernHouseRate;
	}
	public void setWesternHouseRate(float westernHouseRate) {
		this.westernHouseRate = westernHouseRate;
	}
	public float getFirePreventionFacilityRate() {
		return firePreventionFacilityRate;
	}
	public void setFirePreventionFacilityRate(float firePreventionFacilityRate) {
		this.firePreventionFacilityRate = firePreventionFacilityRate;
	}
	public float getVinylHouseRate() {
		return vinylHouseRate;
	}
	public void setVinylHouseRate(float vinylHouseRate) {
		this.vinylHouseRate = vinylHouseRate;
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
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	
}
