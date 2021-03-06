package com.apisero.greenfield;

public class Employee extends Person {
	private String id;
	private double salary;

	public Employee(String id, String name, int age, String address, double salary) {
		super(name, age, address);
		this.id = id;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double calculateSalary() {
		return salary;
	}

	@Override
	public String toString() {

		return "Employee [" + super.toString() + "id=" + id + ", salary=" + salary + "]";
	}

}
