package com.test.dto;

import java.io.File;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public class UnderwritingGuideline {

	private File guidelineForHealth;
	private File guidelineForAccident;
	private File guidelineForCredit;
	private File guidelineForDisease;
	
	public File getGuidelineForHealth() {
		return guidelineForHealth;
	}
	public void setGuidelineForHealth(File guidelineForHealth) {
		this.guidelineForHealth = guidelineForHealth;
	}
	public File getGuidelineForAccident() {
		return guidelineForAccident;
	}
	public void setGuidelineForAccident(File guidelineForAccident) {
		this.guidelineForAccident = guidelineForAccident;
	}
	public File getGuidelineForCredit() {
		return guidelineForCredit;
	}
	public void setGuidelineForCredit(File guidelineForCredit) {
		this.guidelineForCredit = guidelineForCredit;
	}
	public File getGuidelineForDisease() {
		return guidelineForDisease;
	}
	public void setGuidelineForDisease(File guidelineForDisease) {
		this.guidelineForDisease = guidelineForDisease;
	}
	
}