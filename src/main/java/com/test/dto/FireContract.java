package com.test.dto;

import com.test.enumeration.FacilityBusinessType;
import com.test.enumeration.FacilityMaterialType;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class FireContract extends Contract {
	
	
	
	private FacilityBusinessType joinType;
	private int bargainPrice;
	private float discountRate;
	private float extraChargeRate;
	private FacilityMaterialType fireFacility;
	
	public FacilityBusinessType getJoinType() {
		return joinType;
	}
	public void setJoinType(FacilityBusinessType joinType) {
		this.joinType = joinType;
	}
	public int getBargainPrice() {
		return bargainPrice;
	}
	public void setBargainPrice(int bargainPrice) {
		this.bargainPrice = bargainPrice;
	}
	public float getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}
	public float getExtraChargeRate() {
		return extraChargeRate;
	}
	public void setExtraChargeRate(float extraChargeRate) {
		this.extraChargeRate = extraChargeRate;
	}
	public FacilityMaterialType getFireFacility() {
		return fireFacility;
	}
	public void setFireFacility(FacilityMaterialType fireFacility) {
		this.fireFacility = fireFacility;
	}

}