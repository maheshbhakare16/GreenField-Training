package com.apisero.greenfield;

public class Assignment2 {

	public static void main(String[] args) {
		String s = new String("ABC");
		System.out.println("Accepted String is: "+s);//calls to string method to print string which is overrided from object class to string class
		System.out.println("Hashcode of String is: "+s.hashCode());
		System.out.println("\n---------------------------------------------\n");
		StringBuffer sb = new StringBuffer("Google");
		System.out.println("Accepted String is: "+sb);
		System.out.println("Hashcode of String is: "+sb.hashCode());
		System.out.println("\n---------------------------------------------\n");
		StringBuilder sbb = new StringBuilder("Village");
		System.out.println("Accepted String is: "+sbb);
		System.out.println("Hashcode of String is: "+sbb.hashCode());
	}

}
