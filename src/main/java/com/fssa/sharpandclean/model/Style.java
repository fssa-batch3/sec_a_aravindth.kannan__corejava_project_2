package com.fssa.sharpandclean.model;

public class Style {
	
	private String haircutName;
	private String haircutEmail;
	private String haircutType;
	private String haircutAbout;
	private String haircutUrl;
	private int haircutId;
	private int isDeleted;
	
	public Style(String haircutName, String haircutEmail, String haircutType, String haircutAbout,
			String haircutUrl) {
		this.haircutName = haircutName;
		this.haircutEmail = haircutEmail;
		this.haircutType = haircutType;
		this.haircutAbout = haircutAbout;
		this.haircutUrl = haircutUrl;
		
	}
	
	public Style(int haircutId, String haircutName, String haircutEmail, String haircutType,
			String haircutAbout, String haircutUrl) {
		this.haircutName = haircutName;
		this.haircutEmail = haircutEmail;
		this.haircutType = haircutType;
		this.haircutAbout = haircutAbout;
		this.haircutUrl = haircutUrl;
		this.haircutId= haircutId;
	}

	public Style() {
		super();
	}

	public String getHaircutName() {
		return haircutName;
	}
	public void setHaircutName(String haircutName) {
		this.haircutName = haircutName;
	}
	public String getHaircutEmail() {
		return haircutEmail;
	}
	public void setHaircutEmail(String haircutEmail) {
		this.haircutEmail = haircutEmail;
	}
	public String getHaircutType() {
		return haircutType;
	}
	public void setHaircutType(String haircutType) {
		this.haircutType = haircutType;
	}
	public String getHaircutAbout() {
		return haircutAbout;
	}
	public void setHaircutAbout(String haircutAbout) {
		this.haircutAbout = haircutAbout;
	}
	public String getHaircutUrl() {
		return haircutUrl;
	}
	public void setHaircutUrl(String haircutUrl) {
		this.haircutUrl = haircutUrl;
	}
	
	public int getHaircutId() {
		return haircutId;
	}

	public void setHaircutId(int haircutId) {
		this.haircutId = haircutId;
	}

	public int getisDeleted() {
		return isDeleted;
	}

	public void setDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "HairService [haircutName=" + haircutName + ", haircutEmail=" + haircutEmail + ", haircutType="
				+ haircutType + ", haircutAbout=" + haircutAbout + ", haircutUrl=" + haircutUrl + "]";
	}

	
	
	
	
	
}
