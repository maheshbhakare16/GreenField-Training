package com.apisero.greenfield;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee("API10", "XYZ",21, "PQR", 510000.00);
		Manager e1 = new Manager("API12", "OLM",27, "RYR", 510000.00, 2000.00);
		SalesMan e2 = new SalesMan("API13", "LMN",39, "NTR", 510000.00, 1000.00);
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("Salary is: "+e.calculateSalary());
		System.out.println("Salary is: "+e1.calculateSalary());
		System.out.println("Salary is: "+e2.calculateSalary());
	}

}