package com.apisero.greenfield;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee("API1", "XYZ", "PQR", 510000.00);
		Employee e1 = new Manager("API1", "XYZ", "PQR", 510000.00, 2000.00);
		Employee e2 = new SalesMan("API1", "XYZ", "PQR", 510000.00, 1000.00);
		System.out.println("Salary is: "+e.calculateSalary());
		System.out.println("Salary is: "+e1.calculateSalary());
		System.out.println("Salary is: "+e2.calculateSalary());
	}

}
