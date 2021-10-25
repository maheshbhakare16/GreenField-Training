package com.apisero.greenfield;

public class BankMain {

	public static void main(String[] args) {
		BankAccount.setBank_name("ICICI Bank Pvt. Ltd");
		BankAccount mahesh = new BankAccount("123245671234","Mahesh Bhakare","ICIC0002345","Kopargaon",1000.00f);
		System.out.print("Initial Status: ");
		System.out.println(mahesh);
		System.out.println();
		mahesh.withdraw(500.00f);
		System.out.print("Status after withdraw: ");
		System.out.println(mahesh);
		System.out.println();
		mahesh.diposit(5000);
		System.out.print("Status after diposit: ");
		System.out.println(mahesh);		
	}

}
