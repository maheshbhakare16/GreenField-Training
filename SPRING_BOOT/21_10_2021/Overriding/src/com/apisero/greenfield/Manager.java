package com.apisero.greenfield;

public class Manager extends Employee {
	private double bonus;

	public Manager(String id, String name, String address, double salary, double bonus) {
		super(id, name, address, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double calculateSalary() {
		return this.getSalary() + bonus;
	}

}
