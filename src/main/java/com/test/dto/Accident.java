package com.test.dto;

import java.io.File;
import java.util.Date;

import com.test.enumeration.AccidentType;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
public class Accident {

	private int customerID;
	private int accidentID;
	private String accidentCause;
	private String accidentPeopleInformation;
	private Date accidentDate;
	private int accidentManagerID;
	private String accidentLocation;
	private AccidentType accidentType;
	private File accidentPhoto;
	private int claimAdjusterID;
	private int requestedInsuranceMoney;
	private String damageScale;
	public ClaimAdjuster claimAdjuster;
	public AccidentManager accidentManager;

	public Accident(){

	}

}