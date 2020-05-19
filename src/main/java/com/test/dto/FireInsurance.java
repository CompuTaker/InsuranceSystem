package com.test.dto;

import com.test.enumeration.FacilityBusinessType;
import com.test.enumeration.FacilityMaterialType;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
public class FireInsurance extends Contract {

	private FacilityBusinessType joinType;
	private int bargainPrice;
	private float discountRate;
	private float extraChargeRate;
	private FacilityMaterialType fireFacility;

	public FireInsurance(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}