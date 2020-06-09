package com.test.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

import com.test.dto.FireProposal;
import com.test.dto.InjuryProposal;
import com.test.dto.Proposal;
import com.test.dto.VehicleProposal;

public class UnderwritingTestStub {

	public float calculateRate(Proposal proposal, String whichInsurance, HashMap<String, Object> rmap) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		float rate = 1;
		
		if(whichInsurance.equals("fire")) {
			// System.out.println("+++++" + whichInsurance);
			
			FireProposal prop = (FireProposal) proposal;
			
			Class cls = prop.getClass();
			Method [] methodList = cls.getDeclaredMethods();
			
			for(Object oneAttribute : rmap.values()) {
				for(Method oneMethod : methodList) {
					// System.out.println("~~~~" + oneMethod.getName().toLowerCase());
					// System.out.println("!!!!" + oneAttribute.toString().toLowerCase());
					if( ((oneMethod.getName()).toLowerCase()).contains("get" + (oneAttribute.toString()).toLowerCase() + "rate") ) {
						try {
							Object result = oneMethod.invoke(prop, null);
							if(result != null) {
								float res = (float) result;
								rate = rate * res;
								System.out.println("@@ => " + res);
							}else {
								System.out.println("result nullllllllllllllll");
							}
						} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					}
				} // for() methodList // methods
			} // for() rmap.values() // attributes
		}else if(whichInsurance.equals("injury")) {
			InjuryProposal prop = (InjuryProposal) proposal;
			
			Class cls = prop.getClass();
			Method [] methodList = cls.getDeclaredMethods();
			
			for(Object oneAttribute : rmap.values()) {
				for(Method oneMethod : methodList) {
					if( ((oneMethod.getName()).toLowerCase()).contains("get" + (oneAttribute.toString()).toLowerCase() + "rate") ) {
						try {
							Object result = oneMethod.invoke(prop, null);
							if(result != null) {
								float res = (float) result;
								rate = rate * res;
							}
						} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					}
				} // for() methodList // methods
			} // for() rmap.values() // attributes
		}else if(whichInsurance.equals("vehicle")) {
			VehicleProposal prop = (VehicleProposal) proposal;

			Class cls = prop.getClass();
			Method [] methodList = cls.getDeclaredMethods();
			
			for(Object oneAttribute : rmap.values()) {
				for(Method oneMethod : methodList) {
					if( ((oneMethod.getName()).toLowerCase()).contains("get" + (oneAttribute.toString()).toLowerCase() + "rate") ) {
						try {
							Object result = oneMethod.invoke(prop, null);
							if(result != null) {
								float res = (float) result;
								rate = rate * res;
							}
						} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					}
				} // for() methodList // methods
			} // for() rmap.values() // attributes
		}else {
			rate = -2;
		}
		
		return rate;
	}
	
}
