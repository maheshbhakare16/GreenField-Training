package com.apisero.greenfield;

public class Bike {
	private String Bike_no;
	private String Chassis_no;
	private String Owner_Name;
	private String Ownned_Date;
	
	public Bike(String bike_no, String chassis_no, String owner_Name, String ownned_Date) {
		super();
		Bike_no = bike_no;
		Chassis_no = chassis_no;
		Owner_Name = owner_Name;
		Ownned_Date = ownned_Date;
	}
	
	
	public String getBike_no() {
		return Bike_no;
	}
	public void setBike_no(String bike_no) {
		Bike_no = bike_no;
	}
	public String getChassis_no() {
		return Chassis_no;
	}
	public void setChassis_no(String chassis_no) {
		Chassis_no = chassis_no;
	}
	public String getOwner_Name() {
		return Owner_Name;
	}
	public void setOwner_Name(String owner_Name) {
		Owner_Name = owner_Name;
	}
	public String getOwnned_Date() {
		return Ownned_Date;
	}
	public void setOwnned_Date(String ownned_Date) {
		Ownned_Date = ownned_Date;
	}
	
	@Override
	public String toString() {
		return "Bike [getBike_no()=" + getBike_no() + ", getChassis_no()=" + getChassis_no() + ", getOwner_Name()="
				+ getOwner_Name() + ", getOwnned_Date()=" + getOwnned_Date() + "]";
	}
	
	
}
