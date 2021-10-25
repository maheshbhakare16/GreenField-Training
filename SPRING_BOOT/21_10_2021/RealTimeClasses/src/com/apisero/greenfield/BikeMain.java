package com.apisero.greenfield;

public class BikeMain {

	public static void main(String[] args) {
		
		Bike pulsur = new Bike("MH12BH1234", "qwer2345rtyu", "XYZ", "21-10-2021");
		System.out.println("Bike Owner Name: "+pulsur.getOwner_Name());
		System.out.println(pulsur);
	}

}
